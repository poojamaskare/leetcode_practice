class Solution 
{
    public boolean isPalindrome(int x) {
    
        if(x<0)
        {
        System.out.println("invalid");
        }
        String str=Integer.toString(x);
        StringBuilder reverse=new StringBuilder(str).reverse();
         return str.equals(reverse.toString());
    }
    public static void main(String[] args)
    {
        Solution s=new Solution();
        int x=121;
      

   if (s.isPalindrome(x))
    {
        System.out.println("true");
    }
    else
    {
        System.out.println("false");
    }
    
    
    }
}