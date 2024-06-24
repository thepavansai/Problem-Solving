class Solution {
    public boolean isPalindrome(int x) {
        int y=x;
        //int le=(int)Math.log(x);
        int res=0;
        while(y>0){
            int temp=y%10;
            y=y/10;
            res=res*10+temp;
        }
        return x==res;
    }
}