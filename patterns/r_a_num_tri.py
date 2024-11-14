def r_num_tri(n):
    c = 0
    for i in range(n):
        c += 1
        for j in range(c):
            print(f'{j + 1} ', end='')

        print('\n')


r_num_tri(3)

def r_same_num_tri(n):
    c = 0
    for i in range(n):
        c = c + 1
        for j in range(c):
            print(f'{i + 1} ', end='')
        print('\n')

r_same_num_tri(3)