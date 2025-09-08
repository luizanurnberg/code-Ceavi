while True:
    line = input().strip()
    if line != "":
        N = int(line)
        break

matriz = []
for _ in range(N):
    while True:
        line = input().strip()
        if line != "":
            matriz.append(list(map(int, line.split())))
            break

print(sum(matriz[i][i] for i in range(N)))
