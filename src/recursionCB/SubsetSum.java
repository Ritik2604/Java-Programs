package recursionCB;

import java.util.Scanner;

public class SubsetSum {
	public static Scanner scn=new Scanner(System.in);
	public static int count=0;
	public static int IsSumZero(int arr[],int vidx,int sum) {
		if(vidx==arr.length) {
			if(sum==0)
				return count++;
			else 
				return count;
		}
		
		IsSumZero(arr,vidx+1,sum+arr[vidx]);
		IsSumZero(arr,vidx+1,sum);
		
			return count;
		
	}
	public static void main(String args[]) {
		int maxEl=scn.nextInt();
		int arr[]=new int[maxEl];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		System.out.println(IsSumZero(arr,0,0));
	}
}
