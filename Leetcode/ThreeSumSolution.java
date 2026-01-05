// import java.util.ArrayList;
// import java.util.List;
import java.util.*;

public class ThreeSumSolution {
    public static void main(String args[]){
        int[] nums={-1, 0, 1, 2, -1, -4};
        ThreeSumSolution sol= new ThreeSumSolution();
         List<List<Integer>> result= sol.ThreeSum(nums);

        System.out.println(result);
    }
    public   List<List<Integer>> ThreeSum(int[] nums){
        List<List<Integer>> result= new ArrayList<>();
        // we sort the array to remove the duplicates
        Arrays.sort(nums);
        
        for (int i=0;i<nums.length-2;i++){
        
        int left = i+1;
        int right =nums.length-1;

        // to skip the fixed duplicates
        if(i>0 && nums[i]==nums[i-1]){
            continue;
        }

        // we follow the two pointer approach
        while(left<right){
            int sum=nums[i]+nums[left]+nums[right];
            if (sum==0){
                result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                while(left<right && nums[left]==nums[left+1]) left++;
                while(left<right && nums[right]==nums[right-1]) right--;
                left++;
                right--;

            }
            else if (sum<0){
                left++;
            }
            else{
                right--;
            }

        }

        }
        return result;
        
    }
    
}
