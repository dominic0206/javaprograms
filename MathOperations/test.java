import java.util.*;
import java.lang.*;
public class test {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println("What would you like to do?");
        System.out.println("1. Sqrt");
        System.out.println("2. Log");
        System.out.println("3. Factorial");
        int a = x.nextInt();

        switch(a){
            case 1:
                System.out.print("Enter number to sqrt:");
                int b = x.nextInt();
                System.out.print(Math.sqrt(b));
                break;
            case 2:
                System.out.print("Enter number to log:");
                int c = x.nextInt();
                System.out.print(Math.log10(c));
                break;
            case 3:
                System.out.print("Enter number to factorial:");
                int d = x.nextInt();
                int i = 1;
                long factorial = 1;
                while(i<=d){
                    factorial *= i;
                    i++;
                }
                System.out.print(factorial);
                break;
        }
    }
}