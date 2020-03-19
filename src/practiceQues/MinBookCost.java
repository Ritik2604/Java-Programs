package practiceQues;

import java.util.Arrays;
import java.util.Scanner;

public class MinBookCost {
	public static Scanner scn=new Scanner(System.in);
	public static int minCost(int []cost,int numCust) {
		int sum=0;
		int count=1;
		int i=cost.length-1;
		while(i>=0) {
			for(int j=i;j>i-numCust&&j>=0;j--) {
				sum=sum+count*cost[j];
			}
			count++;
			i=i-numCust;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numBooks=scn.nextInt();
		int numCust=scn.nextInt();
		int cost[]=new int[numBooks];
		for(int i=0;i<numBooks;i++) {
			cost[i]=scn.nextInt();
		}
		Arrays.sort(cost);
		if(numBooks<numCust)
			numCust=numBooks;
		System.out.println(MinBookCost.minCost(cost,numCust));
		
	}

}
