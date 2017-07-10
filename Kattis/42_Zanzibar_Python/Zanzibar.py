num = int(input())

for _ in range(num):
    diff = 0
    prev = 1
    for a in [int(n) for n in input().split()[:-1]]:
        if a > prev * 2:
            diff += a - (prev * 2)
        prev = a
    print(diff)
