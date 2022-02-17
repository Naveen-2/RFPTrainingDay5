import java.util.*;

public class LeapYear {
	
	public static void main(String args[]){	
		
		System.out.print("Enter a year: ");
		checkLeapYear();
		
	}	

	static int checkLeapYear(){
		Scanner input = new Scanner(System.in);
		int year = 0;
		
		try{
			year = input.nextInt();
		} catch(InputMismatchException e){
			input.next();
			System.out.print("Please enter a valid 4 digit number as year: ");			
			checkLeapYear();
		}
		
		if(year < 1000 || year > 9999){
			System.out.print("Please enter a valid 4 digit number as year: ");	
			checkLeapYear();
		} else {
			boolean isLeapYear = false;
			
			if (year % 4 == 0){
				if (year % 100 == 0){
					if (year % 400 == 0)
						isLeapYear = true;
					else
						isLeapYear = false;
				} else
				isLeapYear = true;
			} else
				isLeapYear = false;
			if (isLeapYear)
				System.out.println("The entered year is leap year.");
			else
				System.out.println("The entered year is not a leap year.");
		}
		input.close();
		return year;
	}
}

