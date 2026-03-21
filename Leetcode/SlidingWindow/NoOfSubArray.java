//This problem return the Number of subarray of size K and average geraterthan or equal to threshold
package SlidingWindow;

public class NoOfSubArray {
    public static void main(String args[]) {
        int[] nums = { 2, 2, 2, 2, 5, 5, 5, 8 };
        int k = 3;
        int threshold = 4;
        int result = NoOfSubArray(nums, k, threshold);
        System.out.println(result);

    }

    public static int NoOfSubArray(int[] nums, int k, int threshold) {

        int sum = 0;
        int count = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + nums[i];
        }
        if (sum / k >= threshold)
            count++;
        for (int i = k; i < nums.length; i++) {
            sum = sum + nums[i] - nums[i - k];
            if (sum / k >= threshold)
                count++;

        }
        return count;
    }

}
