while True:
    line = input().strip()
    if line != "":
        N = int(line)
        break

while True:
    line = input().strip()
    if line != "":
        temps = list(map(int, line.split()))
        break

max_seq = atual = 0
for t in temps:
    if t > 0:
        atual += 1
        max_seq = max(max_seq, atual)
    else:
        atual = 0

print(max_seq)
