package task3;
public class Application {
public static void main (String [] args) {
	 Directory d = new Directory("����������", "�'���", 500);
	 Encyclopedia e = new Encyclopedia("Nature", "������", 700);
	 
	 System.out.println("�����: "+d.getName()+"\n��������: "+d.getType()+"\n�����: "+d.getQuantity()+
			 "\n�����: "+e.getName()+"\n��������: "+e.getType()+"\n�����: "+e.getQuantity());
	 }
}
