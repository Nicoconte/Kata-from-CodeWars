"""
Given: an array containing hashes of names

Return: a string formatted as a list of names separated by commas except for the last two names,
which should be separated by an ampersand.

"""


def namelist(names):
    arr = [name['name'] for name in names]
            
    if len(arr) == 1: return "".join(arr)
    
    last_index = None
    str_container = "".join([f"& {arr[i]}" if i == len(arr) - 1 else f"{arr[i]}, " for i in range(len(arr))])
    last_index = str_container.rfind(",")    
    str_container = str_container[:last_index] + "" + str_container[last_index+1:]
    
    return str_container


def main():
	names([ {'name': 'Bart'}, {'name': 'Lisa'}, {'name': 'Maggie'} ])
	print(namelist(names))

if __name__ == "__main__":
	main()