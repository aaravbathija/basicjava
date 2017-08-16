
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("learning my own data types");
		
		Puzzle P1 = new Puzzle();
		P1.name =  "Beach";
		P1.shape = "Rectangle";
		P1.pieces = 1000;
		System.out.println(P1.name);
		System.out.println(P1.shape);
		System.out.println(P1.pieces);
		
		Puzzle P2 = new Puzzle();
		P2.name = "Ocean";
		P2.shape = "Circle";
		P2.pieces = 750;
		System.out.println(P2.name);
		System.out.println(P2.shape);
		System.out.println(P2.pieces);
	}

}
