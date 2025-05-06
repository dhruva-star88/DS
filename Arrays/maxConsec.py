def maxConsec(nums):
    maxi = 0
    c = 0
    n = len(nums)
     
    for i in range(0, n):
        if(nums[i] == 1):
             c +=1 
        else:
             c = 0
             
        maxi = max(c, maxi)
        
    return maxi


# Example usage 
if __name__ == "__main__":
    nums = [1, 1, 0, 1, 1, 1]
    print("Maximum Consecutive Ones:", maxConsec(nums))