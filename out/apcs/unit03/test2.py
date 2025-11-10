class Solution (object):
    def twoSum (self, nums, target):
        for i in range(len(nums)-1):
            k=i+1
            while(k<len(nums)):
                if ((nums[k] +nums[i]) == target):
                    return [i,k]
                k+=1
            i+=1
        return [0,0]
    
    
solver=Solution()
result = solver.twoSum([2,7,11,15], 9)
print(result)