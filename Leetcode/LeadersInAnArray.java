import java.util.ArrayList;
import java.util.Collections;

public class LeadersInAnArray {

    static ArrayList<Integer> leaders(int[] array) {
        int n = array.length;
        int rightMost = array[n - 1];
        ArrayList<Integer> res = new ArrayList<Integer>();
        res.add(rightMost);

        for (int i = n - 2; i > 0; i--) {
            if (array[i] > rightMost) {
                rightMost = array[i];
                res.add(rightMost);

            }

        }
        Collections.reverse(res);
        return res;

    }

    public static void main(String args[]) {
        int[] arr = { 16, 17, 4, 3, 5, 2 };
        ArrayList<Integer> result = leaders(arr);
        for (int res : result) {
            System.out.println(res + " ");
        }
        System.out.println();
    }

}
