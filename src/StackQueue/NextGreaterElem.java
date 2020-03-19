package StackQueue;
import java.util.*;
public class NextGreaterElem {
	public static Scanner scn=new Scanner(System.in);
	public static void NextGreater(int[] arr) {
		Stack<Integer> s=new Stack<>();
		int n=arr.length;
		int arr1[] = new int[n];  
	    // iterating from n-1 to 0  
	    for (int i = 2*(n)-1; i>=0 ; i--)  
	    {  
	        /*We will pop till we get the  
	        greater element on top or stack gets empty*/
	        while (!s.isEmpty() && s.peek() <= arr[i%n])  
	            s.pop();  
	        /*if stack gets empty means there  
	        is no element on right which is greater  
	        than the current element.  
	        if not empty then the next greater  
	        element is on top of stack*/
	        if (s.empty())  
	            arr1[i%n] = -1;          
	        else
	            arr1[i%n] = s.peek();          
	        s.push(arr[i%n]);  
	    }  
	    for (int i = 0; i < n; i++)  
	        System.out.println(arr[i] + " ---> " + arr1[i]);  
	}
	public static void main(String[] args){
		// TODO Auto-generated method stub
		int size=scn.nextInt();
    	int arr[]=new int[size];
    	for(int i=0;i<size;i++)
    	    arr[i]=scn.nextInt();
    	NextGreater(arr);
	}
}
