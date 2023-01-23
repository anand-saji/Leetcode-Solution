class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        Set<Integer> distset = new HashSet<>();
        int[][] p = {p1,p2,p3,p4};

        for(int i=0;i<4;i++){
            for(int j=i+1;j<4;j++){
                distset.add(dist(p[i],p[j]));    
            }
        }
        return !distset.contains(0) && distset.size()==2;
    }
    private int dist(int[] p1, int[] p2){ 
        return (p1[0]-p2[0]) * (p1[0]-p2[0]) + (p1[1]-p2[1])*(p1[1]-p2[1]);
    }
        
}

// Algorithm
// 1. Set
// 2. insert values into 2d array
// 3. outer and inner for loop for each point
// 4. calculate distance b/w two points and insert into Set
// 5. return true if set.size == 2 and set not contains 0
