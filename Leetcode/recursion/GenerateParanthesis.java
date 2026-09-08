package recursion;
import java.util.*;

public class GenerateParanthesis {
    
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result,    new StringBuilder()  , 0, 0, n);
        return result;
    }
    public void backtrack(
        List<String> result,
       StringBuilder current,
        int open,
        int close,
        int n
    ){
            if(current.length()==2*n){  
                result.add(current.toString());
                return  ;
                }

                //condition to add opening bracket
            if(open<n){
                current.append("(");
                backtrack(
                    result,
                     current, 
                     open+1, 
                     close,
                      n);
                    //backtrack
                      current.deleteCharAt(current.length()-1);
            }
            // condition to add
            if(close<open){
                current.append(")");
                backtrack(
                    result,
                     current, 
                     open, 
                     close+1,
                      n);
                    //backtrack
                      current.deleteCharAt(current.length()-1);
            }
    }

    public static void main (String[] args){

        GenerateParanthesis solution = new GenerateParanthesis();
        int n=3;
        List<String> result= solution.generateParenthesis(n);
        System.out.println(result);

    }
}
