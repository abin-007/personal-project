package SlidingWindow;

public class MaximumAverageSubArray {
    //{}
    public static void main(String arg[]){
        int[] nums={};
        int k=4;
       findAverage(nums,k);
    }

    public static double  findAverage(int[] nums, int k){
        int maxSum=0;
        for (int i=0;i<k;i++){
            maxSum=maxSum+nums[i];
        }
        int sum= maxSum;
        for(int i=k;i<nums.length;i++){
            sum= sum+nums[i]-nums[i-k];
            maxSum=Math.max(maxSum,sum);
        }


        return (double) maxSum/k;
    }
    
}
