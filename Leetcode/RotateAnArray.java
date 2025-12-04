
import java.util.Arrays;

public class RotateAnArray {
    public static void main(String args[]) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        System.out.println(Arrays.toString(rotate(nums, k)));
    }

    public static int[] rotate(int[] nums, int k) {

        int n = nums.length;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        return nums;

    }

    public static int[] reverse(int[] nums, int start, int stop) {
        while (start <= stop) {
            int temp = nums[start];
            nums[start] = nums[stop];
            nums[stop] = temp;
            start++;
            stop--;

        }
        return nums;

    }

}
