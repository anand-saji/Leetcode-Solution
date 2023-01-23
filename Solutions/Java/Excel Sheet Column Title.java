class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder  result = new StringBuilder();
        
        while(columnNumber>0){
            int remain = columnNumber%26;
            if(remain==0) remain=26;

            result.append((char)('A'+(remain-1)));
            columnNumber=(columnNumber-remain)/26;
        }
        return result.reverse().toString();
    }
}
