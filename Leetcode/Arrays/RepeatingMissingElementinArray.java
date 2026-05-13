package Arrays;

import java.util.ArrayList;

public class RepeatingMissingElementinArray {
    static ArrayList<Integer> findElements(int [] arr){
        int n =arr.length;
        int repeating = -1;

        //the logic we use here is  that negative marking technique, 
        // we will mark the already visited index value as negative.
         for (int i =0; i<n;i++){
            int val =Math.abs(arr[i]);
            if(arr[val-1]>0){
                arr[val-1]=-arr[val-1];
            }else{
                repeating= val;
            }
         }

         int missing=-1;
         //the logic we use here is while traversing the loop the positive one is 
         // the index no one visited. so missing number is index+1
         for(int i=0;i<n;i++){
            if(arr[i]>0){
                missing=i+1;
            }

         }

         ArrayList<Integer> result= new ArrayList<>();
         result.add(repeating);
         result.add(missing);
         return result;

    }
    public static void main(String a[]){
        int[] arr={3,1,3};
        ArrayList<Integer> ans =findElements(arr);
        System.out.println("Repeating :"+ ans.get(0) );
        System.out.println("Missing :"+ ans.get(1) );

    }
    
}
