package Multi_Condition;

public class exe_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Discount Calculator
//		Apply discount:
		
		int amunt = 1500;
		
		if (amunt >= 1000) {
			System.out.println("Discount will be applicable 20%");
		}else if (amunt >= 500) {
			System.out.println("Discount will be applicable 10%");
		}else {
			System.out.println("No Discount for this amount");
		}
	}

}
