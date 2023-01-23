class Solution {
    public boolean validPalindrome(String s) {
        int a = 0;
        int b = s.length()-1;

        while(a<=b){
            if(s.charAt(a)!=s.charAt(b)){
                return validPalindrome1(s,a+1,b) || validPalindrome1(s,a,b-1);
            }
            a++;
            b--;
        }

        return true;
    }
    public boolean validPalindrome1(String s,int i, int j) {
        int a = i;
        int b = j;

        while(a<=b){
            if(s.charAt(a)!=s.charAt(b)){
                return false;
            }
            a++;
            b--;
        }

        return true;
    }
}
