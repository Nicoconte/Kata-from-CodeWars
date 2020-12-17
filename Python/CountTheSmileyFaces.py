def count_smileys(arr):
    smiley_count = 0
    for e in arr:
      if valid(e):
        smiley_count += 1
    return smiley_count

def valid(i):
    if i[0] != ':' and i[0] != ';':
      return False
    if len(i) == 3 and i[1] != '-' and i[1] != '~':
      return False
    if len(i) == 3 and i[2] != ')' and i[2] != 'D':
      return False
    if len(i) == 2 and i[1] != ')' and i[1] != 'D':
      return False
    return True