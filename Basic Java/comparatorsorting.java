import java.util.*;
class Sorting implements Comparator<employee>
{
public int compare(employee one,employee two){
return one.empno-two.empno;}

}



class employee
{

int empno;
int empsal;
String empadd;
String empname;
employee(int e,int s,String n,String a){
empno=e;
empsal=s;
empadd=a;
empname=n;
}
void show( ){
System.out.println("the name is :"+empname);
System.out.println("the emplotyee no. is:"+empno);
System.out.println("EMP ADDRESSS:"+empadd);
System.out.println("employee salary:"+empsal);
}

}
class demo{
public static void main (String args[]){
employee e1= new employee(11,1100,"Ritik","fzr");
employee e2= new employee(1,2300,"Akhil","ldh");
employee e3= new employee(4,1200,"Ram","bth");
employee e4= new employee(23,15600,"sham","chd");
ArrayList<employee> ar= new ArrayList<employee>();
ar.add(e1);
ar.add(e2);
ar.add(e3);
ar.add(e4);
ar.add(new employee(42,85112,"mridul","delhi"));

Iterator itr= ar.iterator();
while(itr.hasNext()){
employee e=(employee)(itr.next());
e.show();
}
Sorting s=new Sorting();
Collections.sort(ar,s);
System.out.println("========================");
itr= ar.iterator();
while(itr.hasNext()){
employee e= (employee)(itr.next());
e.show();
}
System.out.println("----------------");

// for searching 
itr= ar.iterator();
while(itr.hasNext()){
employee e= (employee)(itr.next());
if(e.empno==1){
System.out.println("employee no. 1 found");
}
}


}}