/* //VIDEO QUES ALL SUBSEQUENCES WITH ASCII
import java.util.*;
import java.io.*;
public class recursionCB{
	public static ArrayList<String> getsswAscii(String str){
		if(str.length()==0){
			ArrayList <String> baseResult=new ArrayList<String>();
			baseResult.add(" ");
			return baseResult;
		}
		char cc=str.charAt(0);
		String ros =str.substring(1);
		int Ascii=(int)cc;
		ArrayList<String> myResult=new ArrayList<>();
		ArrayList<String> recResult=getsswAscii(ros);
		for(int i=0;i<recResult.size();i++){
			myResult.add(recResult.get(i));
			myResult.add(cc+recResult.get(i));
			myResult.add(Ascii+recResult.get(i));
		}
		return myResult;
	}
	static Scanner scn=new Scanner(System.in);
	public static void main(String args[]){
		String str=scn.nextLine();
		
		
			System.out.println(getsswAscii(str));
	}
}
*/
/*
import java.util.*;
import java.io.*;
public class recursionCB{
	public static void printsswAscii(String str,String result){
		if(str.length()==0){
			System.out.println(result);
			return;
		}
		char cc=str.charAt(0);
		String ros =str.substring(1);
		int Ascii=(int)cc;
			printsswAscii(ros,result);
			printsswAscii(ros,result+cc);
			printsswAscii(ros,result+Ascii);		
	}
	static Scanner scn=new Scanner(System.in);
	public static void main(String args[])throws Exception{
		printsswAscii("ab","");
	}
}
*/
/*
import java.io.*; 
import java.util.*;   
public class recursionCB{
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
		int x=scn.nextInt();
		int N=scn.nextInt();
		String s;
		int sal;
		ArrayList<String> arrlis = new ArrayList<String>(N); 
		ArrayList<Integer> arrlii = new ArrayList<Integer>(N); 
		for(int i=0;i<N;i++){
			s =scn.nextLine();
			sal=scn.nextInt();
			arrlis.add(s);
			arrlii.add(sal);
		}
		for(int j=0;j<N;j++){
			if(arrlii.get(j)>=x){
				System.out.println(arrlis.get(j)+" "+ arrlii.get(j));
			}
		}
    }
}
*/
afterwards to ide
