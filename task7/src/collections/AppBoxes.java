package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List; 

public class AppBoxes {
	 public static List<Box> moveWhenBiggerThan300Grams(List<Box> boxList) {
	        List<Box> result = new ArrayList<>();
	        Iterator<Box> iterator = boxList.iterator();
	        while (iterator.hasNext()) {
	            Box box = iterator.next();
	            if (box.getGrams() >= 300) {
	                result.add(box);
	                iterator.remove();
	            }
	        }
	        return result;
	    }

	    public static void main(String[] args) {
	        List<Box> boxList = new ArrayList<>();
	        boxList.add(new Box(1, "apples", 100));
	        boxList.add(new Box(2, "peaches", 200));
	        boxList.add(new Box(3, "bananas", 300));
	        boxList.add(new Box(4, "pineapples", 400));
	        boxList.add(new Box(5, "cherry", 500));

	        List<Box> result = moveWhenBiggerThan300Grams(boxList);
	        System.out.println("Heavy boxes: \n" + result);
	        System.out.println("Easy boxes: \n" + boxList);
	    }
	}