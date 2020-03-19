package recursionCB;

import java.util.ArrayList;
import java.util.Scanner;

public class AllSubseq {
	public static Scanner scn =new Scanner(System.in);
	public static ArrayList<String> lexiSub(String str) {
		if(str.length()==0) {
			ArrayList <String> baseResult=new ArrayList<>();
			baseResult.add("");
			return baseResult;
		}
		char cc=str.charAt(0);
		String ros =str.substring(1);
		ArrayList <String> myResult=new ArrayList<>();
		ArrayList <String> recResult=lexiSub(ros);
		for(int i=0;i<recResult.size();i++) {
			myResult.add(recResult.get(i));
			myResult.add(cc+recResult.get(i));
		}
		return myResult;
	}
	
	public static void main(String args[]) throws Exception{
		int testCase=scn.nextInt();
		for(int i=0;i<testCase;i++) {
			String str=scn.next();
			ArrayList <String> fu=lexiSub(str);
			for(int j=0;j<fu.size();j++) {
				for(int index=0;index<fu.size()-1;index++) {
				int val=fu.get(index).compareTo(fu.get(index+1));
				if(val>0) {
					String temp=fu.get(index);
					fu.set(index,fu.get(index+1));
					fu.set(index+1, temp);	
				}
			}
			}
			System.out.print(fu);
			
		}
		
	}

}

