
import java.util.*;

public class SwapNumbers {

    public static void main(String[] args)
	{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number a: ");
		int a = input.nextInt();
        System.out.println("Enter number b: ");
        int n = input.nextInt();
        System.out.println("Value of a is " + x	+ " and Value of b is " + y + " before swapping.");
		swap(a, b);
	}
	
    static void swap(int x, int y)
	{
		int temp = x;
		x = y;
		y = temp;
		System.out.println("Value of a is " + x	+ " and Value of b is " + y + " after swapping.");
	}

}
