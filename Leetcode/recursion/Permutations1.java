package recursion;

import java.util.*;

public class Permutations1 {
    public List<List<Integer>> permute(int[] nums){

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(nums, used, current, result);
        return result;
    }
    public void backtrack(
        int[] nums,
        boolean[] used,
        List<Integer> current,
        List<List<Integer>> result
    ){
        //permutation is complete
        if(current.size()==nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i =0; i<nums.length; i++){
            //skip if it is already used
            if(used[i]){
                continue;
            }
            //choose
            current.add(nums[i]);
            used[i]=true;

            //Explore
        backtrack(nums, used, current, result);

            //undo
            current.remove(current.size()-1);
            used[i]= false;

        }

    }
    public static void main(String args[]){
        Permutations1 solution = new  Permutations1();
        int[] nums ={1,2,3};
        List<List<Integer>> result = solution.permute(nums);
        System.out.println(result);
    }

    
}
