n = int(input())
data = []
final_ans = []

def getAns(data):
    prev = 0
    ans = 0
    for i in data:
        ans += int(i[0]) * (int(i[1]) - prev)
        prev = int(i[1])
    final_ans.append(ans)

while n != -1:
    for k in range(0, n):
        k = (input().split())
        data.append(k)
    getAns(data)
    data = []
    n = int(input())

for out_ans in final_ans:
    print(out_ans, "miles")