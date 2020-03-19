package recursionCB;

import java.util.Scanner;

public class replaceAllPi {
	public static Scanner scn =new Scanner(System.in);
	public static String replacePi(String str,int vidx) {
		
		if(str.length()==vidx) 
			return str;
		String res=replacePi(str,vidx+1);
		if(res.length()>vidx+1 && res.charAt(vidx)=='p' && res.charAt(vidx+1)=='i') {
			res=res.substring(0,vidx)+"3.14"+res.substring(vidx+2);
		} 
			return res;
	}
	
	public static void main(String args[])throws Exception {
		int testCase=scn.nextInt();
		int vid=0;
		String str="";
		for(int i=0;i<testCase;i++) {
			str=scn.next();
			System.out.println(replacePi(str,vid));

		}
		System.out.println(str.substring(3).getClass());
	}
}
