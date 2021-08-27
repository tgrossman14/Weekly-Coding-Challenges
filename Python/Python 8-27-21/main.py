def collatz(num):
    steps = 0
    while num != 1:
        if num % 2 == 0:
            num = num / 2
            steps = steps + 1
        else:
            num = num * 3 + 1
            steps = steps + 1
        num = int(num)
    return steps


def tester(a, b):
    a = collatz(a)
    b = collatz(b)
    if b < a:
        return "b"
    else:
        return "a"


# Press the green button in the gutter to run the script.
if __name__ == '__main__':
    j = int(input("First int: "))
    k = int(input("Second int: "))
    print(tester(j, k))
