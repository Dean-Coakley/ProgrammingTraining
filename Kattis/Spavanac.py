hours, mins = map(int, input().split())

if (hours == 0):
    hours = 24

totalMins = mins + (hours * 60)

totalMins -= 45
hours = int(totalMins / 60)
mins = totalMins % 60
print(hours, mins)