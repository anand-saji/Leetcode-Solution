class Solution {
    public boolean isHappy(int n) {
        int slow=square(n);
        int fast=square(square(n));
        while(slow!=fast){
            slow=square(slow);
            fast=square(square(fast));
        }
        return slow==1;
    }

    private int square(int n){
        int sum=0;
        while(n>0){
            sum+=Math.pow(n%10,2);
            n/=10;
        }
        return sum;
    }
}
