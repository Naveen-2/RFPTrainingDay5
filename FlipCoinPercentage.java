import java.util.*;
import java.math.*;

public class FlipCoinPercentage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of tosses: ");
        int N = input.nextInt();
        input.close();
        float numberOfHeads = 0, numberOfTails = 0;
        float headPercentage, tailPercentage;
        for(int i = 0; i < N; i++){
            double result = Math.random();
            if(result < 0.5) {
                System.out.println("Tails");
                numberOfTails += 1;
                System.out.println(numberOfTails);
            } else {
                System.out.println("Heads");
                numberOfHeads += 1;
                System.out.println(numberOfHeads);
            }
        }
        headPercentage = (numberOfHeads / N) * 100;
        tailPercentage = (numberOfTails / N) * 100;
        System.out.println("Percentage of Heads in " + N + " flips is " + headPercentage + "%.");
        System.out.println("Percentage of Tails in " + N + " flips is " + tailPercentage + "%.");
    }
}