from collections import Counter

N = int(input())
for i in range(N):
    guests = int(input())
    dat = [int(a) for a in input().split()]
    count = Counter(dat)
    ans = count.most_common(guests - 1)
    print("Case #" + str(i+1) + ": " + str(ans[len(ans) - 1][0]))
