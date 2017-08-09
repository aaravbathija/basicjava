import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		System.out.println("Give first number:");
		Scanner scanner = new Scanner(System.in);
		int firstNumber = scanner.nextInt(10);
		
		System.out.print("Give second number:");
		int secondNumber = scanner.nextInt(20);
		
		if(secondNumber > firstNumber) {
			System.out.println("Max is secondNumber");
			System.out.println("Min is firstNumber");
		
		}else{ 
			System.out.println("Max is firstNumber");
			System.out.println("Min is secondNumber");

		}

	}

}
