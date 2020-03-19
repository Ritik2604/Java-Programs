package recursionCB;

import java.util.Scanner;

public class removeDuplicate {
	public static Scanner scn=new Scanner(System.in);
	public static int count=0;
	public static void duplicatChar(String str,String result) {
		if(str.length()==1) {
			System.out.println(result+str);
			return;
		}
		if(str.charAt(0)==str.charAt(1)) {
			duplicatChar(str.substring(1),result);
			
		}
		else
			duplicatChar(str.substring(1),result+str.charAt(0));
	}
	public static void xAtend(String str,String result) {
		if(str.length()==1) {
			result+=str;
			for(int i=0;i<count;i++)
				result+="x";
			System.out.println(result);
			return;
		}
		if(str.charAt(0)=='x') {
			count++;
			xAtend(str.substring(1),result);
			
		}
		else
			xAtend(str.substring(1),result+str.charAt(0));
	}
	public static void main(String args[]) {
		String str= scn.next();
		xAtend(str,"");
	}
}
