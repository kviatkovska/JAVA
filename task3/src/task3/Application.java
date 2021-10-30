package task3;
public class Application {
public static void main (String [] args) {
	 Directory d = new Directory("Математика", "М'яка", 500);
	 Encyclopedia e = new Encyclopedia("Nature", "Тверда", 700);
	 
	 System.out.println("Назва: "+d.getName()+"\nПалітурка: "+d.getType()+"\nТираж: "+d.getQuantity()+
			 "\nНазва: "+e.getName()+"\nПалітурка: "+e.getType()+"\nТираж: "+e.getQuantity());
	 }
}
