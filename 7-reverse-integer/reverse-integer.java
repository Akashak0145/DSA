
class Solution{
    public static void main(String[]args){
        int x=123;
        System.out.println(reverse(x));
    }
    public static int reverse(int x){
        int rev=0;
        int temp=x;
        while(temp!=0){
            if(rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10){
                return 0;
            }
            rev=rev*10+temp%10;
            temp/=10;
        }
        return rev;
    }
}
