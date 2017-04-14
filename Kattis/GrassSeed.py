price_lawn = float(input())
test_cases = int(input())
total = 0

for i in range(0, test_cases):
    l, w = map(float, input().split())
    area = l * w
    total += area * price_lawn
print(total)