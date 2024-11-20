def half_diamond(n):
    c = 0
    for i in range(n):
        c = c + 1
        for j in range(c):
            print("*", end=" ")
            print("\n")
    for k in range(n - 1):
        for m in range(c - 1):
            print("*", end="")
            print("\n")

half_diamond(3)