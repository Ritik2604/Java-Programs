package recursionCB;

import java.util.Scanner;

public class keypadCodes {
	public static Scanner scn=new Scanner(System.in);
	public static void keypad(String str1,String str2,int ind1,int ind2) {
		if(str1.length()==ind1)  {
			
			return ;
		}
		System.out.print("  "+str1.charAt(ind1)+str2.charAt(ind2));

		if(ind2==str2.length()-1) {
			keypad(str1,str2,ind1+1,0);
		}
		else {
			keypad(str1,str2,ind1,ind2+1);
		}
		return;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String kv[]= {"","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
		String key=scn.next();
		int fs=Integer.parseInt(key.substring(0,1));
		int sd=Integer.parseInt(key.substring(1,2));
		keypad(kv[fs],kv[sd],0,0);

	}

}
