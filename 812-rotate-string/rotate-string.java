import java.util.*;
class Solution {
    public static void main(String[]args){
        String s="abcde";
        String goal="cdeab"; 
        Solution obj =new Solution();
        System.out.print(obj.rotateString(s,goal));
    }
    public boolean rotateString(String s, String goal) {
        if(goal.length()!=s.length()){
        return false;
        }
        String str=s+s;
    
return str.contains(goal);
    }
}