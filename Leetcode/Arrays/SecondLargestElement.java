package Arrays;

//import java.util.Arrays;

public class SecondLargestElement {
    
    static int getSecondLargest(int[] arr){
        int n=arr.length;
        
        ///naive approach using the sorting method

        // sorting the array in increasing order       
        //  Arrays.sort(arr);

        //  for(int i= n-2;i>=0;i--){
        //     if(arr[i]!=arr[n-1]){
        //         return arr[i];
        //     }
           
        //  }
        //   return -1;

        /// better approach using the two pass method
        int largest = -1; 
        int secondLargest=-1;
        // loop to find the largest element
        for(int i =0; i<n;i++){
            if (arr[i]> largest){
                largest= arr[i];
            }
        }

        // loop for finding the second largest
        for(int i =0; i<n;i++){
            if (arr[i]> secondLargest && arr[i]!=largest){
                secondLargest= arr[i];
            }
        }
        return secondLargest;
    }
    public static void main(String args[]){
        int[] arr={10, 2,30, 35,15,21};
        System.out.println(getSecondLargest(arr));
    }
    
}
