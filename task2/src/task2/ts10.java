package task2;
public class ts10 {
   public static void main(String[] args) {
   String Str="Homework consist of task 123 324 111 4554 ";
   String[] list=Str.split(" ");
     for (String p:list) {
       for (int i=0; i<p.length()/2; i++) {
         int r=0;
           if (p.charAt(i) == p.charAt(p.length()-1-i)) {
	           r++;
               }
     if (r==p.length()/2-i) {
    System.out.println("result: " + p);
     }
       }
     }
   }
}