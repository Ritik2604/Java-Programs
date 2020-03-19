import java.net.*;
class demo10{
public static void main(String args[]) throws Exception{
byte b[]=new byte[100];
DatagramPacket dp=new DatagramPacket(b,100);
DatagramSocket ds=new DatagramSocket(1650);
System.out.println("message recieving");
ds.receive(dp);
ds.close();
System.out.write(b);
}}