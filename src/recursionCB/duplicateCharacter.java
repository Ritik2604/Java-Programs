package recursionCB;

import java.util.Scanner;

public class duplicateCharacter {
	public static Scanner scn=new Scanner(System.in);
	public static void duplicatChar(String str,String result) {
		if(str.length()==1) {
			System.out.println(result+str);
			return;
		}
		if(str.charAt(0)==str.charAt(1)) {
			duplicatChar(str.substring(1),result+str.charAt(0)+"*");
			
		}
		else
			duplicatChar(str.substring(1),result+str.charAt(0));
	}
	public static void main(String args[]) {
		String str= scn.next();
		duplicatChar(str,"");
	}
}
