class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int rev=0;
        int y=x;
        
        while(y>0){
            rev=rev*10+y%10;
            y/=10;
        }
        return rev==x;
    }
}
