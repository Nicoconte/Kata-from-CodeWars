def to_underscore(string):
    return str(string) if type(string) == int else string[0].lower() + "".join(["_" + string[i].lower() if string[i].isupper() else string[i] for i in range(1, len(string))])

if __name__ == "__main__":
    print(f"underscore => {to_underscore('AguanteElPascalCaseViejaNoMeImportaNada')}")