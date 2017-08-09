
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Creating My Own Data Types");
		
		Cars C1 = new Cars();
		C1.body = "Covered";
		C1.name = "Car";
		C1.wheels = 4;
		System.out.println(C1.body);
		System.out.println(C1.name);
		System.out.println(C1.wheels);
		
		Cars C2 = new Cars();
		C2.body = "Not Covered";
		C2.name = "Motorcycle";
		C2.wheels = 2;
		System.out.println(C2.body);
		System.out.println(C2.name);
		System.out.println(C2.wheels);
		
		

	}

}
