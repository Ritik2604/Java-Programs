
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    
    public static void main(String[] args) throws Exception {
        System.out.println("enter no. of digits");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int nDigits=Integer.parseInt(br.readLine());
	br=new BufferedReader(new InputStreamReader(System.in));
	int num=Integer.parseInt(br.readLine());
	int []ar=new int[nDigits];
	for(int i=0;i<nDigits;i++){
		ar[nDigits-1-i]=num%10;
		num=num/10;
	}
	for(int j=0;j<nDigits-1;j++){
	for(int i=0;i<nDigits-1;i++){
		ar[i]=Math.abs(ar[i]-ar[i+1]);
	}
	}
System.out.println(ar[0]);
	
}
}
import java.io.*;
public class Solution {

    
    public static void main(String[] args) throws Exception {
	System.out.println("enter no. of rows");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int rows=Integer.parseInt(br.readLine());
	for(int i=1;i<=4;i++){

		for(int k=0;k<=3-i;k++){
			System.out.print("*");		

		}
		for(int j=1;j<=i*2-1;j++){
			System.out.print(" ");
		}
				
		for(int k=0;k<=3-i;k++){
			System.out.print("*");		

		}
				
		System.out.println();
	}
	for(int i=3;i>=1;i--){

		for(int k=0;k<=3-i;k++){
			System.out.print("*");		

		}
		for(int j=1;j<=i*2-1;j++){
			System.out.print(" ");
		}
				
		for(int k=0;k<=3-i;k++){
			System.out.print("*");		

		}
				
		System.out.println();
	}
	
   }
}

	 0
	909
       89098
      7890987
     678909876
    56789098765
   4567890987654
  345678909876543
 23456789098765432
1234567890987654321



import java.io.*;
public class Solution {

    
    public static void main(String[] args) throws Exception {
	int []ar={1,2,3,4,5,6,7,8,9,0};

	for(int i=1;i<=10;i++){
		for(int j=1;j<=10-i;j++){
			System.out.print(" ");
		}
		int j=10-i;
		for(int k=1;k<=i*2-1;k++){
			
			System.out.print(ar[j]);
			if(k<i){j++;}
			else{j--;}	
				
					

		}			
		System.out.println();
	}
}}
*/
/*
import java.io.*;
public class Solution{

	public static void main (String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int n=Integer.parseInt(br.readLine());
		int row=1;
	int no;
	int nsp=n-1;
	int nst=1;
	while(row<=n)
	{	no=row;
		//spaces
		int sp=1;
		while(sp<=nsp)
		{
			System.out.print(" ");
			sp=sp+1;
		}

		int st=1;
int digit=0;
		while(st<=nst){
			
			
					if(digit<no)
						{	digit=digit+1;
												  
						}
					else if(digit>=no)
						{	digit=digit-1;
								
							
						}
System.out.print(digit);
st++;
		}
		

		nsp=nsp-1;
		nst=nst+2;
		row=row+1;
		System.out.println();


	}

     }
}

import java.util.*;
public class Solution{
    public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		int n=Integer.parseInt(scn.nextLine());
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				if(i==1){
					System.out.print("1");
				}
				else if(j==1||j==i){
					System.out.print(i-1);
				}
				else{
					System.out.print("0");
				}
			}
			System.out.println();
		}
    }
}
