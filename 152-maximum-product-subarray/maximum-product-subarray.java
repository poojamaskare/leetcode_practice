class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==0)
        {
            return 0;

        }
        int max=nums[0];
        int min=nums[0];
        int result= max;
        for(int i=1;i<nums.length;i++)
        {
            int cur= nums[i];
            int tem=Math.max(cur,Math.max(max*cur,min*cur));
            min=Math.min(cur,Math.min(min*cur,max*cur));
            max=tem;
            result=Math.max(result,max);
        }
        return result;
    }
}