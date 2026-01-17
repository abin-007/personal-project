public class FindKthPositive {
    public static void main(String args[]){
        
        // int[] arr1 = {2, 3, 4, 7, 11};
        // int k1 = 5;
        // System.out.println(findMissingNo(arr1, k1));

        // //example2
        // int[] arr2 = {1, 2, 3, 4};
        // int k2 = 2;
        // System.out.println(findMissingNo(arr2, k2));
        
        //example2
        int[] arr3 = {5, 6, 7};
        int k3 = 3;
        System.out.println(findMissingNo(arr3, k3));
    }
    public static int findMissingNo(int[] arr, int k){
        int left =0;
        int right = arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            int missingNo =arr[mid]-(mid+1);
            if (missingNo<=k){
                left=mid+1;
            }
            else{
                right= mid-1;
            }
            

        }
        return left+k;
        
    }
    
}
