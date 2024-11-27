def countNum(n):
    c = 0
    while (n > 0):
        # removes the last digit
        n = n // 10
        c += 1

    return c

print(countNum(156))