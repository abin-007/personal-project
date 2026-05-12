package Arrays;

import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n){
        // here we do the three pointer approah , one pointer for the first array last valid element
        // second pointer is for the last valid element and the third pointer is for last position of the merged arrays
        int i = m-1;
        int j=n-1;
        int k =m+n-1;
        // comparing the two sorted arrays
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                i--;
            }else{
                nums1[k]=nums2[j];
                j--;
            }
            k--;
        }
        //if nums2 still has elements
        while(j>=0){
            nums1[k]=nums2[j];
            j--;
            k--;

        }
    }
    
    public static void main(String a[]){
        int [] nums1={1,2,3,0,0,0};
        int [] nums2={2,5,6};
        merge(nums1,3, nums2,3);
        System.out.println(Arrays.toString(nums1));
    }
}
