public class LargestSecondlargestinArray {
    public static void main(String args[]){
        int largest =Integer.MIN_VALUE;
        int second= Integer.MIN_VALUE;
        int[] arr={ 10,20,15,25,4,55};
        for (int i = 0; i< arr.length;i++){
            if(
                arr[i]>largest
            ){
                second= largest;
                largest = arr[i];

            }
            else if( arr[i]>second && arr[i]!= largest){
                second= arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(second);
    }
    
}
