package recursionCB;

import java.util.Scanner;

public class convertStrToInt {
	public static Scanner scn=new Scanner(System.in);
	public static int count=0,sum=0;
	public static int ToInt(String str ) {
		if(str.length()==0)
			return 0;
		int dig=Integer.parseInt(str.substring(0,1));
		int sum=ToInt(str.substring(1));
		sum=sum+(int)Math.pow(10,count++)*dig;
		return sum;
		
	}
	public static void main(String args[]) {
		String str=scn.next();
		System.out.println(ToInt(str));
	}

}
