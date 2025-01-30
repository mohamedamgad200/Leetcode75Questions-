class Solution {
    public int[] twoSum(int[] nums, int target) {
        int index;
        for(int i=0;i<nums.length-1;i++)
        {    
            index=i;
            int sum=nums[i];
            for(int j=i+1;j<nums.length;j++)
            {
                sum+=nums[j];
                if(sum==target){
                 return new int[] {i,j};
                }
                else
                {
                    sum=nums[i];
                    continue;
                }
            }
            
        }
        return new int[] {0,0};
    }
}