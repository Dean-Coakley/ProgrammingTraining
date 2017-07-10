k = int(input())

for _ in range(k):
    a = input()
    b = input()
    print(a)
    print(b)
    for c in a:
        if a[0] == b[0]:
            print(".", end="")
        else:
            print("*", end="")

        a = a[1:]
        b = b[1:]
    print("\n")
