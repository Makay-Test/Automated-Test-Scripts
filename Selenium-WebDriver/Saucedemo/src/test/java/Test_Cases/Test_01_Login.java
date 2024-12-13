package Test_Cases;

public class Test_01_Login extends WebDriver {

	public static void main(String[] args) {
		
		Reusable_func login = new Reusable_func();
		
		// Login page
		login.Login();
		getdriver().close();
		}}
