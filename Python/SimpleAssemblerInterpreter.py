def obtener_registros(instrucciones_entrada, instrucciones_a_ejecutar):
    registros = {} #Guardamos las variables como clave-valor
    diccionario_aux = [] #Guardamos las tuplas con las variables y su valor
    pila_instrucciones = [] #Instrucciones como Matriz

    #Separar por instruccion, variable y valor
    for instruccion in instrucciones_entrada:
        pila_instrucciones.append(instruccion.split(" "))

    #Obtenemos y aislamos el nombre de la variable. La misma pasa a guardarse en una lista como tupla 
    for instruccion in pila_instrucciones:
        for elemento in instruccion:
            if elemento not in instrucciones_a_ejecutar and not elemento.lstrip("-").isdigit():
                diccionario_aux.append([(elemento, 0)])
    
    #Cada valor de la lista ([tupla]) pasa a ser parte del diccionario
    for diccionario in diccionario_aux:
        registros.update(dict(diccionario))

    return registros, pila_instrucciones

def gestionar_instrucciones(ins, registros, instrucciones_en_memoria):
    
    #print(f"Registros en el gestor => {registros} | {ins}")

    print(f"Instruccion -> {ins}")
    if ins[0] == "mov":
        registros, instrucciones_en_memoria = transferir_datos(ins[1], ins[2], registros, instrucciones_en_memoria)

    elif ins[0] == "dec":
        registros, instrucciones_en_memoria = decrecer_registro(ins[1], registros, instrucciones_en_memoria)

    elif ins[0] == "inc":
        registros, instrucciones_en_memoria = incrementar_registro(ins[1], registros, instrucciones_en_memoria)

    elif ins[0] == "jnz":
        print(f"Clave ->")

        registros, instrucciones_en_memoria = retornar_instruccion(ins[2], "a", registros, instrucciones_en_memoria)
    
    return registros, instrucciones_en_memoria


def transferir_datos(destino, valor, registros, memoria):
    registros[destino] = int(valor) if valor.isdigit() else int(registros[valor])
    memoria.append("mov")
    return registros, memoria

def incrementar_registro(clave, registro, memoria):
    registro[clave] = registro[clave] + 1
    memoria.append("inc")
    return registro, memoria

def decrecer_registro(clave, registro, memoria):
    registro[clave] = registro[clave] - 1
    memoria.append("dec")
    return registro, memoria

def retornar_instruccion(indice, valor, registros, memoria):
    registros, memoria = gestionar_instrucciones([memoria[int(indice)], valor], registros, memoria)
    memoria.append("jnz") 
    return registros, memoria

def interpretar_assembler(instrucciones, registros):
    instruccion_ejecutada = [] #Registro de instrucciones 

    for instruccion in instrucciones:
        registros, instruccion_ejecutada = gestionar_instrucciones(instruccion, registros, instruccion_ejecutada)

    print(f"\nInstrucciones realizadas => {instruccion_ejecutada}\n\nRegistros despues de la ejecucion => {registros}")


def test():
    #mov -> Transferencia de datos entre registros de procesador o registro y memoria. 
    #dec -> Decrece un registro "x" en 1
    #inc -> Aumenta un registro "x" en 1
    entradas = '''\
mov a 13
inc a
dec a
inc a
jnz a -2
dec a
mov b 32
jnz a -7
dec b
dec b
dec b
jnz a -11
mov c 3
dec c'''
    
    instrucciones_validas = ["mov", "dec", "inc", "jnz"] #El sistema solo ejecutara estas instrucciones

    registros, instrucciones_apiladas = obtener_registros(entradas.splitlines(), instrucciones_validas)

    interpretar_assembler(instrucciones_apiladas, registros)

"""
Proximas caracteristicas a implementar:
    - Modularizacion de codigo:
        * Gestor de errores
        * Gestor de Operaciones
        * Operaciones independientes
        * Implementar instruccion "jnz <registro> <indice>" -> similar al goto 

    - Mejorar:
        * Manejo de errores -> Validacion de instrucciones
        * Sacar los numeros magicos "hardcodeados" como "instruccion[0]" -> dinamico
"""


def main():
    test()

if __name__ == "__main__":
    main()
