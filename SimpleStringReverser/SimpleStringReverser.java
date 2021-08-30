import java.util.Scanner;
public class SimpleStringReverser {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = x.next();
        word = word.trim();
        String result="";
        char[] c = word.toCharArray();
        for(int i=c.length-1; i>=0; i--){
            result += c[i];
        }
        System.out.print(result.trim());
    }
}
