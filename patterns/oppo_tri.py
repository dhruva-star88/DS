def r_tri(n):
    c = 0
    for i in range(n):
        c = c + 1
        for j in range(c):
            print(f'{j + 1}', end="")

        print("\n")

r_tri(4)

def l_tri(n):
    c = 0
    for i in range(n):
        c = c + 1
        s = n - i - 1
        for j in range(s):
            print(" ", end='')
        for k in range(c):
            print(f"{k + 1}", end='')

        print('\n')

l_tri(4)


        
def oppo_tri(n):
    c = 0
    for i in range(n):
        c = 0 + 1
        s = 2 * (n - i - 1)
        for j in range(c):
            print(f'{j + 1}', end="")
        for j in range(s):
            print(" ", end='')
        for k in range(c):
            print(f"{k + 1}", end='')
        print("\n")

oppo_tri(4)