package Arrays;

import java.util.ArrayList;

public class PrintAllSubArrays {
    ///Iterative approach
    static void SubArrays(ArrayList<Integer> arr){
        int n = arr.size();
        //outer loop for finding the starting index
        for(int i = 0; i<n;i++){
        // middle loop for finding the ending inndex
        for(int j=i;j<n;j++){
        // outer loop fr prinying the values between the starting and ending index
        for(int k= i;k<=j;k++){
            System.out.println(arr.get(k)+ " ");

            
        }
        System.out.println();

        }


        }

    }
    public static void main (String a[]){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        System.out.println("All the sub arrays are the following");
        SubArrays(arr);
    }
}
