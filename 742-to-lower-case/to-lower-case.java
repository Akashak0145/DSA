class Solution {
    public String toLowerCase(String s) {
        String s1=s;
        for (int i=0;i<s1.length();i++){
            if (Character.isUpperCase(s1.charAt(i))){
                s1=s1.toLowerCase();
            }
        }
        return s1;
    }
}