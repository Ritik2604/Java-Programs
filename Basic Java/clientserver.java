import java.net.*;
import java.io.*;
class client{
public static void main(String arg[]) throws Exception{
Socket s=new Socket(InetAddress.getLocalHost(),1700);
OutputStream os=s.getOutputStream();
String s1="hello server";
PrintWriter pw=new PrintWriter(os);
pw.println("hello server");
pw.flush();


}}