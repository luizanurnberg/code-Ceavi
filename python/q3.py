vitorias = sum(1 for _ in range(7) if input().strip().upper() == "V")

if 5 <= vitorias <= 6:
    print(1)
elif 3 <= vitorias <= 4:
    print(2)
elif 1 <= vitorias <= 2:
    print(3)
else:
    print(-1)