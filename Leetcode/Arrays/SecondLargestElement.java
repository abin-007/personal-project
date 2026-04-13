package Arrays;

import java.util.Arrays;

public class SecondLargestElement {
    ///naive approach using the sorting method
    static int getSecondLargest(int[] arr){
        int n=arr.length;
        // sorting the array in increasing order       
         Arrays.sort(arr);

         for(int i= n-2;i>=0;i--){
            if(arr[i]!=arr[n-1]){
                return arr[i];
            }
           
         }
          return -1;
    }
    public static void main(String args[]){
        int[] arr={10, 2,30, 35,15,21};
        System.out.println(getSecondLargest(arr));
    }
    
}
