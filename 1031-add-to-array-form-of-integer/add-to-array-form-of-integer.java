class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
       List<Integer> ans=new ArrayList<>();
        int carry=0;
        int p=num.length-1;

        while(p>=0 || k>0)
        {
            int numval=0;
            if(p>=0){
                numval=num[p];
            }
            

            int digit= k%10;
            int sum= numval +digit+carry;

         int d = sum%10;
            carry= sum/10;

            ans.add(d) ;
            p--;
            k=k/10;
        }
        if(carry>0)
        {
            ans.add(carry);
        } 

        Collections.reverse(ans);
        return ans;

    }
}