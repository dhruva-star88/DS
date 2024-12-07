
def PrintNum(c, n):
    if c == n:
        return
    else:
        print(c)
        PrintNum(c + 1, n)

PrintNum(1, 5)
    