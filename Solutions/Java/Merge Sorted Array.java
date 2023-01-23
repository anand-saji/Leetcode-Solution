class Solution {
    public void merge(int[] n1, int m, int[] n2, int n) {
        int x=n1.length;
        int i=0;
        for(int y=m;y<x;y++){
            n1[y]=n2[i++];
        }
        Arrays.sort(n1);
    }
}

// Algorithm
// 1. insert elements of second array into first array from mth positon
// 2. sort 
