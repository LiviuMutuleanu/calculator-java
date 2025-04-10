import java.util.Scanner;

public class Start {



	public static void main(String[] args) {
		String myExpression;
		boolean active = true;
		System.out.println("Enter expression here (type 'exit' to quit):");
		Scanner scanIn;
		
		while (active) {
			scanIn = new Scanner(System.in);
			myExpression = scanIn.nextLine();

			if (myExpression.equals("exit")) {
				scanIn.close();
				active = false;
			} else {
				System.out.println(Calculator.myRun(myExpression));

				
			}
			

		}

	}

}