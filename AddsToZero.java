
import java.lang.Math;
import java.util.Scanner;
public class AddsToZero{
	
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int N = input.nextInt();
        int counter = 0;
        int[] array = new int[N];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < N; i++){
            array[i] = input.nextInt();
        }
        for(int i = 0; i < N; i++){
            for(int j = i+1; j < N; j++){
                for(int k = j+1; k < N; k++){
                    if(array[i]+array[j]+array[k] == 0)
                        counter++;
                }
            }
        }
        System.out.println(counter);
        input.close();
	}
	
}