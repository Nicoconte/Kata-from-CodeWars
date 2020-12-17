
def scramble_first_solution(str_1, str_2):
    output = ["" for i in range(len(str_2))]

    set_of_str = set(str_1)

    for i in range(len(str_2)):
        if str_2[i] in set_of_str:
            output[i] = str_2[i]

    print(output)

    return True if "".join(output) == str_2 else False


def scramble_second_solution(str_1, str_2):
    for c in set(str_2):
        if str_1.count(c) < str_2.count(c):
            return False
    return True 

def main():
    print(f"Resultado => { scramble_first_solution('aabbcamaomsccdd', 'commas') } ")

    print(f"Resultado => { scramble_second_solution('aabbcamaomsccdd', 'commas') } ")


if __name__ == "__main__":
    main()