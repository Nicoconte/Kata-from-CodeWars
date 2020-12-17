
def solution(str):
    result = []
    str = list(str)
    for b in range(0,len(str)):
        if str[b] != " ":
            temp = []
            for i in range(0, len(str)):
                if i == b:
                    temp.append(str[i].upper())
                else:
                    temp.append(str[i])
            result.append("".join(temp))
    return result

def main():
	print(f"solucion => {solution('hello')}")

if __name__ == "__main__":
	main()