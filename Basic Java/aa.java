import java.util.*;
class demo1{
public static void main ( String s[]){

ArrayList obj= new ArrayList();
obj.add("first");
obj.add("second");
obj.add("third");
obj.add("fourth");
obj.add("fourth");
obj.add("fifth");
obj.add("sixth");
System.out.println(obj);
obj.remove (4);
obj.add(0,"zeroth");
System.out.println(obj);
obj.add("seventh");
System.out.println(obj.get(5));
System.out.println(obj.size());
System.out.println(obj.contains("fourth"));
}}