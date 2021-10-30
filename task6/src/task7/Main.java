package task7;

import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter login");
		String login = sc.nextLine();
		
		try {
	    	if (login.length()>20 && (!(login.matches("^[a-z0-9]*$"))));
			throw new WrongLoginException ("Wrong login");
		} catch (WrongLoginException el) {
			el.printStackTrace();
		}
		
		System.out.println("Enter password");
		String password = sc.nextLine();
		
		try {
			if (password.length()>20 && (!(password.matches("^[a-z0-9_]*$"))));
			throw new WrongPasswordException ("Wrong password");
		} catch (WrongPasswordException ep) {
			ep.printStackTrace();
		}
		
		System.out.println("Confirm password");
		String confirmPassword = sc.nextLine();
		System.out.println(confirmPassword.equals(password));
		
		
	}
}