nums = list(map(int, input().split()))
print(sum(1 for n in nums if n % 2 == 0))
