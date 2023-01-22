class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> map = new HashMap<>(); //map
        map.put(']','[');               //assign key-value
        map.put('}','{'); 
        map.put(')','(');

        Stack<Character> stack = new Stack<>();     //stack 

        for(char ch: s.toCharArray()){        //to char array
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);           //if open, then push
            }  
            else{
                char pair= map.get(ch);     //else get value
                if(stack.isEmpty() || stack.peek()!=pair){      //check empty
                    return false;
                }
                else{
                    stack.pop();            //else push
                }
            }
        }
        return stack.isEmpty();     //if empty then return false
    }
}
