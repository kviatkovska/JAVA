package task2;

public class ts1 {
	
public static void main (String [] args) {
	
String s = "I study Java!!!"; //1.1

char result = s.charAt(14); //1.2

boolean start, end;
start = s.startsWith("I study"); //1.3
end = s.endsWith("!!!"); //1.4

int index = s.indexOf('J'); 
int lindex = s.lastIndexOf('a'); //1.5

String repl = s.replace('a', 'o'); //1.6

String tlc = s.toLowerCase(); //1.7

String tuc = s.toUpperCase(); //1.8

String substr = s.substring(0, 8); //1.9

System.out.println("Results: " + 
"\n �1:" + s +
"\n �2:" + result +
"\n �3:" + start +
"\n �4:" + end +
"\n �5:" + index + ", " + lindex +
"\n �6:" + repl +
"\n �7:" + tlc +
"\n �8:" + tuc +
"\n �9:" + substr); 
 }
}
