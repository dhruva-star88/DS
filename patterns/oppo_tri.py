def r_tri(n):
    c = 0
    for i in range(n):
        c = c + 1
        for j in range(c):
            print(f'{j + 1}', end=" ")

        print()

r_tri(4)

def l_tri(n):
    c = 0
    for i in range(n):
        c = c + 1
        s = n - i - 1
        for j in range(s):
            print(" ", end=' ')
        for k in range(c):
            print(f"{k + 1}", end=' ')

        print()

l_tri(4)


        
def oppo_tri(n):
    num = 1
    gap = (n - 1) * 2
    for i in range(n):
        currentNumber = 1
        for j in range(1, num+1):
            print(currentNumber, end=" ")
            currentNumber += 1
        for j in range(1, gap+1):
            print(" ", end=" ")
        currentNumber -= 1
        for j in range(1, num+1):
            print(currentNumber, end=" ")
            currentNumber -= 1
        
        # End the current line.
        print()

        num += 1
        gap -= 2

oppo_tri(4)