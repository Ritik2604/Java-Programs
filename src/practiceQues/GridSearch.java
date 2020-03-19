package practiceQues;

import java.util.*;

public class GridSearch {

		static String gridSearch(String[] G, String[] P) {
	        for(int i=0;i<G.length;i++){
	        	for(int j=0;j<G[i].length();j++) {
	                if(G[i].contains(P[0])){
	                  int flag=0;
	                    int idx=G[i].indexOf(P[0],j);
	                    int temp=i;
	                    for(int k=0;k<P.length;k++){
	                        
	                        if(!(G[temp].substring(idx,idx+P[k].length()).length()==P[k].length()&&G[temp].substring(idx,idx+P[k].length()).equals(P[k]))){
	                            break;
	                        }
	                        else {
	                        	flag++;
	                        	temp++;
	                        }
	                        
	                            
	                    }
	                    if(flag==P.length)
	                    	return "YES";    
	                }
	                else {
	                	
	                }
	        
	      
	        	}
	        }
	        return "NO";
		}
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
		            }else{
		                return "NO";   
		            }
		        }
		        return "NO";
		        
		    }

	    public static void main(String args[]) {
		/*
		 * String[]G= { "7283455864", "6731158619", "8988242643", "3830589324",
		 * "2229505813", "5633845374", "6473539293", "7053106601", "0834282956",
		 * "4607924137" // "999999", // "121211" }; String []P= { // "9505", "3845",
		 * "3530" // "99","11" }; System.out.println(gridSearch(G, P) );
		 */
	    	
	    	System.out.println(twoStrings("helli","ma"));
	    }
	}


