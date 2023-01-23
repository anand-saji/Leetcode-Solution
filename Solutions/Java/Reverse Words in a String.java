class Solution {
    public String reverseWords(String s) {
        String[] string = s.split("\\s+");
        StringBuilder str = new StringBuilder();
        for(int i=string.length-1;i>=0;i--){
            str.append(string[i]+" ");
        }
        return str.toString().trim();
    }
}

// Algorithm
// 1. split string by removing whitespaces into string array
// 2. append each string from last of the array to a stringbuilder
// 3. return string builder 
