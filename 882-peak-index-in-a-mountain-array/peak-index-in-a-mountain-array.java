class Solution {
    public int peakIndexInMountainArray(int[] nums) {
        int count=0;
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
                count= i;
            }
        }
        return count;
    }
}