
import java.util.*;

public class OddOrEven {

    public static void main(String[] args)
	{
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
		int a = input.nextInt();
        input.close();
        if(a%2 == 0)
            System.out.println("The entered number is even.");
        else
            System.out.println("The entered number is odd.");
	}

}
