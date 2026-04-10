package Arrays;

import java.util.ArrayList;

///Iterative Approach
// public class AlternateElements {
//     static ArrayList<Integer> getAlternatives(int[] arr){
//         ArrayList<Integer> a = new ArrayList<Integer>();

//         for(int i=0; i<arr.length;i=i+2){
//             a.add(arr[i]);
//         }
//         return a;
//     }


//     public static void main(String args[]){
//         int[] arr={10,20,30,40,50};
//         ArrayList<Integer> res =getAlternatives(arr);
//         for(int x: res){
//             System.out.println(x + " ");
//         }

//     }

    
// }

///Recursive Approach

public class AlternateElements {


    static void getAlternativesArray(int[] arr, int idx, ArrayList<Integer> res){
       
        if(idx<arr.length){
            res.add(arr[idx]);
            getAlternativesArray(arr, idx+2, res);
        }
        
        
       
    }
    static ArrayList<Integer> getAlternatives(int[] arr){
        ArrayList<Integer> a = new ArrayList<Integer>();
        getAlternativesArray(arr, 0, a);
        return a;

        
       
    }


    public static void main(String args[]){
        int[] arr={10,20,30,40,50};
        ArrayList<Integer> res =getAlternatives(arr);
        for(int x: res){
            System.out.println(x + " ");
        }

    }

    
}
