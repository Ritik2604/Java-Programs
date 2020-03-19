import java.util.*;
import java.net.*;
import java.io.*;

class client2{
public static void main(String arg[]) throws Exception{
Socket s1=new Socket(InetAddress.getLocalHost(),20);
PrintWriter pw=new PrintWriter(s1.getOutputStream(),true);
pw.println("client2");

BufferedReader br=new BufferedReader(new InputStreamReader(s1.getInputStream()));
String str=br.readLine();
System.out.println(str);
pw.close();
s1.close();

}}