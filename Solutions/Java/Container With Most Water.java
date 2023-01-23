class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int res=0;
        int h=0;

        while(l<r){
            if(height[l]<height[r]){
                res = Math.max(res,height[l] * (r-l));
                l+=1;
            }
            else{
                res = Math.max(res,height[r] * (r-l));
                r-=1;
            }
        }
        return res;
    }
}
