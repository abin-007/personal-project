package Strings;

import java.util.*;

public class FindPermutationofString {

    public static boolean CheckInclusion(String s1, String s2){

        if(s1.length()>s2.length()){
            return false;
        }
        //creating two frequency array for s1 string and sliding window
        int[] s1Freq = new int[26];
        int[] windowFreq =  new int[26];

        for(int i=0; i<s1.length();i++){
            s1Freq[s1.charAt(i)-'a']++;
            windowFreq[s2.charAt(i)-'a']++;
        }

        // compare  frequency arrays
        if(Arrays.equals(s1Freq,windowFreq)){
            return true;
        }

        //sliding window starts for next substring of s2 
        for(int i=s1.length(); i<s2.length();i++){

            // adding the next character
            windowFreq[s2.charAt(i)-'a']++;

            // dropping the previous character
            windowFreq[s2.charAt(i-s1.length())-'a']--;

            // compares the both frequency arrays
            if(Arrays.equals(s1Freq,windowFreq)){
            return true;
        }

        }



        return false;
    }

    public static void main(String[] args){
        String s1="ab";
        String s2 = "acde";
        boolean result= CheckInclusion(s1,s2);
        System.out.println(result);
    }

    
}
