def printName(c, n, name):
    if (c == n):
        return
    else:
        print(name)
        printName(c + 1, n, name)
        
printName(0, 5, "Raja")