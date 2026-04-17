package Multi_Condition;

public class exe_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Advanced Grade Calculator (with Fail Condition)
//		If any subject < 35 → Fail
//		If average ≥ 90 → A
//		≥ 75 → B
//		≥ 50 → C
//		else → Fail
		
		int sub1 = 80, sub2 = 60,sub3 = 50;
		
		if (sub1 < 35 || sub2 < 35 || sub3 < 35) {
			System.out.println("Fail");
		}else {
			int avg = (sub1 + sub2 + sub3) /3;
			
			if (avg >= 90) {
				System.out.println("Grad A");
			}else if (avg >= 75) {
				System.err.println("Grad B");
			}else if (avg >= 50) {
				System.out.println("Grad C");
			}else {
				System.out.println("Fail");
			}
		}
		
	}

}
