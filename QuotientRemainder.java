import java.util.Scanner;

public class QuotientRemainder{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Dividend: ");
        int dividend = input.nextInt();
        System.out.print("Enter a Divisor: ");
        int divisor = input.nextInt();
        
        System.out.println("Quotient of "+dividend+" divided by 5: " + dividend/divisor);
        System.out.println("Remainder of "+dividend+" divided by 5: " + dividend%divisor);
        input.close();   
    }
}