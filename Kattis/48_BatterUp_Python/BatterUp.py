num_input = int(input())
scores = 0
for i in input().split():
    if i == "-1":
        num_input -= 1
        continue
    scores += int(i)
print(scores/num_input)