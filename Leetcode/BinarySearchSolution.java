public class BinarySearchSolution {
    public static void main(String args[]){
        int[] nums={1, 3, 5, 7, 9};
        int target=7;
        int index=search(nums,target);
        System.out.println("index is " + index);
    }
    public static int search(int[] nums, int target){
        int low=0;
        int high= nums.length-1;
        int mid=low +(high-low)/2;
        while(low<=high){
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}
