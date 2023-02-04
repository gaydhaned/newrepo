import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
public class client {
    public static void main(String[] args)throws IOException {
        Socket s=new Socket("LocalHost",1212);
        PrintWriter pr=new PrintWriter(s.getOutputStream());
        pr.print("   ");
        InputStreamReader in= new InputStreamReader(s.getInputStream());
        BufferedReader br=new BufferedReader(in);
        String str=br.readLine();
        System.out.println("string"+str);
        


    }
    
}
