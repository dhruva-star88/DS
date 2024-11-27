def countNum(n):
    c = 0
    while (n > 0):
        n = n / 10
        n = int(n)
        c += 1

    return c

print(countNum(156))