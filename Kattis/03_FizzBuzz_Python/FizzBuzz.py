X, Y, N = map(int, input().split())

for i in range(1, N+1):
    if i % X == 0 and i % Y == 0:
        print("FizzBuzz")
    elif i % Y == 0:
        print("Buzz")
    elif i % X == 0:
        print("Fizz")
    else:
        print(str(i))