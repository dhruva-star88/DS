def rev_r_a_tri(n):
    c = 0
    for i in range(n):
        c += 1
        for j in range( n + 1 - c):
            print("* ", end="")
        print('\n')


rev_r_a_tri(3)

def rev_num_r_a_tri(n):
    c = 0
    for i in range(n):
        c += 1
        for j in range(n + 1 - c):
            print(f'{j + 1} ', end='')

        print('\n')

rev_num_r_a_tri(3)
