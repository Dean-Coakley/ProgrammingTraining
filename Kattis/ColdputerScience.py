num_temps = int(input())
temps = map(int, input().split())
ans = 0

for temp in temps:
    if temp < 0:
        ans += 1

print(ans)