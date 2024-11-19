def diamond(n):
    c = 0
    for i in range(n):
        for j in range(n - i - 1):
            print(" ", end=" ")
        for k in range(2 * i + 1):
            print("*", end=" ")
        for l in range(n - i - 1):
            print(" ", end=" ")
        print("\n")
    for m in range(n):
        c = n - m - 1
        for z in range(m):
            print(" ", end=' ')
        for o in range(2 * c + 1):
            print("*", end=' ')
        for p in range(m):
            print(" ", end=' ')
        print("\n")
    

diamond(6)
            