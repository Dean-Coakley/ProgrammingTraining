lines = int(input())

ans = 0
for line in range(lines):
    a, b = map(float, input().split())
    ans += a * b

print(ans)

