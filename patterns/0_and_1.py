def zero_one(n):
    c = 0
    for i in range(n):
        c = c + 1
        for j in range(c):
            if (i % 2 == 0 and j % 2 == 0) or (i % 2 != 0 and j % 2 != 0) :
                print(1, end=' ')
            else:
                print(0, end=' ')
        print("\n")

zero_one(5)