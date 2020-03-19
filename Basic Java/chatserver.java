import java.util.*;
import java.net.*;
import java.io.*;

class server
{
static Vector v1=new Vector();
static String names[]=new String[20];
static int i =0;
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
names[i]=str.substring(1);
i++;
Enumeration e=v1.elements();
while(true){
ServerThread st=(ServerThread)(e.nextElement());
st.send(str);
if(!e.hasMoreElements()){
for(int j=0;j<i-1;j++){st.send("~"+names[j]);}
break;
}
}
}
public synchronized static void communicate(String str){

int in=str.indexOf('>');
String reciever=str.substring(1,in);
String msg=str.substring(in+1);
int k=0;
Enumeration e=v1.elements();
while(e.hasMoreElements()){
ServerThread st=(ServerThread)(e.nextElement());
if(reciever.equals( names[k++] )||reciever.equals("null"))
{
st.send(msg);}
}
}
}
class ServerThread implements Runnable{
BufferedReader br;
PrintWriter pw;
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
if(str.charAt(0)=='~')
server.login(str);
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
