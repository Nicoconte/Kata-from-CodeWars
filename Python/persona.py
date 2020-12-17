'''
Crear un script llamado **personas.py** que lea los datos de un fichero de texto, que transforme cada fila en un diccionario y lo añada a una lista llamada personas. Luego recorre las personas de la lista y para cada una muestra de forma amigable todos sus campos.
El fichero de texto se denominará **personas.txt** y tendrá el siguiente contenido en texto plano (créalo previamente):
```python
1;Carlos;Pérez;05/01/1989
2;Manuel;Heredia;26/12/1973
3;Rosa;Campos;12/06/1961
4;David;García;25/07/2006
```
Los campos del diccionario serán por orden:
**id**, **nombre, apellido** y **nacimiento**.
'''

def get_file_content(file_path):
    file = None
    content = []

    try:
        file = open(file_path, mode="r+", encoding="utf8")

        for line in file:
            content.append(line.strip("\n").split(";"))
    except:
        print(f"No se pudo abrir el archivo => {file}")

    finally:
        if file != None:
            file.close()
    
    return content

def create_dictionary():
    content = get_file_content('personas.txt')
    dict_aux = []
    people = []

    for line in content:
        dict_aux.append([("id", line[0]), ("nombre", line[1]), ("apellido", line[2]), ("nacimiento", line[3])])

    for tup in dict_aux:
        people.append(dict(tup))

    return people

def report_dictionary(list_of_dictionaries):
    for dictionary in list_of_dictionaries:
        print(dictionary)

def main():
    report_dictionary( create_dictionary() )

if __name__ == "__main__":
    main()