per = "PER"
count = 0
days = 0
word = input()

for c in word:
    if c == per[count]:
        pass
    else:
        days += 1
    count += 1
    if count == len(per):
        count = 0

print(days)
