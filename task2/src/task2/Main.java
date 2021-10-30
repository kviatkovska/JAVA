package task2;

import java.util.ArrayList;

public class Main {
		    public static void main(String[] args) {
	        ArrayList<Employee> employers = new ArrayList<Employee>();

	        Employee firstEmployee = new Employee();
	        firstEmployee.setFullname("Makarcuk");
	        firstEmployee.setSalary(5000);
	        employers.add(firstEmployee);

	        Employee secondEmployee = new Employee();
	        secondEmployee.setFullname("Onischuk");
	        secondEmployee.setSalary(5500);
	        employers.add(secondEmployee);
	        
	        Employee thirdEmployee = new Employee();
	        thirdEmployee.setFullname("Parhomchuk");
	        thirdEmployee.setSalary(6000);
	        employers.add(thirdEmployee);

	        Report.genereteReported(employers);

	    }
	}