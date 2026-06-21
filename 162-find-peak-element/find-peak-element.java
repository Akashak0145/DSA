class Solution {
    public int findPeakElement(int[] nums) {
        int count=0;
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            count=i;
        }
    }
    return count;
    }
}