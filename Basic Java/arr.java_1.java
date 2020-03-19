import java.util.*;
class employee{
int empno;
String address;
String name;
int salary;
employee(int e,String a,String n,int s){
empno=e;
address=a;
name=n;
salary=s;
}
void show(){
System.out.println("employee no." +empno);
System.out.println("employee name:"+name);
System.out.println("employee address"+address);
System.out.println("employee salary"+salary);
}
}
class demo{
public static void main (String arg[]){
employee e1= new employee(1,"fzr","ritik",10000);

employee e2= new employee(2,"chd","yuvi",6000);
employee e3= new employee(3,"har","mohit",4000);
employee e4= new employee(4,"del","dinesh",2000);
ArrayList<employee> ar= new ArrayList<employee>();
ar.add(e1);
ar.add(e2);
ar.add(e3);
ar.add(e4);
ar.add(new employee(5,"raj","rachit",800));


Iterator<employee> itr= ar.iterator();
while(itr.hasNext()){
employee e=itr.Next();
e.show();
System.out.println("==============");

}
}}