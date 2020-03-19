import java.util.*;
import java.net.*;
import java.io.*;

class server
{
static Vector v1=new Vector();
public static void main(String arg[]) throws Exception{
ServerSocket ss=new ServerSocket(600);
while(true)
	{
	System.out.println("message recieving");
	Socket s=ss.accept();
	ServerThread st=new ServerThread(s);
	v1.addElement(st);
	}
}
public synchronized static void login(String str){
Enumeration e=v1.elements();
while(true){
ServerThread st=(ServerThread)(e.nextElement());
st.send(str);
if(!e.hasMoreElements()){
	Enumeration e1=v1.elements();
	while(true){
	ServerThread st1=(ServerThread)(e1.nextElement());
	System.out.println("in login start sends");
	if(e1.hasMoreElements())
		{st.send("~"+st1.name);
		System.out.println("in login last sends");}
	else{break;}
	}
}
}
}
public synchronized static void communicate(String str){

int in=str.indexOf('>');
int col=str.indexOf(':');
String reciever=str.substring(1,in);
String msg=str.substring(in+1);
String sender=str.substring((in+1),col);
Enumeration e=v1.elements();
while(e.hasMoreElements()){
ServerThread st=(ServerThread)(e.nextElement());
if(reciever.equals( st.name)||reciever.equals("null")||sender.equals(st.name))
{
	System.out.println("in communicate if");
st.send(msg);}
}
}
}
class ServerThread implements Runnable{
BufferedReader br;
PrintWriter pw;
String name;
ServerThread(Socket s)
{
try{
br=new BufferedReader(new InputStreamReader(s.getInputStream()));
pw=new PrintWriter(s.getOutputStream(),true);
Thread t=new Thread(this);
t.start();
}
catch(Exception e){System.out.println(e);}
}
public void run(){
try{
while(true){
String str=br.readLine();
if(str.charAt(0)=='~'){
name=str.substring(1);
server.login(str);}
else{
server.communicate(str);
}}
}
catch(Exception e){System.out.println(e);}
}


public void send(String str){
try{
	
pw.println(str);//auto flush

}
catch(Exception e){System.out.println(e);}
}

}
