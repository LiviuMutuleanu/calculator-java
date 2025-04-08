import java.util.Scanner;

public class Start {


	public static void testMyRun(String expression) {
        // Define the expression to test
        float expectedResult = 4;

        // Call the myRun method to get the actual result

		//aici imi da return String si trebuit convert la float mai jos pentru ca expected result este si el float
        String result = Calculator.myRun(expression);
		//conversie la float pentru return value care vine din myRun function
		float floatResult = Float.parseFloat(result);


        // Compare the actual result with the expected result
        if (expectedResult == floatResult) {
            System.out.println("Test succeeded.");
        } else {
            System.out.println("Test failed for expression \"" + expression + "\"");
            System.out.println("Expected: " + expectedResult + ", but got: " + floatResult);
        }
    }

	public static void main(String[] args) {
		String Expression;
		boolean active = true;
		System.out.println("Enter expression here (type 'exit' to quit):");
		Scanner scanIn;
		
		while (active) {
			scanIn = new Scanner(System.in);
			Expression = scanIn.nextLine();

			if (Expression.equals("exit")) {
				scanIn.close();
				active = false;
			} else {
				System.out.println(Calculator.myRun(Expression));

				//apelare la functia mea de test
				testMyRun(Expression);
			}
			

		}

	}

}