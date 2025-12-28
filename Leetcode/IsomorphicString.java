import java.util.HashMap;

public class IsomorphicString {
    public static void main(String args[]){
        String s= "egg";
        String b="add";
        System.out.println(isIsomorphic(s,b));
    }
    public static boolean isIsomorphic(String s, String b){
        if (s.length()!= b.length()){
            return false;
        }
        HashMap<Character, Character> map = new HashMap<>();
        for(int i =0; i<s.length(); i++){
            char sChar = s.charAt(i);
            char bChar = b.charAt(i);

            // to check whether  if s is mapped or not
            if(map.containsKey(sChar)){
                if (map.get(sChar)!= bChar){
                    return false;
                }

            }
            // to check whether s is not mapped
            else{
                if(map.containsValue(bChar)){
                    return false;
                }
            }
            
        }
        return true;
    }
}
