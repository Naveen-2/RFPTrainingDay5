import java.util.Scanner;

public class HarmonicNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int N = input.nextInt();    
        findHarmonicValue(N);
        input.close();
    }

    static void findHarmonicValue(int N){
        double result = 0;
        if(N!=0){
            for (double i = 1; i <= N; i++){
                result = result + (1.0/i);
            }
        } else {
            System.out.print("Please enter a number not equal to 0.\n Enter Here: ");
            findHarmonicValue(N);
        }
        System.out.println("The "+N+"th Harmonic Value is "+result);
    }
}