package StackQueue;
import java.util.*;
public class StockSpan {
	/*package whatever //do not write package name here */

	    public static Scanner scn=new Scanner(System.in);
	    public static int[] SpanDay(int arr[]) {
	  	Stack<Integer> stack=new Stack<>();
			int i=0;
			int span[]=new int[arr.length];
			while(i<arr.length) {
				span[i]=1;
				if(stack.isEmpty()) {
					
				}else if(stack.peek()<=arr[i]) {
					span[i]=stack.size()+1;
					
				}else {
					while(!stack.isEmpty()) {
						stack.pop();
					}
				}
				stack.push(arr[i]);
				i++;
			}
			return span;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int test=scn.nextInt();
			for(int k=0;k<test;k++){
		    	int size=scn.nextInt();
		    	int arr[]=new int[size];
		    	for(int i=0;i<size;i++)
		    	    arr[i]=scn.nextInt();
			    int span[]=SpanDay(arr);
			    for(int i=0;i<span.length;i++) {
			    	System.out.print(span[i]+" ,");
			    }
			    System.out.println("END");
		    }
		}



}
