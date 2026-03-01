package SlidingWindow;

import java.util.*;

public class MaximunSumDistinctSubArray {

    public static void main(String args[]) {
        int[] nums = { 1, 5, 4, 2, 9, 9, 9 };
        int k = 3;
        int result=maximumSumSubArray(nums, k);
        System.out.println(result);

    }

    public static int maximumSumSubArray(int[] nums, int k) {
        int sum = 0;
        int maxSum = 0;
        Map<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < k; i++) {
            sum = sum + nums[i];
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) + 1);

        }

        if (freqMap.size() == k) {
            maxSum = Math.max(sum, maxSum);

        }
        for (int i = k; i < nums.length; i++) {
            sum = sum + nums[i] - nums[i - k];
            freqMap.put(nums[i - k], freqMap.get(nums[i - k]) - 1);
            if (freqMap.get(nums[i - k]) == 0) {
                freqMap.remove(nums[i - k]);

            }
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) + 1);
            if (freqMap.size() == k) {
                maxSum = Math.max(sum, maxSum);

            }

        }

        return maxSum;

    }
}
