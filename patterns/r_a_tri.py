c = 0
for i in range(5):
    c += 1
    for j in range(c):
        print("* ", end='')

    print('\n')

def r_a_tri(n):
    c = 0
    for i in range(n):
        c += 1
        for j in range(c):
            print("* ", end='')
        
        print("\n")


r_a_tri(3)