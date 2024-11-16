def main():
    num = []
    c = 0
    n = int(input("Enter the num of elements: \n"))
    for i in range(n):
        value = int(input())
        num.append(value)

    for i in range(0, n, 2):
        print(f"step {i}")
        x = num[i]
        y = num[i+1]
        z = x + y
        res = z % 4
        if res == 0 or 1:
            c += 1
        
    print(c)

if __name__ == "__main__":
    main()