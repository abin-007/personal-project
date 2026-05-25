package SlidingWindow;

public class LongestSubstringWihtoutRepeatingCharacters {
    static int SubstringWithNoRepeating(String s){
        if(s.length()==0|| s.length()==1){
            return s.length();
        }
        int res=0;
        int left =0;
        int right =0;

        boolean[] vis= new boolean[26];
        while(right<s.length()){

            while(vis[s.charAt(right)-'a']==true){
                vis[s.charAt(left)-'a']=false;
                left++;

            }
            vis[s.charAt(right)-'a']=true;
            res=Math.max(res, (right-left+1));
            right++;
        }
        return res;


    }
    public static void main(String a[]){
       // String s ="geeksforgeeks";
        String s ="abcabcbb";

        System.out.println(SubstringWithNoRepeating(s));
    }
}
