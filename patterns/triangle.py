def triangle(n):
    c = 0
    for i in range(n):
        c = c +  1
        for j in range(c):
            print("*", end='')

        print('\n')

triangle(5)