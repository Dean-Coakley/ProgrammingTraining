N = 1
while N != 0:
    N = int(input())
    sum1 = 0
    for a in range(1, N):
        sum1 += int(a)
        print(sum1)
    if sum1 > 10 and len(str(sum1)) == len(str(N)):
        print(sum1)
        N = input()
