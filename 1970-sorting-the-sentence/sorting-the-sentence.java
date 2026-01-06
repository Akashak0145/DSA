class Solution {
    public String sortSentence(String s) {
        String[] words=s.split(" ");
        String[]result=new String[words.length];
        for(String word:words)
        {
            int pos=0;
            StringBuilder sb=new StringBuilder();
            for(char ch:word.toCharArray())
            {
                if(Character.isDigit(ch))
                {
                    pos=pos*10+(ch-'0');
                }
                else
                {
                    sb.append(ch);

                }
            }
            result[pos-1]=sb.toString();

        }
        return String.join(" ",result);
        
    }
}