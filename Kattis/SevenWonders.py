import math

tablet_count = 0
compass_count = 0
gear_count = 0

uniques = -1

for l in input():
    if l == 'T':
        tablet_count += 1
    elif l == 'C':
        compass_count += 1
    else:
        gear_count += 1

    if tablet_count <= compass_count and tablet_count < gear_count:
        uniques = tablet_count
    elif compass_count <= gear_count:
        uniques = compass_count
    else:
        uniques = gear_count

ans = math.pow(tablet_count,2) + math.pow(compass_count, 2) + math.pow(gear_count, 2)
ans += uniques * 7

print(int(ans))
