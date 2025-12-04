package TrickyQuestions;
import java.util.Arrays;

public class MissingNumberArray {
    public static void main(String args[]){
			int [] arr={1,2,3,4,6,7};
			int n= arr.length+1;
			int  expectedResult=n*(n+1)/2;
			int actualResult = Arrays.stream(arr).sum();
            int missing= expectedResult-actualResult;
			System.out.println(missing);	
}
    
}
