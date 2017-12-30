import math
num_input = int(input())
for _ in range(num_input):
    calories = int(input())
    print(math.ceil(calories/400))
