class Solution {
    public boolean canJump(int[] a) {
        int MaxReach =0;
        for(int i=0;i<a.length;i++)
          {
            if(i>MaxReach){
            return false;
            }
            if(i+a[i]>MaxReach)
            {
                MaxReach=i+a[i];
            }
            if(MaxReach>=a.length-1)
            {return true;
            }
          }
            return true;
        
    }
}