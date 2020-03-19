import java.net.*;
import java.awt.*;
import javax.swing.*;


class receive extends JFrame implements Runnable{
Thread t;
JTextArea t1;
receive(String r){
super(r);
t1=new JTextArea();
add(t1);
t=new Thread(this);
t.start();
}
public void run(){
try{
byte b[]= new byte[100];
DatagramSocket ds=new DatagramSocket(700);
DatagramPacket dp=new DatagramPacket(b,100);
System.out.println("message receiving");
ds.receive(dp);
ds.close();
String s="";
for(int i=0;b[i]>0;i++){
s=s+(char)(b[i]);
t1.setText(s);
}}
catch(Exception e){
System.out.println(e);
}
}
public static void main(String arg[]) throws Exception
 {
	receive r=new receive("reciever");
	r.setSize(300,300);
	r.setVisible(true);
 }
}
