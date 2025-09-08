def to_base(n, b):
    digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    res = []
    while n > 0:
        res.append(digits[n % b])
        n //= b
    return ''.join(reversed(res)) or "0"

def is_palindrome(s):
    return s == s[::-1]

def main():
    N = int(input().strip())
    bases = []
    
    for b in range(2, N + 1):
        rep = to_base(N, b)
        if is_palindrome(rep):
            bases.append(str(b))
    
    if bases:
        print(" ".join(bases))
    else:
        print("*")

if __name__ == "__main__":
    main()
