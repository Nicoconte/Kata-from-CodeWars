def high_and_low(numbers):
    chars = numbers.split(" ")
    nums = [int(c) for c in chars]
            
    return str(max(nums)) + " " + str(min(nums))