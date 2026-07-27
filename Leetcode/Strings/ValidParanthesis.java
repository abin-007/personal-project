package Strings;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParanthesis {

    public  static String minToRemoveValidString(String s){

        Deque<Integer> stack = new ArrayDeque<>();
        boolean[] remove = new boolean[s.length()];

        for (int i = 0; i<s.length();i++){
            Character currenCharacter = s.charAt(i);
            if (currenCharacter=='('){
                // opening parathesis are pushed to stack
                stack.push(i);
            }else if(currenCharacter ==')'){
                // if stack is empty  mark all the closing paranthesis as true to remove
                if(stack.isEmpty()){
                    remove[i]=true;
                }else{
                    // if matching opening parantheis is available , pop it
                    stack.pop();
                }

            }

        }

        while(!stack.isEmpty()){
            remove[stack.pop()]= true;
        }
         StringBuilder result = new StringBuilder();

        for (int i =0; i<s.length(); i++){
            if(!remove[i]){
                result.append(s.charAt(i));
               

                

            }
            
        }
        return result.toString();
        

    }

    public static void main(String args[]){
        String s= "(a)b(c)d)";
        System.out.println(minToRemoveValidString(s));
    }
    
}
