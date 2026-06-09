class Solution{
    public int findMaxConsecutiveOnes(int[]num)
    {
        int count=0;
        int maxcount=0;
        for (int i=0;i<num.length;i++){
            if(num[i]==1){
            
                count++;
            
            if(count>maxcount){
            
                maxcount=count;
            }
             } else{
                count=0;
              }
        }
              return maxcount;
              }
            }
        
    
