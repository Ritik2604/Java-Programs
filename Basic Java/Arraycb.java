/* // PRIME VISITS
import java.util.*;
public class Arraycb {
    public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		int times=scn.nextInt();
		int time=0;
		
		while(time<times){
			
			int num1=scn.nextInt();
			int num2=scn.nextInt();
			int count=0;
			for(int itr=num1;itr<=num2;itr++){
				int flag=0;
				for(int itr1=1;itr1<itr;itr1++){
				
				if(itr%itr1==0)
					flag++;
				}
				if(flag==1)
				count++;
			}
			System.out.println(count);
			time++;
		}
			
    }
}
*/	
/* //CHEWBEKKA NO. INVERSE AND SHOW LESSER
import java.util.*;
public class Arraycb {
    public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		int i=0,newnum=0;
		while(num>0){
			
			int rem=num%10;
			num=num/10;
			int temp=9-rem;
			if(temp<rem){
				rem=temp;
			}
			newnum+=rem*Math.pow(10,i);
			i++;
		}
		if(Math.pow(10,i-1)>newnum){
			newnum=newnum+(int)(9*Math.pow(10,i-1));
		}
		System.out.println(newnum);
	
	
	}
}
*/
/* //SORT GAME LEXICOGRAPHICAL AND DECREASING
import java.util.*;
import java.io.*;
public class Arraycb {
	static Scanner scn=new Scanner(System.in);
    public static void main(String args[]) throws Exception {
		
		int minSal=scn.nextInt();
		int maxEnt=scn.nextInt();
		String []arr=new String[maxEnt];
		for(int i=0;i<arr.length;i++){
			arr[i]=new BufferedReader(new InputStreamReader(System.in)).readLine();
		}
		for(int counter=0;counter<arr.length;counter++){
			for(int j=0;j<arr.length-1-counter;j++){
				String prev[]=arr[j].split(" ",-1);
				String next[]=arr[j+1].split(" ",-1);
				int prevI=Integer.parseInt(prev[1]);
				int nextI=Integer.parseInt(next[1]);
				if(prevI<nextI){
				String temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
				if(prevI==nextI){
					int val=prev[0].compareTo(next[0]);
					if (val>0){
						String temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
		}
		for(int i=0;i<arr.length;i++){
				String prev[]=arr[i].split(" ",-1);
				int prevI=Integer.parseInt(prev[1]);
				if(prevI<minSal)
					continue;
			System.out.println(arr[i]);
		}
	}
}
*/
/* STRING SORT LESSE CHAR BELOW
import java.util.*;
import java.io.*;
public class Arraycb {
	static Scanner scn=new Scanner(System.in);
    public static void main(String args[]) throws Exception {
		
		
		int maxEnt=scn.nextInt();
		String []arr=new String[maxEnt];
		for(int i=0;i<arr.length;i++){
			arr[i]=new BufferedReader(new InputStreamReader(System.in)).readLine();
		}
		for(int counter=0;counter<arr.length;counter++){
			for(int j=0;j<arr.length-1-counter;j++){
				if(arr[j].compareTo(arr[j+1])>0){
					String temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				} 
				
			}
		}
		for(int i=0;i<arr.length;i++){
			if(i<arr.length-1){
				if(arr[i].length()<arr[i+1].length()){
					if(arr[i].equals(arr[i+1].substring(0,arr[i].length()))){
						String temp=arr[i];
						arr[i]=arr[i+1];
						arr[i+1]=temp;
					}
				}
				else{
					if(arr[i+1].equals(arr[i].substring(0,arr[i+1].length()))){
						String temp=arr[i];
						arr[i]=arr[i+1];
						arr[i+1]=temp;
					}
				}
			}
			System.out.println(arr[i]);
		}
	}
}
*/
/*// SELECTION SORT
import java.util.*;
import java.io.*;
public class Arraycb {
	static Scanner scn=new Scanner(System.in);
    public static void main(String args[]) throws Exception {
		
		
		int maxEnt=scn.nextInt();
		int []arr=new int[maxEnt];
		for(int i=0;i<arr.length;i++){
			arr[i]=scn.nextInt();
		}
		
		for(int counter=0;counter<arr.length;counter++){
			int min=counter;
			for(int j=counter+1;j<arr.length;j++){
				if(arr[min]>arr[j]){
					min=j;
				}
			}
			int temp=arr[counter];
			arr[counter]=arr[min];
			arr[min]=temp;
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
*/
/* //BINARY SEARCH
import java.util.*;
import java.io.*;
public class Arraycb {
	static Scanner scn=new Scanner(System.in);
	static int count=0;
	public int searchel(int[]arr,int low,int mid,int high,int search){
		
		while(low<=high){
			count++;
			mid=(low+high)/2;
			System.out.println(mid);
			if(arr[mid]<search){
				low=mid+1;
			}
			else if(arr[mid]==search){
				return mid;
				
			}
			else{
				high=mid-1;
			}
		}
		return -1;
	}
    public static void main(String args[]) throws Exception {
		System.out.println("Enter length of array");
		int maxEnt=scn.nextInt();
		int []arr=new int[maxEnt];
		System.out.println("Enter Elements of array:");
		for(int i=0;i<1024;i++){
			arr[i]=i;
		}
		System.out.println("Enter no. you want to search");
		int search=scn.nextInt();
		int high=arr.length-1;
		int low=0,mid=0;
		
		
		System.out.println(new Arraycb().searchel(arr,low,mid,high,search) +"      "+count);
	}
}
*/
/* // TARGET 2 SUM 
import java.util.*;
import java.io.*;
public class Arraycb {
	static Scanner scn=new Scanner(System.in);
    public static void main(String args[]) throws Exception {
		int maxEnt=scn.nextInt();
		int []arr=new int[maxEnt];
		for(int i=0;i<arr.length;i++){
			arr[i]=scn.nextInt();
		}
		int target=scn.nextInt();
		for(int counter=0;counter<arr.length;counter++){
			for(int j=0;j<arr.length;j++){
				if(arr[counter]<arr[j]){
				
					if(arr[counter]+arr[j]==target){
						System.out.println(arr[counter]+" and " +arr[j]);
					}
				}
			}
		}
	}
}
*/
/* // WAVE PRINT	
import java.util.*;
import java.io.*;
public class Arraycb {
	static Scanner scn=new Scanner(System.in);
    public static void main(String args[]) throws Exception {
		int maxRow=scn.nextInt();
		int maxCol=scn.nextInt();
		System.out.println("elements");
		int [][]arr=new int[maxRow][maxCol];
		for(int row=0;row<arr.length;row++){
			for(int col=0;col<arr[row].length;col++){
			arr[row][col]=scn.nextInt();	
			}
		}
		for(int row=0;row<arr.length;row++){
			if(row%2==0){
				for(int col=0;col<arr[row].length;col++){
					System.out.print(arr[row][col]+" ");
				}
			}
			else{
				for(int col=arr[row].length-1;col>=0;col--){
					System.out.print(arr[row][col]+" ");
				}
			}
		}
		System.out.print("END");
	}
}
*/
/* //SPIRAL PRINT
import java.util.*;
import java.io.*;
public class Arraycb {
	static Scanner scn=new Scanner(System.in);
    public static void main(String args[]) throws Exception {
		int maxRow=scn.nextInt();
		int maxCol=scn.nextInt();
		System.out.println("elements");
		int [][]arr=new int[maxRow][maxCol];
		int top=0,bottom=arr.length-1,right=maxCol-1,count=(bottom+1)*(right+1),left=0,dir=1;	
		for(int row=0;row<arr.length;row++){
			for(int col=0;col<arr[row].length;col++){
			arr[row][col]=scn.nextInt();	
			}
		}
		System.out.println("===================================");
		while(count!=0){
			if(dir==1){
				for(int col=left;col<=right;col++){
					System.out.print(arr[top][col]+ " ");
					count--;
				}
				top++;
				dir=2;
			}
			else if(dir==2){
				for(int row=top;row<=bottom;row++){
					System.out.print(arr[row][right]+" ");
					count--;
				}
				right--;
				dir=3;
			}
			else if(dir==3){
				for(int col=right;col>=left;col--){
					System.out.print(arr[bottom][col]+" ");
					count--;
				}
				bottom--;
				dir=4;
			}
			else if(dir==4){
				for(int row=bottom;row>=top;row--){
					System.out.print(arr[row][left]+" ");
					count--;
				}
				left++;
				dir=1;
			}
		}
		System.out.print("END");	
	}
}
*/
/* //TARGET SUM 3 NUMBERS
import java.util.*;
import java.io.*;
public class Arraycb {
	static Scanner scn=new Scanner(System.in);
    public static void main(String args[]) throws Exception {
		
		
		int maxEnt=scn.nextInt();
		int []arr=new int[maxEnt];
		// array input
		for(int i=0;i<arr.length;i++){
			arr[i]=scn.nextInt();
		}  
		// arange ascending array
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			} 
		} 
		int left=0,right=arr.length-1;
		int target=scn.nextInt();
		//by O(n^2) sum 3 no.s 
		for(int i=0;i<arr.length-2;i++){
			left=i+1;
			while(left<right){
				if(arr[i]+arr[left]+arr[right]==target){
					System.out.println(arr[i]+ " , "+arr[left]+" and "+arr[right]);
					left++;
				}
				else if(arr[i]+arr[left]+arr[right]>target){
					right--;
				}
				else if(arr[i]+arr[left]+arr[right]<target){
					left++;
				}
			}
		}
	}
}
*/
/* //WAVE COLUMN WISE

import java.util.*;
import java.io.*;
public class Arraycb {
	static Scanner scn=new Scanner(System.in);
    public static void main(String args[]) throws Exception {
		int maxRow=scn.nextInt();
		int maxCol=scn.nextInt();
		System.out.println("elements");
		int [][]arr=new int[maxRow][maxCol];
		// INPUT ARRAY
		for(int row=0;row<arr.length;row++){
			for(int col=0;col<arr[row].length;col++){
			arr[row][col]=scn.nextInt();	
			}
		}
		// PRINT ARRAY WAVE
		for(int row=0;row<arr.length;row++){
			if(row%2==0){
				for(int col=0;col<arr[row].length;col++){
					System.out.print(arr[col][row]+" ");
				}
			}
			else{
				for(int col=arr[row].length-1;col>=0;col--){
					System.out.print(arr[col][row]+" ");
				}
			}
		}
		System.out.print("END");
	}
}	
*/
/* //KTH ROOT incomplete*********************
import java.util.*;
import java.io.*;
public class Arraycb {
	static Scanner scn=new Scanner(System.in);
    public static void main(String args[]) throws Exception {
		long n=scn.nextInt();
		long k=scn.nextInt();
		int pow =(int)Math.pow(n,1/k);
		System.out.println(pow);
		System.out.println((int)pow);
	}
}
*/
/*  // IMAGE ROTATE 90
import java.util.*;
import java.io.*;
public class Arraycb {
	static Scanner scn=new Scanner(System.in);
    public static void main(String args[]) throws Exception {
		int maxRow=scn.nextInt();
		int maxCol=scn.nextInt();
		System.out.println("elements");
		int [][]arr=new int[maxRow][maxCol];
		// INPUT ARRAY
		for(int row=0;row<arr.length;row++){
			for(int col=0;col<arr[row].length;col++){
			arr[row][col]=scn.nextInt();	
			}
		}
		for(int row=0;row<arr.length;row++){
			for(int col=0;col<arr[row].length;col++){
			System.out.print(arr[col][-row+maxRow-1]+"  ");
			}
			System.out.println();
		}
	}
*/
/* //SUM OF TWO ARRAYS
import java.util.*;
import java.io.*;

public class Arraycb {
	static Scanner scn=new Scanner(System.in);
    public static void main(String args[]) throws Exception {
		
		int max=0,num1=0,num2=0;
		int maxEnt=scn.nextInt();
		int []arr=new int[maxEnt];
		for(int i=0;i<arr.length;i++){
			arr[i]=scn.nextInt();
			num1=num1+(int)(arr[i]*Math.pow(10,arr.length-1-i));
		}
		int maxEnt2=scn.nextInt();
		int []arr2=new int[maxEnt2];
		for(int i=0;i<arr2.length;i++){
			arr2[i]=scn.nextInt();
			num2=num2+(int)(arr2[i]*Math.pow(10,arr2.length-1-i));
		}
		System.out.println(num2+num1);
	}
}
*/
/* // LOWER N UPPER BOUND OF SAME ELEMENT IN ARRAY 
import java.util.*;
import java.io.*;

public class Arraycb {
	static Scanner scn=new Scanner(System.in);
	
	public static int lowerBound(int arr[],int arr2){
		int left=0,right=arr.length-1,ans=-1;
		
		while(left<=right){
			int mid=(left+right)/2;
			if(arr[mid]>arr2){
				right=mid-1;
			}
			else if(arr[mid]<arr2){
				left=mid+1;
			}
			else{
				ans=mid;
				right=mid-1;
				
			}
		}
		return ans;
	}
	public static int upperBound(int arr[],int arr2){
		int left=0,right=arr.length-1,ans=-1;
		
		while(left<=right){
			int mid=(left+right)/2;
			if(arr[mid]>arr2){
				right=mid-1;
			}
			else if(arr[mid]<arr2){
				left=mid+1;
			}
			else{
				ans=mid;
				left=mid+1;
				
			}
		}
		return ans;

	}
    public static void main(String args[]) throws Exception {
		
		int max=0,num1=0,num2=0;
		int maxEnt=scn.nextInt();
		int []arr=new int[maxEnt];
		for(int i=0;i<arr.length;i++){
			arr[i]=scn.nextInt();
			num1=num1+(int)(arr[i]*Math.pow(10,arr.length-1-i));
		}
		int testcases=scn.nextInt();
		int arr2[]=new int[testcases];
		for(int i=0;i<testcases;i++){
			arr2[i]=scn.nextInt();
		}
		for(int i=0;i<testcases;i++){
			System.out.print(lowerBound(arr,arr2[i])+" ");
			System.out.println(upperBound(arr,arr2[i]));
		}
	}
}
*/		
/* //	Test question sum 2 power == number
	import java.util.*;
import java.io.*;
public class Main {
    public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		int total=scn.nextInt();
		int num=scn.nextInt(),j=0,i=0,count=0;

		while(i<total){
			j=0;
			while(j<total){
				if(total==Math.pow(num,i)+Math.pow(num,j)&&j>i){
					System.out.println(i+" "+j);
					count++;
				}
				j++;
			}
			i++;
		}
		System.out.println(count);
    }
}
*/
/* // PAINTER'S PARTITION PROBLEM Incomplete************
import java.util.*;
import java.io.*;
public class Arraycb{
	Scanner scn=new Scanner(System.in);
	public static void main(String args[]){
		int painters=scn.nextInt();
		int boards=scn.nextInt();
		int arr[]=new int[boards];
		for(int i=0;i<boards;i++){
			arr[i]=scn.nextInt();
		}
		if(boards<=painters){
			int max=arr[0];
			for(int i=1;i<boards;i++){
				if(arr[i]>max){
					max=arr[i];
				}
				
			}
			System.out.println(max);
		}
		else{
			
		}
	}
}
*/
/* //MATRIX SEARCH
import java.util.*;
import java.io.*;
public class Arraycb {
	static Scanner scn=new Scanner(System.in);
	public int searchel(int arr[][]){
		int search=scn.nextInt();
		
		for(int i=0;i<arr.length;i++){
			if(arr[i][0]<=search&&search<arr[i][arr[i].length-1]){
				for(int j=0;j<arr[i].length;j++){
					if(arr[i][j]==search)
						return 1;
					}
			}
		}
		return 0;
	}
    public static void main(String args[]) throws Exception {
		int maxRow=scn.nextInt();
		int maxCol=scn.nextInt();
		System.out.println("elements");
		int [][]arr=new int[maxRow][maxCol];
		for(int row=0;row<arr.length;row++){
			for(int col=0;col<arr[row].length;col++){
			arr[row][col]=scn.nextInt();	
			}
		}
		System.out.println(new Arraycb().searchel(arr));
	}
}
*/
/* // WINNING CB SCHOLARSHIP
import java.util.*;
import java.io.*;
public class Arraycb{
	static Scanner scn =new Scanner (System.in);
	public static  void main(String args[]){
		int totalStu=scn.nextInt(),discCoup=scn.nextInt(),reqCoup=scn.nextInt(),failCoup=scn.nextInt(),high=totalStu,low=0,ans=0,mid=0;
		while(low<=high){
			mid=(low+high)/2;
			int leftCoup =(totalStu-mid)*failCoup+discCoup;
			if(leftCoup>=reqCoup*mid){
				low=mid+1;
				ans=mid;
			}
			else{
				high=mid-1;
			}
		}
		System.out.println(ans);
		
	}
}
	
*/
/* // MAX LENGTH BIOTONIC SUBSEQUENCE

import java.util.*;
import java.io.*;
public class Arraycb {
	static Scanner scn=new Scanner(System.in);
	public static int longestBiotonic(int arr[]){
		int lrs[]=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			lrs[i]=1;
		}
		for(int i=1;i<arr.length;i++){   //only main thing 
			for(int j=0;j<i;j++){
				if(arr[i]>arr[j]&&lrs[i]<lrs[j]+1){
					lrs[i]=lrs[j]+1;
				}
			}
		}
		int rls[]=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			rls[i]=1;
		}
		for(int i=arr.length-2;i>=0;i--){
			for(int j=arr.length-1;j>i;j--){
				if(arr[i]>arr[j]&&rls[i]<rls[j]+1){
					rls[i]=rls[j]+1;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			lrs[i]=lrs[i]+rls[i]-1;
		}
		int max=lrs[0];
		for(int i=0;i<arr.length;i++){
			if(max<lrs[i])
				max=lrs[i];
		}
		return max;
	}
    public static void main(String args[]) throws Exception {
		
		
		int maxEnt=scn.nextInt();
		int []arr=new int[maxEnt];
		for(int i=0;i<arr.length;i++){
			arr[i]=scn.nextInt();
		}
		System.out.println(longestBiotonic(arr));
	}
}
*/
/*	//MAXIMUM SUB ARRAY SUM
import java.util.*;
import java.io.*;
public class Arraycb{
	static Scanner scn=new Scanner(System.in);
    public static void main(String args[]) throws Exception {	
		int maxEnt=scn.nextInt();
		int []arr=new int[maxEnt];
		for(int i=0;i<arr.length;i++){
			arr[i]=scn.nextInt();
		}
		int max=0,finalMax=0;
		for(int i=0;i<arr.length;i++){
			max=max+arr[i];
			if(max<0){
				max=0;
			}
			else if(max>finalMax){
				finalMax=max;
			}
		}
		System.out.println(finalMax);
	}
}
// WHEN ALL ELE ARE -VE
import java.util.*;
import java.io.*;
public class Arraycb{
	static Scanner scn=new Scanner(System.in);
    public static void main(String args[]) throws Exception {	
		int maxEnt=scn.nextInt();
		int []arr=new int[maxEnt];
		for(int i=0;i<arr.length;i++){
			arr[i]=scn.nextInt();
		}
		int max=arr[0],finalMax=arr[0];
		for(int i=1;i<arr.length;i++){
			max=Math.max(arr[i],max+arr[i]);
			finalMax=Math.max(finalMax,max);
		}
		System.out.println(finalMax);
	}
}
*/
/* //  MAXIMUM CIRCULAR SUM cant understand comple************************
import java.util.*;
import java.io.*;
public class Arraycb{
    public static int maxSubarraySumCircular(int[] A) {
        int N = A.length;

        int ans = A[0], cur = A[0];
        for (int i = 1; i < N; ++i) {
            cur = A[i] + Math.max(cur, 0);
            ans = Math.max(ans, cur);
        }

        // ans is the answer for 1-interval subarrays.
        // Now, let's consider all 2-interval subarrays.
        // For each i, we want to know
        // the maximum of sum(A[j:]) with j >= i+2

        // rightsums[i] = A[i] + A[i+1] + ... + A[N-1]
        int[] rightsums = new int[N];
        rightsums[N-1] = A[N-1];
        for (int i = N-2; i >= 0; --i)
            rightsums[i] = rightsums[i+1] + A[i];

        // maxright[i] = max_{j >= i} rightsums[j]
        int[] maxright = new int[N];
        maxright[N-1] = A[N-1];
        for (int i = N-2; i >= 0; --i)
            maxright[i] = Math.max(maxright[i+1], rightsums[i]);

        int leftsum = 0;
        for (int i = 0; i < N-2; ++i) {
            leftsum += A[i];
            ans = Math.max(ans, leftsum + maxright[i+2]);
        }

        return ans;
    }

	static Scanner scn=new Scanner(System.in);
    public static void main(String args[]) throws Exception {	
		int maxEnt=scn.nextInt(),j=0;
		int []arr2=new int[maxEnt];
		for(int i=0;i<arr2.length;i++){
			arr2[i]=scn.nextInt();
		}
		
		System.out.println(maxSubarraySumCircular(arr2));
	}
}
*/
/* //FORM BIGGEST NUMBER
import java.util.*;
import java.io.*;
class Sorting  implements Comparator<String>{
	public int compare(String a, String b){
            return (b+a).compareTo(a+b);
        }
}
public class Arraycb{
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static String largestNumber(String[] arr) {
		Sorting ac=new Sorting();
    Arrays.sort(arr,ac);
 
    String sb = "";
    for(String s: arr){
        sb+=s;
    }
 
    if(sb.charAt(0)=='0'&&sb.length()>1)
		sb=sb.substring(1);
 
    return sb;
	}
	public static void main(String args[])throws Exception{
		int maxEle=Integer.parseInt(br.readLine());
		String arr[]=new String[maxEle];
		for(int i=0;i<maxEle;i++){
			arr[i]=br.readLine();
		}
		System.out.println(largestNumber(arr));
	}
}
*/
/* // SORTING IN LINEAR TIME
import java.util.*;
import java.io.*;
public class Arraycb{
	static Scanner scn=new Scanner(System.in);
    public static void swap(int arr[],int num1,int num2){
		int temp=arr[num1];
		arr[num1]=arr[num2];
		arr[num2]=temp;
	}
	public static void main(String args[]) throws Exception {	
		int maxEnt=scn.nextInt();
		int []arr=new int[maxEnt];
		for(int i=0;i<arr.length;i++){
			arr[i]=scn.nextInt();
		}
		int low=0,mid=low,high=arr.length-1;
		while(mid<=high){
			if(arr[mid]==0){
				swap(arr,low,mid);
				low++;mid++;
			}
			else if(arr[mid]==1){
				mid++;
			}
			else{
				swap(arr,high,mid);
				high--;
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
*/

