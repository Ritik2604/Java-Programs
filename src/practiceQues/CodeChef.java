/* package codechef; // don't place package name! */
package practiceQues;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CodeChef
{
	public static Scanner scan=new Scanner(System.in);
	private static int subsequences(List arr,int k) {
		List <Integer> sum=new ArrayList<>();
		for(int i=0;i<arr.size()-1;i++) {
			for(int j=i+1;j<arr.size();j++)
				sum.add((int)arr.get(i)+(int)arr.get(j));
		}
		int min=(int)sum.get(0);
		for(int i=0;i<sum.size();i++) {
			if(min>(int)sum.get(i)) {
				min=(int)sum.get(i);
			}
		}
		
		int count=0;
		for(int i=0;i<sum.size();i++) {
			if(min==(int)sum.get(i)) {
				count++;
			}
		}
		return count;
	}
	public static void main(String args[]) throws java.lang.Exception{
		int test=scan.nextInt();
		for(int i=0;i<test;i++) {
			int n=scan.nextInt();
			int k=scan.nextInt();
			List<Integer> arr=new ArrayList<Integer>();
			for(int j=0;j<n;j++) 
				arr.add(scan.nextInt());
			System.out.println(subsequences(arr,k));
		}
	}

}

