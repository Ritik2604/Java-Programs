package practiceQues;

import java.util.Scanner;

public class CountSameNumInInterval {

	public static Scanner scn=new Scanner(System.in);
	public static int count=0;
	public static boolean dig(long i) {
		long arr[]=new long[String.valueOf(i).length()];
		long div=i;
		long rem=0;int m=0;
		while(div!=0) {
			rem=div%10;
			div=div/10;
			arr[m]=rem;
			m++;
		} 
		m=0;
		while(m<arr.length-1) {
		if(arr[m]!=arr[m+1]) {
			return false;
		}
		m++;
	}
	return true;
}

public static int poly(long n){
	count=0;
	long i=1;
   while(i<=n) {
    	
    	if(dig(i)) {
    		int len=String.valueOf(i).length();
    		String one="";
    		for(int j=1;j<=len;j++) {
    			one+=1;
    		}
    		i=i+Integer.parseInt(one);
    		count++;
    	}
    	else 
    		i++;
    	
    }
    return count;
}
    public static void main(String args[]) {
    	int test=scn.nextInt();
    	for(int i=0;i<test;i++) {
    		long num=scn.nextInt();
    		System.out.println(poly(num));
    	}
    }
}

