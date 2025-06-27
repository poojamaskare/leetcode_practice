class Solution {
    public int missingNumber(int[] nums) {
        int range = nums.length;

        int actualsum=   (range*(range+1))/2;    //n*(n+1)/2

        int currentsum= 0;

        for(int i=0;i<nums.length;i++)
        {
            currentsum= currentsum + nums[i];
        }

        int ans = actualsum - currentsum;
        return ans ;
    }
    
}