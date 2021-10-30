package collections;

import java.util.ArrayList;
import java.util.List;

public class AppStudents {
	public static void main(String[] args) {
    	List<Students> studentsList = new ArrayList<>();
    	studentsList.add(new Students("January", true));
    	studentsList.add(new Students("February", false));
    	studentsList.add(new Students("March", true));
    	studentsList.add(new Students("April", false));
    	studentsList.add(new Students("May", true));    	
    	studentsList.add(new Students("June", false));   
    	studentsList.add(new Students("July", true));    	
    	studentsList.add(new Students("Augest", false));    	
    	studentsList.add(new Students("September", true));    	
    	studentsList.add(new Students("October", false));    	
    	studentsList.add(new Students("November", false));    	
    	studentsList.add(new Students("December", false));    		
    	System.out.println(studentsList);
	 }
}