package TrickyQuestions;

public class NoOfVowels {
    public static void main(String[] args) {
        String str =" Programming in JAVA";
        String vowels= "aeiouAEIOU";
         long count = str.chars()
         .filter( c -> vowels.indexOf(c) !=-1)
         .count();
         System.out.println(count);

    }
}
