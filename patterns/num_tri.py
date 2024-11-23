def num_tri(n):
    c = 0
    num = 0
    for i in range(n):
        c = c + 1
        for i in range(c):
            num = num + 1
            print(num, end=' ')
        print()

num_tri(6)