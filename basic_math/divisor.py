x = []
def divisor(n):
    for i in range(1, n + 1):
        if n % i == 0:
            x.append(i)
    

divisor(36)
print(x)