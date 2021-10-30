import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1 {
    int offset=3;
    public String encrypt(String s) throws IOException


    {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char t=s.charAt(i);
            if(t>='A' && t<='Z')
            {
                int t1=t-'A'+offset;
                t1=t1%26;
                sb.append((char)(t1+'A'));
            }
            else if(t>='a' && t<='z')
            {
                int t1=t-'a'+offset;
                t1=t1%26;
                sb.append((char)(t1+'a'));
            }
        }
        return sb.toString();
    }


    public String decrypt(String s) throws IOException
    {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char t=s.charAt(i);
            if(t>='A' && t<='Z')
            {
                int t1=t-'A'-offset;
                if(t1<0)t1=26+t1;
                sb.append((char)(t1+'A'));
            }
            else if(t>='a' && t<='z')
            {
                int t1=t-'a'-offset;
                if(t1<0)t1=26+t1;
                sb.append((char)(t1+'a'));
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        try
        {
            System.out.println("Автоматизований шифр Цезаря");
            BufferedReader b;
            String oriTxt,encTxt,decTxt;
            System.out.println("Введіть текст, щоб зашифрувати:");
            b=new BufferedReader(new InputStreamReader(System.in));
            oriTxt=b.readLine();
            task1 c=new task1();
            encTxt=c.encrypt(oriTxt);
            System.out.println("Зашифрований текст:"+encTxt);
            decTxt=c.decrypt(encTxt);
            System.out.println("Розшифрований текст:"+decTxt);
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
}
