input_data = map(int, input().split())
req_data = [1, 1, 2, 2, 2, 8]

for num, req in zip(input_data, req_data):
    print(req - num, end=" ")