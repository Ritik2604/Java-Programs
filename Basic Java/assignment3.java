/*
222222222222222222222222222222

class demo{
public static void main(String args[]){
for(int i=0;i<7;i++){
	
		if(i==0||i==3){
			if(i==0){
			for(int k=0;k<=6;k++)
			{
				System.out.print("#");}
			}
			else{
				for(int k=0;k<5;k++){
					System.out.print("#");
					}
			}		
		}
		else
		{
			
			System.out.print("#");
				
		}

System.out.println();
}

}
}
*/

/*
33333333333333333333333333
class demo{
public static void main(String args[]){
for(int i=1;i<10;i++){
	
		if(i==1||i==2||i==8||i==9){
			if(i==1||i==9){
				for(int k=0;k<2;k++)
				{
					System.out.print(" ");
				}
				for(int k=0;k<6;k++){
					System.out.print("#");
				}
					
			}
		
			else{
					for(int k=0;k<10;k++){
						if(k==0||k==1||k==8||k==9){
								System.out.print("#");
							
						}
						else{
							System.out.print(" ");
						}
					}	
			}
			
			
					
		}
		else
		{
			
			System.out.print("#");
				
		}

	System.out.println();
}
}
}

*/
/*
4444444444444444444
import java.io.*;
class demo{
	public static void  main(String args[])throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str= br.readLine();
		char ar[]=new char[str.length()];
		System.out.print("The Output of ");
		for(int i=0;i<str.length();i++){
			ar[i]=str.charAt(i);
			System.out.print(ar[i]);
		}
		System.out.print(" is ");

		for(int i=str.length()-1;i>=0;i--){
			System.out.print(ar[i]);

		}
	}
	
}
*/
/*
88888888888888
import java.io.*;
class demo{
	int days;
	int week;
	int year;
	public void set()throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		days=Integer.parseInt(br.readLine());
		
	}
	public void convert(){
		year=(int)(days/365);
		int temp=days%365;
		week=(int)(temp/7);
		days=temp%7;
		
	}
	public void show(){
		System.out.print(days+":"+week+":"+days);
	}
	public static void main(String args[])throws Exception {
		demo obj=new demo();
		obj.set();
		obj.convert();
		obj.show();
	}
}
*/

/*
16 16 16 16 16 16 16 16 16 16 16 16 16 
import java.io.*;
class demo{

	public static void main(String args[])throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int amt=Integer.parseInt(br.readLine());
			int hund=(int)amt/100;
			amt=amt%100;
			int fifty=(int)amt/50;
			amt %=50;
			int twen=(int)amt/20;
			amt %=20;
			int ten=(int)amt/10;
			amt %=10;
			int fiv=(int)amt/5;
			amt %=5;
			int two=(int)amt/2;
			amt %=2;
			int one=amt;
			System.out.print(hund+":"+fifty+":"+twen+":"+ten+":"+fiv+":"+two+":"+one);
	}
}
*/
/*
19 19 19 19 19  19 19 19 19 19 1 9 19 19
import java.io.*;
class demo{

	public static void main(String args[])throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int p=Integer.parseInt(br.readLine());
		int q=Integer.parseInt(br.readLine());
		int r=Integer.parseInt(br.readLine());
		int s=Integer.parseInt(br.readLine());
		if(r>=0&&s>=0&&p%2==0&&q>r&&s>p&&(r+s)>(p+q)){
			System.out.println("Correct value");
		}
		else{
			System.out.println("WRONG values");
		}
	}
}

*/
/*
28 28 28 28 28 28 28 28 28 28 28 28 28 28 28 28 28 28 
import java.io.*;
class demo{
	public static void main(String args[]) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num[]=new int[5];
		int total=0;
		int count=0;
		for(int i=0;i<5;i++){
		num[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<5;i++){
			if(num[i]>0){
				total += num[i];
				count++;
			}
		}
		System.out.println(count+"    "+total/count);
			
	}
}
*/

/*
33 33 33 33 33 33 33 33 33 33 33 33 33 33 33
import java.io.*;
class demo{
	public static void main(String args[]) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num[]=new int[5];
		for(int i=0;i<5;i++){
			num[i]=Integer.parseInt(br.readLine());
		}
                     �      FL        �      F�@�     EovHA`�4�vHA`����R� �                   � P�O� �:i�� +00� /C:\                   � 1     O�� PROGRA~1  t 	  �/M:<O��.   :            J     ��M P r o g r a m   F i l e s   @ s h e l l 3 2 . d l l , - 2 1 7 8 1    n 1     (O�1 Mozilla Firefox P 	  �O��(O�1.   dN                   �)� M o z i l l a   F i r e f o x    b 2  � O`�  firefox.exe H 	  �O �O �.   �N                