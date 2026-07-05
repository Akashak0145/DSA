class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
    int result=n;
    while(result%2==0){
        result=result/2;
    }
    if(result==1){
        return true;
    }
    else{
    return false;
}
    }   
    }
