import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class client1 extends JFrame implements ActionListener,Runnable{
JButton b;
Thread t;
Panel p;
JTextArea t1;
JTextField t2;
DatagramSocket ds;
 client1(String c1){
super(c1);
b=new JButton("send");
t1= new JTextArea(300,300);
t2=new JTextField(20);
p=new Panel();
p.add(t2);
p.add(b);
t1.setEditable(false);
setLayout(new BorderLayout());	
add(t1,BorderLayout.CENTER);
add(p,BorderLayout.SOUTH);
b.addActionListener(this);
t=new Thread(this);
try{
ds=new DatagramSocket(1600);
t.start();
}
catch(Exception e){System.out.println(e);}

}
public void actionPerformed(ActionEvent ae){
try{

String s1=t2.getText();
DatagramPacket dp1=new DatagramPacket(s1.getBytes(),s1.length(),InetAddress.getLocalHost(),1700);
ds.send(dp1);
//t2.setText("");
}
catch (Exception e)
{System.out.println(e);}
}
public void run() {
try{
while(true){

byte b[]=new byte [100];
DatagramPacket dp2=new DatagramPacket(b,100);
ds.receive(dp2);
String str="";
for(int i=0;b[i]>0;i++){
str=str+(char)(b[i]);
} 

t1.append(str+"\n");
}
}
catch(Exception e){System.out.println(e);}
}
public static void main (String A[])
{
client1 c1=new client1("client1");
c1.setSize(500,500);
c1.setVisible(true);
}
}



