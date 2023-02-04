import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
public class server {
    public static void main(String[] args)throws IOException 
    {
        ServerSocket ser=new ServerSocket(1212);
        Socket s=ser.accept();
        System.out.println("client connected");
        InputStreamReader in=new InputStreamReader(s.getInputStream());
        BufferedReader bff=new BufferedReader(in);
        String str=bff.readLine();
        System.out.println("client"+str);
        PrintWriter pr=new PrintWriter(s.getOutputStream());
        pr.print("yes");
        pr.flush();
    }
}
