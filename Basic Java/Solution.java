/*
import java.util.*;
public class Solution{
    public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int n=Integer.parseInt(scan.nextLine());
		int []ar=new int[n];
		for(int i=0;i<n;i++){
			Scanner scn=new Scanner(System.in);
			ar[i]=Integer.parseInt(scn.nextLine());
		}
		for(int i=0;i<n;i++){
			int sum=0;
			int div=ar[i];
			int j=0;
			int no=0;
			while(div!=0){
				int rem =div%10;
				div=div/10;
				no=rem*(int)(Math.pow(2,j));
				j++;
				sum=sum+no;
			}
			System.out.println(sum);
		}
	}
}

import java.util.*;
public class Solution{
    public static void main(String args[]) {
        int sum=0;
        int []ar=new int [20];
        int i=0;
        while (sum>=0){
            Scanner scn =new Scanner(System.in);
            ar[i]=Integer.parseInt(scn.nextLine());
            sum=sum+ar[i];
            i++;
        }
        for(int j=0;j<i-1;j++){
            System.out.println(ar[j]);
        }
    }
}

    *****
   *   *
  *   *
 *   *
*****

import java.util.*;
public class Solution{
    public static void main(String args[]) {
		Scanner scn =new Scanner(System.in);
		int rows=Integer.parseInt(scn.nextLine());
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows-i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=rows;j++){
				if(i==1||i==rows||j==1||j==rows){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
				}
			System.out.println();
		}
    }
}

import java.util.*;
public class Solution{
    public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		int rows=scn.nextInt();
		for(int i =1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			for(int k=1;k<=(2*(rows-i)-1);k++){
				System.out.print(" ");
			}
			for(int j=i;j>0;j--){
				if(j==rows){
					continue;
				}
				else{
					System.out.print(j);
				}
				
			}
			System.out.println();
		}
    }
}


import java.util.*;
public class Solution{
    public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		int octal=0;
		int i=0;
		while(num!=0){
			int temp=num%8;
			octal=octal+temp*(int)(Math.pow(10,i));
			i++;
			num=num/8;
		}
		System.out.println(octal);
						
}
}

import java.util.*;
public class Solution{
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
		for(int i=0;i>=0;i++){
			char op=scn.next().charAt(0);
			int num1,num2,num3;
			switch(op){
			case '+':
				num1=scn.nextInt();
				num2=scn.nextInt();
				num3=num1+num2;
				System.out.println(num3);
				break;
			case '-':
				num1=scn.nextInt();
				num2=scn.nextInt();
				num3=num1-num2;
				System.out.println(num3);break;
			case '*':
				num1=scn.nextInt();
				num2=scn.nextInt();
				num3=num1*num2;
				
				System.out.println(num3);break;
			case '/':
				num1=scn.nextInt();
				num2=scn.nextInt();
				num3=num1/num2;
				System.out.println(num3);
				break;
			case '%':
				num1=scn.nextInt();
				num2=scn.nextInt();
				num3=num1%num2;
				System.out.println(num3);
				break;
			case 'x':
			case 'X':
				System.exit(0);
				break;
			default:
				System.out.println("invalid operation");
			}
		}
    }
}

import java.util.*;
public class Solution{
    public static void main(String args[]) {
		Scanner scn =new Scanner(System.in);
		int rows=scn.nextInt();
		for(int i=0;i<rows;i++){

			for(int j=1;j<=rows-i;j++){
				System.out.print(j);
			}
			for(int j=1;j<=2*i-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
    }
}

import java.util.*;
public class Solution{
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        int base=scn.nextInt();
	int i,j=0,flag=0;
        out:
        for( i=base;i<=100;i++){
            for( j=i+1;j<=100;j++){
                if(Math.pow(base,2)==Math.pow(j,2)-Math.pow(i,2)){
			flag++;
                    break out;
			}
		

            }
        }
	if(flag>0)
        System.out.println(i+"   "+j);
else
		System.out.println(-1);
    }
}

  5 4 3 2 1 0 1 2 3 4 5
    4 3 2 1 0 1 2 3 4
      3 2 1 0 1 2 3
        2 1 0 1 2
          1 0 1
            0
          1 0 1
        2 1 0 1 2
      3 2 1 0 1 2 3
    4 3 2 1 0 1 2 3 4
  5 4 3 2 1 0 1 2 3 4 5
import java.util.*;
public class Solution{
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        int rows=scn.nextInt();
        for(int i=0;i<rows+1;i++){
		for(int j=0;j<i+1;j++){
		System.out.print("  ");}
            int digit=rows-i;
            for(int j=0;j<2*rows+1-(2*i);j++){
                System.out.print(digit+" ");
		if(j>rows-i-1)
                    digit++;
                else
                    digit--;
                
            }
            System.out.println();
        }
	    for(int i=rows-1;i>=0;i--){
		for(int j=0;j<i+1;j++){
		System.out.print("  ");}
            int digit=rows-i;
            for(int j=0;j<2*rows+1-(2*i);j++){
                System.out.print(digit+" ");
		if(j>rows-i-1)
                    digit++;
                else
                    digit--;
                
            }
            System.out.println();
        }
    }
}

import java.util.*;
public class Solution{
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        int rows=scn.nextInt();
        for(int i=1;i<=rows+1;i++){
		int j=0;
		for(j=1;j<=i;j++){
		System.out.print(" ");}
            int digit=rows-i+1;
            for(;j<=2*rows+3-i;j++){
                System.out.print(digit);
		if(j>6)
                    digit++;
                else
                    digit--;
                
            }
            System.out.println();
        }
}
}


import java.util.*;
public class Solution{
    public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		int rows=scn.nextInt();
		for(int i=0;i<=rows+1;i++){
			for(int j=1;j<=i;j++){
				System.out.print(rows+1-j);
			}
			for(int j=2*(rows-i)+1;j>=1;j--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
			if(j==1&&i==rows+1)
continue;
				System.out.print(rows-i+j);
			}
System.out.println();
		}

	for(int i=rows;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(rows+1-j);
			}
			for(int j=2*(rows-i)+1;j>=1;j--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
			if(j==1&&i==rows+1)
continue;
				System.out.print(rows-i+j);
			}
System.out.println();
		}
    }
}
      1
    21 12
  321   123
4321     1234
  321   123
    21 12
      1
import java.util.*;
public class Solution{
    public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		int rows=scn.nextInt();
		for(int i=0;i<=(rows-1)/2;i++){
			int digit=i+2;
			for(int j=1;j<=rows-1-(2*i);j++){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				digit--;
				System.out.print(digit);
				
			}
			for(int j=1;j<=2*i-1;j++){
				
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				if(i==0)continue;
				System.out.print(digit);
				digit++;
			}
			System.out.println();
		}
		for(int i=((rows-1)/2)-1;i>=0;i--){
			int digit=i+2;
			for(int j=1;j<=rows-1-(2*i);j++){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				digit--;
				System.out.print(digit);
			}
			for(int j=1;j<=2*i-1;j++){
				
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				if(i==0)continue;
				System.out.print(digit);
				digit++;
			}
			System.out.println();
		}
    }
}
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1
*/
import java.util.*;
public class Solution{
    public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		int rows=scn.nextInt();
		int ar[][]=new int[10][10];
		int j=0; 
		for(int i=0;i<rows;i++){
			
			for(j=0;j<=i;j++){
				if(j==0||j==i){
					
					ar[i][j]=1;
				}
				else{
					
					ar[i][j]=ar[i-1][j-1]+ar[i-1][j];
				}
				System.out.print(ar[i][j]+" ");
			}
				

			System.out.println();
		}
    }
}

import java.util.*;
public class Solution{
    public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		int rows=scn.nextInt();
		int coef=1;
		for(int i=0;i<rows;i++){
			
			for(int j=0;j<=i;j++){
				if(j==0||j==i){
					coef=1;
				}
				else{
					
					coef=coef*(i-j+1)/j;
				}

				System.out.print(coef);
			}
			System.out.println();
		}
    }
}
*    ******
*    *     
*    *     
*    *     
*    *     
***********
     *    *
     *    *
     *    *
     *    *
******    *
import java.util.*;
public class Solution{
    public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		int rows=scn.nextInt();
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){
				if(i==1){
					if(j==1||j>=(rows+1)/2){
						System.out.print("*");
					}
					else
						System.out.print(" ");
				}
				else if(i==rows){
					if(j==rows||j<=(rows+1)/2){
						System.out.print("*");
					}
					else
						System.out.print(" ");
				
				}
				else if(i<(rows+1)/2){
					if(j==1||j==(rows+1)/2){
						System.out.print("*");
					}
					else
						System.out.print(" ");
				}
				else if(i>(rows+1)/2){
					if(j==rows||j==(rows+1)/2){
						System.out.print("*");
					}
					else
						System.out.print(" ");
				}
				else
				System.out.print("*");
			}
			System.out.println();
		}
    }
}
*/
