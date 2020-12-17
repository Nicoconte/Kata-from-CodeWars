def DNA_strand(dna):
    new_dna = ""
    
    for char in dna:
        if char == "A":
            new_dna += "T"
        elif char == "T":
            new_dna += "A"
        elif char == "C":
            new_dna += "G"
        elif char == "G":
            new_dna += "C"
    
    return new_dna