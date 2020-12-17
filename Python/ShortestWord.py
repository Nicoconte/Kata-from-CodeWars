def find_short(s):
    words = s.split(" ")
    min = len(words[0])
    
    for word in words:
        if len(word) < min:
            min = len(word)
    
    return min