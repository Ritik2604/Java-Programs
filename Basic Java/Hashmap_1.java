import java.util.*;
class hashmapexample{
public static void main( String ARG[]){
HashMap hm= new HashMap();
hm.put((new Integer(10)),"aa");
hm.put((new Integer(20)),"bb");
hm.put((new Integer(220)),"ee");
hm.put((new Integer(345)),"cc");
hm.put((new Integer(54)),"dd");

Set st= hm.entrySet();
Iterator itr=st.iterator();
while(itr.hasNext()){
Map.Entry me=(Map.Entry)(itr.next());
System.out.println(me.getKey()+" "+me.getValue);
}
}
}