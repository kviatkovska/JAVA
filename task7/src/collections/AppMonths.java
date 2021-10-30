package collections;
import java.util.ArrayList;
import java.util.List;
public class AppMonths {
	 public static void main(String[] args) {
    	List<Months> monthsList = new ArrayList<>();
    	monthsList.add(new Months(1, "January"));
    	monthsList.add(new Months(2, "February"));
    	monthsList.add(new Months(3, "March"));
    	monthsList.add(new Months(4, "April"));
    	monthsList.add(new Months(5, "May"));    	
    	monthsList.add(new Months(6, "June"));   
    	monthsList.add(new Months(7, "July"));    	
    	monthsList.add(new Months(8, "Augest"));    	
    	monthsList.add(new Months(9, "September"));    	
    	monthsList.add(new Months(10, "October"));    	
    	monthsList.add(new Months(11, "November"));    	
    	monthsList.add(new Months(12, "December"));    		
    	System.out.println(monthsList);
	 }
}