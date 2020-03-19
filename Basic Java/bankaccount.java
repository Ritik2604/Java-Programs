import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class login extends JFrame implements ActionListener{
JTextField tf;
JPasswordField pf;
JButton b;
login(String str){
super(str);
tf=new JTextField(40);
pf=new JpasswordField(50);
setLayout(new BorderLayout());
b=new JButton("Login Page");
add(new JLabel("Username"));
add(tf);
add(new JLabel("Password"));
add(pf);
add(b);
b.addActionListener(this);
}
public void actionPerformed(ActionEvent ae){ 
try{
class.forName("com.mysql.jdbc.Driver");
String url("jdbc:mysql://LocalHost/bank");
Connection con =DriverManager.getConnection(url,"root","root");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("Select * from bankacc where username='"+tf.getText()+"'and password='"+pf.getText()+"'");
if(rs.next()){
bank b1=new bank(s);
b1.setSize(300,400);
b1.setVisible(true);
this.setVisible(false);
}
else{
JOptionPane.showmessageDialog("INVALID USERNAME OR Password")

}}
catch(Exception ae){System.out.println(ae);}
}
public static void main(String arg[]){
login l=new login();
l.setSize(300,400);
l.setVisible(true);

}
}


class bank extends JFrame implements ActionListener,Runnable{
int balance;
int deposit;
JTextField tf1;
List l1;
BufferedReader br;
PrintWriter pw;
JTextArea ta1;
bank(Socket s){
tf1=new JTextField();
ta1=new JTextField();
l1=new List();
setLayout(new BorderLayout());
add(ta1,BorderLyout.CENTER);
add(tf1.BorderLayout.SOUTH);
add(l1,BorderLayout.EAST);
ta1.setEditable(false);
tf1.addActionListener(this);
Thread t=new Thread();
t.start();
}
public void actionPerformed(ActionEvent ae){



}



}