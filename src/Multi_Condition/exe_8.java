package Multi_Condition;

public class exe_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int amount = 7000;
		
		if (amount > 1000 &&  amount <= 2000) {
			System.out.println("10% Disocunt will be applicable");
		}else if (amount > 2000 && amount <= 3000) {
			System.out.println("20% Disocunt will be applicable");
		}
		else if (amount > 3000 && amount <= 4000) {
			System.out.println("30% Disocunt will be applicable");
		}
		else if (amount > 4000 && amount <= 5000) {
			System.out.println("50% Disocunt will be applicable");
		}
		else if (amount > 5000) {
			System.out.println("60% Disocunt will be applicable");
		}
		else {
			System.out.println("Sorry...No Discounts!!");
		}

	}

}
