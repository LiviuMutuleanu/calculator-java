import java.util.Scanner;

public class Start {


public static void testRun(String expression) {
        // Define the expression to test
        float expectedResult = 4;

        // Call the myRun method to get the actual result
		String result = Calculator.myRun(expression);
		
       // Compare the actual result with the expected result
        
	try {
	   //conversie la float pentru return value care vine din myRun function
       float floatResult = Float.parseFloat(result);
    
         if (expectedResult == floatResult) {
         System.out.println("Test succeeded.");
         } else {
          System.out.println("Test failed for expression \"" + expression + "\"");
          System.out.println("Expected: " + expectedResult + ", but got: " + floatResult);
       }
    } catch (NumberFormatException e) {
       System.out.println("Eroare: The result is not a valid number!"); 
      }
 }
 
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

            //apelare la functia mea de test - in corpul else
            testRun(myExpression);
         			
			}
			

		}
		

	}

}