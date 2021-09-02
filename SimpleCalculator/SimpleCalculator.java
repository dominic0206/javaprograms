import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        //User choice fo operation
        System.out.println("What would you like to do?");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("Pick a number corresponding to the operation");
        int a = x.nextInt();
        //Initializing chosen user operation
        switch(a)
        {
            //For addition
            case 1:
                System.out.print("Enter addend 1: ");
                int add1 = x.nextInt();
                System.out.print("Enter addend 1: ");
                int add2 = x.nextInt();
                int sum = add1 + add2;
                System.out.print("The sum is "+ sum);
                break;
            //For subraction
            case 2:
                System.out.print("Enter minuend: ");
                int sub1 = x.nextInt();
                System.out.print("Enter subtrahend: ");
                int sub2 = x.nextInt();
                int diff = sub1 - sub2;
                System.out.print("The difference is "+ diff);
                break;
            //For multiplication
            case 3:
                System.out.print("Enter multiplicand: ");
                int mul1 = x.nextInt();
                System.out.print("Enter multiplier: ");
                int mul2 = x.nextInt();
                int prod = mul1 * mul2;
                System.out.print("The product is "+ prod);  
                break;
            //For division
            case 4:
                System.out.print("Enter dividend: ");
                int div1 = x.nextInt();
                System.out.print("Enter divisor: ");
                int div2 = x.nextInt();
                int quo = div1 / div2;
                System.out.print("The quotient is "+ quo);
                break;   
        }       
    }
    
}
