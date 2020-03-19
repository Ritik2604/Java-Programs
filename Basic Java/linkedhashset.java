import java.util.*;
class treesetexamp{
public static void main(String s[])
{ 

 System.out.println("learning collection ");

LinkedHashSet obj = new LinkedHashSet();

obj.add("ritik");
obj.add("is");
obj.add("becoming a ");
obj.add("developer");
 System.out.println(obj);
Iterator itr=obj.iterator();
while(itr.hasNext()){

 System.out.println(itr.next());
	}




Iterator itr1=obj.descendingIterator();
while(itr1.hasNext()){

 System.out.println(itr1.next());
	}

}
}