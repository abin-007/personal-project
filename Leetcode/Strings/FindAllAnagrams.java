package Strings;

import java.util.*;

public class FindAllAnagrams {
    public static List<Integer> findAnagrams(String s, String p){

        //creating a array list to store the indexes of the anagaram starting in s
        List<Integer> result = new ArrayList<>();
        if (s.length()<p.length()){
            return result;

        }
        // creating two frequency array to store the frequency of the characters present in two strings
        int[] pFreq = new int[26];
        int[] windowFreq = new int[26];

        //calculating the frequency of the p string
        for(char ch : p.toCharArray()){
            pFreq[ch-'a']++;
        }

        int left = 0;

        for(int right =0;  right <s.length();right++){
            // calculating the frequency of the current windo starting from 0 th position to right
            windowFreq[s.charAt(right) -'a']++;

            // if the length of the current window exceeds the length of p string, we slide the window
            //by removing the left character
            if(right - left + 1> p.length()){
                windowFreq[s.charAt(left) -'a']--;
                left++;
            }
            // if the current window length is equal to the legth of the p string we compares the two string
             if(right - left + 1== p.length()){
                if(Arrays.equals(pFreq,windowFreq)){
                    result.add(left);
                }
            }
        }
        return result;

    }
    public static void main(String a[]){
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams(s, p));

    }
    
}
