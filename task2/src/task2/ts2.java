package task2;

public class ts2 {
	public static void main( String args [] ) {
	StringBuilder sb=new StringBuilder("44+32=76; ");
	sb.append("44-32=12; 44*32=1408;");
	sb.deleteCharAt(5);
	sb.insert(5, " дорівнює ");
	sb.deleteCharAt(24);
	sb.insert(24, " дорівнює ");
	sb.deleteCharAt(43);
	sb.insert(43, " дорівнює ");
	sb.replace(6, 14, "=");
	sb.replace(18, 26, "=");
	sb.replace(30, 38, "=");
	System.out.println(sb); 
 }
}
