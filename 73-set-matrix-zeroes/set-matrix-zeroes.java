class Solution {
    public void setZeroes(int[][] a) {
        int m=a.length,n=a[0].length;
        boolean[][]b=new boolean[m][n];
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[0].length;j++){
                if(a[i][j]==0){
                Arrays.fill(b[i],true);
                for (int row=0;row<b.length;row++){
                    b[row][j]=true;
                }
            }
        }
        }
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[0].length;j++){
                if(b[i][j]){
                    a[i][j]=0;
                }
            }
        }
        return ;
    }
}