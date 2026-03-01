public class MaximumSubArray {
    public static void main(String args[]) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        // int[] nums={-2,1,-3,4,-1};

       MaxSum(nums);
        


    }

    public static void MaxSum(int[] nums) {
        int sum = 0;
        int max_sum = nums[0];
        int start=0;
        int end=0;
        int tempStart=0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];

            if (sum > max_sum) {
                max_sum = sum;
                start=tempStart;
                end=i;
            }
            if (sum < 0) {
                sum = 0;
                tempStart=i+1;
            }
        }
        // return max_sum;

         System.out.println(max_sum);
        System.out.println("SubArray is :");
        for (int i=start;i<=end;i++){
            System.out.println(nums[i] + " ");
            
        }

    }
}
