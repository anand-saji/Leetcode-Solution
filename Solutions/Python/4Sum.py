class Solution:
    def fourSum(self, nums: List[int], target: int) -> List[List[int]]:
        nums.sort()
        res,quad=[],[]

        def ksum (k,start,target):
            if k!=2:
                for i in range(start,len(nums)-k+1):
                    if i>start and nums[i]==nums[i-1]:
                        continue
                    quad.append(nums[i])
                    ksum(k-1,i+1,target-nums[i])
                    quad.pop()
                return            
            l,r=start,len(nums)-1
            while l<r:                    
                if nums[l]+nums[r]<target:
                    l+=1
                elif nums[l]+nums[r]>target:
                    r-=1
                else:
                    res.append(quad+[nums[l],nums[r]])
                    l+=1
                    while l<r and nums[l]==nums[l-1]:
                        l+=1
        ksum(4,0,target)
        return res

# Algorithm
# 1. sort input list
# 2. recursvie call ksum method 
# 3. if k==2, perfrom two-sum with left and right operators. 
# 4. if k!=2, select range of iteration (start,len - k + 1),
#     if same value, then continue
#     append value to quad 
#     recursively call ksum(decrement k, increment start, subtract value from target)
# 5. call ksum method with parameters
# 6. return res
