a, b = [int(a) for a in input().split()]
while a != 0 and b != 0:
    num = int(a / b)
    rem = a % b
    print(num, rem, "/", b)
    a, b = [int(a) for a in input().split()]
