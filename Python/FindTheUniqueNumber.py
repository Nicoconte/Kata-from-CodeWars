def find_uniq(arr):
    n = 0
    arr.sort()
    
    if arr[0] < arr[len(arr) - 1] and arr[0] < arr[len(arr)-2]:
        n = arr[0]
    else:
        n = arr[len(arr) - 1]
    
    return n