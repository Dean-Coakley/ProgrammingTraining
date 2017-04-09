scores = 0
winner = -1
score = 0
for i in range(0, 5):
    data = map(int, input().split())
    for num in data:
        scores += num

    if scores > score:
        winner = i
        score = scores
    scores = 0

print(winner + 1, score)