import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntesectionOfTwoArray {
    public static void main(String args[]){
	// int[] nums1={1,2,2,1};
	// int[] nums2={2,2};
    int[] nums1={4,9,5};
	int[] nums2={9,4,9,8,4};
	System.out.println(Arrays.toString(intersection(nums1,nums2)));
}

	public static int[] intersection(int[] nums1, int[] nums2){

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		List<Integer> list = new ArrayList<Integer>();
		
		for (int num:nums1)
			{ map.put(num,map.getOrDefault(num, 0)+1);
			}
		for (int num:nums2)

			{ if(map.containsKey(num)&& map.get(num)>0)
				{ list.add(num);
				  map.put(num, map.get(num)-1);
					}
			}
		
			int [] result= new int[list.size()];
			for(int i=0;i<list.size();i++){
				result[i]=list.get(i);
            }
                return result;
							
 



    }
}
