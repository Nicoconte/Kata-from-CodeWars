"""
Write an algorithm that takes an array and moves all of the zeros to the end, 
preserving the order of the other elements.

"""

def moveZeros(arr):
    
    new_arr = []
    zeros = []

    for e in arr:
        if e != 0 or type(e) == bool:
            new_arr.append(e)
        else:
            zeros.append(e)
    
    new_arr.extend(zeros)
    
    return new_arr

def main():
    vector = moveZeros([False,1,0,1,2,0,1,3,"a"])

    print(f"Respuesta => {vector}")

if __name__ == "__main__":
    main()