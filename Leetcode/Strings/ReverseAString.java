package Strings;

import java.util.Arrays;

public class ReverseAString {
    
    public static void reverseString(char [] s){
        int left =0;
        int right = s.length-1;
        while(left<right){
            char temp =s[left];
            s[left]=s[right];
            s[right]= temp;

            left++;
            right--;
    
        
        }

    }
    public static void main(String a[]){
        char [] s= {'H', 'a', 'n', 'n', 'a', 'h'};
        reverseString(s);
        System.out.println(Arrays.toString(s));

    }
}
