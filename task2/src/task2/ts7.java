package task2;

import java.util.ArrayList;
import java.util.List;

public class ts7 {
public static void main (String [] args) {	
    String text = "Versions: Java5, Java6, Java7, Java8, Java9, Java10.\"";
    
    String split[] = text.split(" ");

    List<String> ch = new ArrayList<String>();
    for(int i = 0; i < split.length; i++){
        if(!ch.contains(String.valueOf(split[i].charAt(0)))){
            ch.add(String.valueOf(split[i].charAt(0)));
        }
    }
    
    for(String c : ch){
        List<String> buffer = new ArrayList<String>();
        for(int i = 0; i < split.length; i++){
            if(String.valueOf(split[i].charAt(0)).equals(c)){
                buffer.add(split[i]);
            }
        }
        if(buffer.size() > 1){
            System.out.println(buffer);
        }
     }
 }
}