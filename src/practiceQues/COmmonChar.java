package practiceQues;

import java.util.HashMap;

public class COmmonChar {
	 static String twoStrings(String s1, String s2) {

	        HashMap<Character,Integer> comm=new HashMap<Character,Integer>();
	        for(int i=0;i<s1.length();i++){
	            char c=s1.charAt(i);
	            if(comm.containsKey(c)){
	                comm.put(c,comm.get(c)+1);
	            }
	            else{
	                comm.put(c,1);
	            }
	        }
	        for(int i=0;i<s2.length();i++){
	            char s=s2.charAt(i);
	            if(comm.containsKey(s)){
	                return "YES";
	            }
	        }
	        return "NO";
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(twoStrings("hi","cgv"));
	}

}
