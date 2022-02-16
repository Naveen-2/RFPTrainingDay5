
import java.io.*;
import java.lang.Math;
import java.util.Scanner;
 
public class PrimeFactor {
 
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = input.nextInt();
        primeFactors(N);
        input.close();
    }

    public static void primeFactors(int N)
    {
        
        while (N%2==0)
        {
            System.out.print(2 + " ");
            N /= 2;
        }
 
        for (int i = 3; i <= Math.sqrt(N); i+= 2)
        {
            while (N%i == 0)
            {
                System.out.print(i + " ");
                N /= i;
            }
        }
 
        if (N > 2)
            System.out.print(N);
    }
}