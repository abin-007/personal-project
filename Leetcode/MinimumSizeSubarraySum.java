 import java.lang.Math;
public class MinimumSizeSubarraySum {
    public static void main (String args[]){
				int nums[]={2,3,1,2,4,3};
				int target=7;
				System.out.println(MinSizeSubarraySum(nums,target));	
				}

		public static int MinSizeSubarraySum(int[] nums, int target){
			int current_sum=0;
			int low=0;
			int high=0;
			int minLenWindow=Integer.MAX_VALUE;

			for(high=0;high<nums.length;high++){
				current_sum+=nums[high];

				while(current_sum>=target){
					int currentwindow=high-low+1;
					minLenWindow=Math.min(currentwindow,minLenWindow);
					current_sum=current_sum-nums[low];
					low++;
							}
						}
				return minLenWindow==Integer.MAX_VALUE?0:minLenWindow;
				}
    
}
