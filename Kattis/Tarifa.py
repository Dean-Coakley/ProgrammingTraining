month_max = int(input())
num_months = int(input())
ans = month_max

for data_usage in range(0, num_months):
    data_usage = int(input())
    ans += month_max - data_usage

print(ans)