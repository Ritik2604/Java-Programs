import java.util.*;
class demo {
public static void main(String s[])
{ 

 System.out.println("learning collection ");
HashSet obj =new HashSet();

obj.add("Ritik");
obj.add("is");
obj.add("becoming a ");
obj.add("developer");
 System.out.println(obj);
Iterator itr=obj.iterator();
while(itr.hasNext()){

 System.out.println(itr.next());
	}
obj.remove("becoming a ");

 System.out.println(obj);
}
}