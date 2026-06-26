class Solution {
    public boolean isPalindrome(int nums){
        if(nums<0){
            return false;
        }
        int original=nums;
        int rev=0;
      while(nums>0){
        rev=rev*10+nums%10;
        nums/=10;

      
        }
      return original==rev;
    }
}