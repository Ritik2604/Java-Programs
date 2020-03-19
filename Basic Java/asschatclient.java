import java.io.*;
import java.net.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

class client extends JFrame implements ActionListener,Runnable{
JTextArea ta2;
JTextField tf2;
BufferedReader br;
PrintWriter pw;
List ls;
String name;
client(String title){
super(title);
name= title;
setLayout(new BorderLayout());
ta2=new JTextArea(50,50);
tf2 =new JTextField();
ls =new List();
ta2.setEditable(false);
setLayout(new BorderLayout());
add(ta2,BorderLayout.CENTER);
add(tf2,BorderLayout.SOUTH);
add(ls,BorderLayout.EAST);
tf2.addActionListener(this);

try{
Socket s=new Socket(InetAddress.getLocalHost(),600);
br=new BufferedReader(new InputStreamReader(s.getInputStream()));
pw =new PrintWriter(s.getOutputStream(),true);
pw.println("~"+title);

}
catch(Exception e){System.out.println(e);}
Thread t=new Thread(this);
t.start();
}
public void actionPerformed(ActionEvent ae){
String rec=ls.getSelectedItem();    

String str="<"+rec+">"+name+":"+tf2.getText();
pw.println(str);
tf2.setText("");


}
public void run(){
try{
while(true){
String str=br.readLine();
if(str.charAt(0)=='~'){
ls.add(str.substring(1));
}
else{
ta2.append(str+"\n");}
}}
catch(Exception e){System.out.println(e);}
}
}


class login extends JFrame implements ActionListener{
JTextField tf;
JPasswordField pf;
JButton b;
JButton b1;
login(String str){
super(str);
setLayout(new FlowLayout());
tf=new JTextField(20);
pf=new JPasswordField(20);
b=new JButton("Login");
b1 =new JButton("Register");
add(new JLabel("Username"));
add(tf);
add(new JLabel("Password"));
add(pf);
add(b1);
add(b);
b.addActionListener(this);
b1.addActionListener(this);
}

public void actionPerformed(ActionEvent ae){
try{
if(ae.getSource()==b1){
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://LocalHost/chat";
Connection con=DriverManager.getConnection(url,"root","root");
Statement st=con.createStatement();
ResultSet rs= st.executeQuery("Select * from dbchat where username='"+tf.getText()+"'and password='"+pf.getText()+"'" );
if(rs.next()){JOptionPane.showMessageDialog(null,"you are Registered ");}
else{
String query="insert into dbchat values('"+tf.getText()+"','"+  pf.getText()+"')";
st.executeUpdate(query);
JOptionPane.showMessageDialog(null,"Register Successfully!!");}
tf.setText("");
pf.setText("");
}
else{
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://LocalHost/chat";
Connection con=DriverManager.getConnection(url,"root","root");
Statement st=con.createStatement();

ResultSet rs= st.executeQuery("Select * from dbchat where username='"+tf.getText()+"'and password='"+pf.getText()+"'" );
if(rs.next()){
client cc=new client(tf.getText());//username send kiya
cc.setSize(400,300);
cc.setVisible(true);
this.setVisible(false);
}
else{
JOptionPane.showMessageDialog(null,"REGISTER FIRST");
}
}}
catch(Exception e){System.out.println(e);}
}
public static void main(String arg[]){
login l=new login("Login Page");
l.setSize(300,400);
l.setVisible(true);
}


}