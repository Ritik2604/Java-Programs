
package recursionCB;

import java.util.ArrayList;
import java.util.Scanner;

public class SmartKeypad {
	public static Scanner scn=new Scanner(System.in);
	public static ArrayList <String> smart(String str1,String str2,int ind1,int ind2)throws Exception{
		if(str1.length()==ind1) {
			ArrayList <String> baseResult=new ArrayList<>();
			return baseResult;
		}
		ArrayList <String> recResult;
		if(ind2==str2.length()-1) {
			recResult=smart(str1,str2,ind1+1,0);
		}
		else {
			recResult= smart(str1,str2,ind1,ind2+1);
		}
		ArrayList<String> myResult=new ArrayList <>();
		myResult.add(""+str1.charAt(ind1)+str2.charAt(ind2));
		for(int i=0;i<recResult.size();i++) {
			myResult.add(recResult.get(i));
		}
		
		return myResult;
		
	}
	public static void main(String args[])throws Exception {
		String Table[]= {" ",".+@$","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		String num=scn.next();
		int firs=Integer.parseInt(num.substring(0,1));
		int sec=Integer.parseInt(num.substring(1,2));
		
		System.out.print(smart(Table[firs],Table[sec],0,0));
	}
}
