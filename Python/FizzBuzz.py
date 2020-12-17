def fizzBuzzFunction(number):
	if number % 3 == 0 and number % 5 == 0:
		return "FizzBuzz"
	elif number % 3 == 0:
		return "Fizz"
	elif number % 5 == 0:
		return "Buzz"
	else:
		return str(number)


def main():
	print(f"{fizzBuzzFunction(3)}")


if __name__ == "__main__":
	main()