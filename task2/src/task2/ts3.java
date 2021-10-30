package task2;

public class ts3 {
	public static void main (String args [] ) {
		StringBuilder sb1 = new StringBuilder("I study Object Oriented Programming. "
				+ "I like object oriented programming.");
		sb1.replace(8, 35, "oop");
		sb1.replace(20, 47, "oop");
		System.out.println("I study Object Oriented Programming. I like object oriented programming." + "\n" + sb1);
	}
}
