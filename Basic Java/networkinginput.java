import java.net.*;
import java.io.*;

class client1{
public static void main(String args[]) throws Exception{
DatagramSocket ds=new DatagramSocket(600);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
DatagramPacket dp;
while(true){
System.out.println("Enter your message");
String msg=br.readLine();
dp=new DatagramPacket(msg.getBytes(),msg.length(),InetAddress.getLocalHost(),700);
ds.send(dp);
//recieving 
byte b[]=new byte[100];
DatagramPacket dp2=new DatagramPacket (b,100);
System.out.println("message receivng");
ds.receive(dp2);
System.out.write(b);
}
}}