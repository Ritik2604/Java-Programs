/* //LOWER UPPER
import java.util.*;
import java.io.*;
public class stringCB{
	static Scanner scn =new Scanner(System.in);
	public static void main(String args[]){
		char ch=scn.next().charAt(0);
		if((int)ch>=65&&(int)ch<=96){
			System.out.println("Uppercase");
		}
		else if((int)ch>=97&&(int)ch<=123){
			System.out.println("lowercase");
		}
		else{
			System.out.println("Invalid");
		}
	}
}
*/
/* //PIYUSH AND HIS MAGICAL PARK
import java.util.*;
import java.io.*;
public class stringCB{
	static Scanner scn =new Scanner(System.in);
	public static void main(String args[]){
		int rows=scn.nextInt(),cols=scn.nextInt(),thresh=scn.nextInt(),init=scn.nextInt();
		char [][]park=new char[rows][cols];
		for(int i=0;i<park.length;i++){
			for(int j=0;j<park[i].length;j++){
				park[i][j]=scn.next().charAt(0);
				if(park[i][j]=='.'){
					init -=2;
				}
				else if(park[i][j]=='*'){
					init +=5;
				}
				else if(park[i][j]=='#'){
					continue;
				}
				else if(init<thresh){break;}
				init -=1;
				
			}
		}
		if (init<thresh){
			System.out.println("NO");
		}
		else{
			System.out.println("Yes");
			System.out.println(init);
		}
	}
}
*/
/* //ULTRA FAST MATHEMATICS XNOR		
import java.util.*;
import java.io.*;
public class stringCB{
	static Scanner scn =new Scanner(System.in);
	public static void main(String args[]){
		String str1=scn.next(),str2=scn.next();
		StringBuilder sb=new StringBuilder();
		for(int i =0;i<str1.length();i++){
			if(str1.charAt(i)==str2.charAt(i)){
				sb.append('0');
			}
			else{
				sb.append('1');
			}
		}
		System.out.println(sb);
	}
}
*/
/* // FINDING CB NUMBER INCOMPLETE*****************
import java.util.*;
import java.io.*;
public class stringCB{
	static Scanner scn =new Scanner(System.in);
	public static void main(String args[]){
		String str=scn.next();
		StringBuilder sb=new StringBuilder(str);
		int flag=0,k=0,l=0,count=0,count2=0;
		int arr[]=new int[10];
		for(int i =2;i<30;i++){
			flag=0;
			for(int j=1;j<=Math.sqrt(i);j++){
			if(i%j==0){flag++;}
			}
			if (flag==1){
				arr[k]=i;
				k++;
			}
		}
		l=0;
		outer:
		for(int i=l;i<sb.length();i++){
				
			for(l=i+1;l<=sb.length();l++){
				count2=0;
				System.out.println(Integer.parseInt(sb.substring(i,l))+" "+i);
				
				for(int h=0;h<arr.length;h++){
						if(Integer.parseInt(sb.substring(i,l))==arr[h]){
							count++;
							break outer;
						}
				}
				for(k=0;k<arr.length;k++){
					
					
					if(Integer.parseInt(sb.substring(i,l))%arr[k]==0){
						count2++;
						break;
					}
					
				}
				if(count2==0){
					
					for(int h=0;h<arr.length;h++){
						if(Integer.parseInt(sb.substring(i,l))%arr[h]!=0){
							count++;
							
							break outer;
							
						}
					}
				}
			}
		}
		System.out.print(count);
	}
}
*/
/* //PALINDROME STRING
import java.util.*;
import java.io.*;
public class stringCB{
	static Scanner scn =new Scanner(System.in);
	public static void main(String args[]){
		String str1=scn.next();
		StringBuilder sb=new StringBuilder(str1);
		int len=sb.length(),flag=0;
		for(int i=0;i<=len/2;i++){
			System.out.println(" "+i);
			if(sb.charAt(i)!=sb.charAt(len-1-i)){
				flag++;
			}
			
		}
		if(flag>0){
			System.out.println("False");
		}
		else{
			System.out.println("True");
		}
	}
}
*/
/* //DIFFERENCE IN ASCII CODES DIFFICUT
import java.util.*;
import java.io.*;
public class stringCB{
	static Scanner scn =new Scanner(System.in);
	public static void main(String args[]){
		String str1=scn.next();
		int arr[]=new int[str1.length()-1],len=str1.length(),i=0,j=1,k=0;
		StringBuilder sb=new StringBuilder(str1);
		for( i=0;i<len-1;i+=1){
			arr[i]=((int)sb.charAt(i+1)-(int)sb.charAt(i));
			
		}
		int count = 0,f=0;
		int countar []=new int [arr.length];
		while(f<arr.length){
			count=0;
			int num=arr[f];
			while(num != 0)
			{
				num /= 10;
				count++;
		
			}
			countar[f]=count;
			f++;
		}
		
		while(k<i){
			sb.insert(j,arr[k]);
			if(arr[k]<0)
				j=j+countar[k]+2;
			else
				j=j+countar[k]+1;
			k++;
		}
		System.out.print(sb);

	}
}
*/
/* //MAX FREQ CHARACTER IN STRING
import java.util.*;
import java.io.*;
public class stringCB{
	static Scanner scn =new Scanner(System.in);
	public static void main(String args[]){
		String str=scn.next();
		int arr[]=new int[str.length()],count=0;
		for(int i=0;i<str.length();i++){
			count=1;
			for(int j=i+1;j<str.length();j++){
				if(str.charAt(i)==str.charAt(j)){
					count++;
				}
				arr[i]=count;
			}
		}
		int max=arr[0],maxi=0;
		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
				maxi=i;
			}
		}
		System.out.println(str.charAt(maxi)+" "+max);
	}
}
*/
/* // TILL UPPER CASE ONE WORD READ IT
import java.util.*;
import java.io.*;
public class stringCB{
	static Scanner scn =new Scanner(System.in);
	public static void main(String args[]){
		String str=scn.nextLine();
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<=str.length();j++){
				if(j==str.length()){
					System.out.println(str.substring(i,j));
					i=j-1;
				}
				else if((int)str.charAt(j)<97){
					System.out.println(str.substring(i,j));
					i=j-1;
					break;
				}
			}
		}
	}
}
*/
/* // STRING COMPRESSION
import java.util.*;
import java.io.*;
public class stringCB{
	static Scanner scn =new Scanner(System.in);
	public static void main(String args[]){
		String str=scn.nextLine();
		StringBuilder sb=new StringBuilder(str);
		int count=0,arr[]=new int[sb.length()];
		for(int i=0;i<str.length();i++){
			count=1;
			while(i<str.length()-1){
				if(sb.charAt(i)==sb.charAt(i+1)){
					count++;
					i++;
				}
				else{
					break;
				}
				
			}
			System.out.print(sb.charAt(i));
			if(count==1){continue;}
				System.out.print(count);
		}
		for(int i=0;i<arr.length;i++){
			
		}
	}
}
*/
