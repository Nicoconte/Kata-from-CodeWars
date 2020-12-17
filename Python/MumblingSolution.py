
def solution(string):
	str_container = ""
	loop = 1

	for char in string:
		str_container += char.upper()
		for c in range(loop - 1):
			str_container += char.lower()

		str_container += "-"
		loop += 1

	return str_container[0 : len(str_container) - 1 : 1]


def test(actual, expected):
	return actual == expected

def main():
	kata = solution("HbideVbxncC")
	output = test(kata, "H-Bb-Iii-Dddd-Eeeee-Vvvvvv-Bbbbbbb-Xxxxxxxx-Nnnnnnnnn-Cccccccccc-Ccccccccccc")

	print(f"Output => {output}")


if __name__ == "__main__":
	main()