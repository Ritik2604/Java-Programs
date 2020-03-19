import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
class sender extends JFrame implements ActionListener {
JTextArea t;
JButton b;
sender(String r){
super(r);
t=new JTextArea();
b=new JButton("send");
setLayout(new BorderLayout());
add(t,BorderLayout.CENTER);
add(b,BorderLayout.SOUTH);
b.addActionListener(this);
}
public void actionPerformed(ActionEvent ae) {
try{
String s=t.getText();
DatagramSocket ds=new DatagramSocket(600);
DatagramPacket dp=new DatagramPacket(s.getBytes(),s.length(),InetAddress.getLocalHost(),700);
ds.send(dp);
ds.close();}
catch(Exception e){System.out.println(e);}
}
public static void main(String arg[]){
sender s1=new sender("sender yipee");
s1.setSize(300,300);
s1.setVisible(true);
}
}

