import java.util.Arrays;

public class DutchNationalFlag {
    public static void main(String args[]){
        int[] nums={2,2,0,1,2,1,0};
        System.out.println("Before sorting" + Arrays.toString(nums));
        sortColors(nums);
        System.out.println(" After sorting" + Arrays.toString(nums));

    }
    public static void sortColors(int[] nums){
        int left=0;
        int right= nums.length-1;
        int i =0;
        while(i<=right){
            if(nums[i]==0){
                swap(nums,i, left);
                left++;
                i++;

            }
            else if(nums[i]==1){
                i++;

            }
            else{
                swap(nums, i, right);
                right--;
            }

        }
    }
    public static void swap(int[] nums, int i, int j){
        int temp= nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    
}
