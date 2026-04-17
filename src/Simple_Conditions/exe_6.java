package Simple_Conditions;

public class exe_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("--------------------TestCase 1--------------------");

		// TestCase 1: To check if the total amount of the purchased products is greater
		// than INR. 5000 then the discount will be applicable otherwise the discount
		// will not be applicable.
		
		int amount = 5000;
		
		if (amount <= 5000) {
			//this block will be executed if the condition is true
			System.out.println("Discount will be aplicable");
		}else {
			//this block will be executed if the condition is false
			System.out.println("Discount will be not Aplicable");
		}
			
		System.out.println("--------------------TestCase 2--------------------");

		//TestCase 2: Actual Result is 350. To calculate the expectedResult. if the expectedResult and actualResult both are same then the test case is passed else failed.

		int actResult = 350;
		int expResult = 250;
		
		if (actResult == expResult) {
			
			System.out.println("actResult Value is Right");
		}else {
			System.out.println("expResult Value is Wrong");
		}
		
		System.out.println("--------------------TestCase 3--------------------");

		//TestCase 3: if the expectedResult and actualResult both are not same then the test case is passed else failed.
		
		
		if (actResult != expResult) {
			System.out.println("Both Value is not same");
		}else {
			System.out.println("Both Value is same");
		}
	}

}
