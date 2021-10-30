package task2;

import java.util.ArrayList;

public class Report {
  public static void genereteReported(ArrayList<Employee> employers) {
    for (Employee employee : employers) {
        String formattedString = String.format("%-15s%.2f\n", employee.getFullname(), employee.getSalary());
        System.out.print(formattedString);
	        }
	    }
	}