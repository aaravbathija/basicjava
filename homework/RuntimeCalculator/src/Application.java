import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many laps");
		int laps = scanner.nextInt();
		int totalTime = 0;
		int x;
		for(x=1 ; x<=laps; x=x+1) {
			System.out.println("Time for lap" + x);
			int lapTime = scanner.nextInt();
			totalTime = totalTime + lapTime;
		}		
		System.out.println("Total time for " + laps + " is " + totalTime);
		

	}

}
