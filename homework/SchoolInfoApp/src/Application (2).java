import java.util.Scanner;
public class Applicationjava {
	
	public static void main(String[] args) {
		System.out.print("give grade");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		// if number is less than 5, it is Elementary School
		// if number is between 6 and 8, it is Middle School
		// if number is between 9 and 12, it is High School
		// if number is above 12, it is College
		
		if(number <= 5)
			System.out.println("Elementary School"); 
		else if(number >= 6 || number <= 8)
			System.out.println("Middle School");
		else if(number >= 9 || number <= 12)
			System.out.println("High School");
		else if(number > 12)
			System.out.println("College");
			
			
		
			

	}

}
