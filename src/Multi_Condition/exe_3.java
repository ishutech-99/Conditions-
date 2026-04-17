package Multi_Condition;

public class exe_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Login Validation (Automation Style)
//		Check username and password.
		
		String username = "admin";
		String password = "12345";
		
		if (username.equals("admin") && password.equals("12345")) {
			System.out.println("Login Successful");
		}else {
			System.out.println("Invalid Password");
		}
	}

}
