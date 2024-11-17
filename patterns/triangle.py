def triangle(n):
    c = 0
    for i in range(n):
        c = 2 * i + 1
        for j in range(n - i - 1):
            print(" ", end=" ")
        for m in range(c):
            print("*", end=" ")
        for k in range(n - i - 1):
            print(" ", end=" ")
        print('\n')
    

triangle(5)

def rev_triangle(n):
    c = 0
    for i in range(n):
        c = n - i - 1
        for j in range(i):
            print(" ", end=" ")
        for k in range(2 * c + 1):
            print("*", end=" ")
        for l in range(i):
            print(" ", end=" ")
        print('\n')

rev_triangle(5)