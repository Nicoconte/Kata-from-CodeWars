def revertir_palabra(palabra):
	return palabra[::-1]

def revertir_oracion(oracion):
	separadores = [",", ";", " "]

	salida = ""
	contenedor_de_str = ""
	longitud_oracion = len(oracion) - 1

	for caracter in oracion:
		if caracter in separadores:
			salida += revertir_palabra(contenedor_de_str) + caracter
			contenedor_de_str = ""
		else:
			contenedor_de_str += caracter
			if longitud_oracion == 0:
				salida += revertir_palabra(contenedor_de_str)

		longitud_oracion -= 1

	return salida

def main():
	test = "this,sentence is; ;very;normal;;;;;;  ,"

	print(f"Salida => {revertir_oracion(test)}")

if __name__ == "__main__":
	main()