package Multi_Condition;

public class exe_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	Employee Bonus Calculator
		//	Experience ≥ 5 years AND salary < 50,000 → 20% bonus
		//	Experience ≥ 3 years → 10% bonus
		//	Otherwise → no bonus
		
		int experience = 7;
		double salary = 80000;
		
		if (experience >= 5 && salary < 50000) {
			salary = salary * 1.2;
			System.out.println("If 5 year It 20% bonus");
		}else if (experience > 3) {
			salary = salary * 1.1;
			System.out.println("If 3 year It 10% bouns");
		}else {
			System.out.println("1 to 2 year no bouns for that");
		}
		
		System.out.println("Final salary is " + salary);
	}

}
