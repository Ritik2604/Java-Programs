package practiceQues;
import java.text.ParseException;  
import java.util.Scanner;

public class maxPallindrom {

	    public static Scanner scn=new Scanner(System.in);
	    
	    static String maximumPalinUsingKChanges(String str, int k) { 
	        char palin[] = str.toCharArray(); 
	        String ans = ""; 
	       
	        int l = 0; 
	        int r = str.length() - 1; 
	  
	        while (l < r) { 

	            if (str.charAt(l) != str.charAt(r)) { 
	                palin[l] = palin[r] = (char) Math.max(str.charAt(l), 
	                                          str.charAt(r)); 
	                k--; 
	            } 
	            l++; 
	            r--; 
	        } 

	        if (k < 0) { 
	            return "-1"; 
	        } 
	        l = 0; 
	        r = str.length() - 1; 
	  
	        while (l <= r) { 
	        	  
	            if (l == r) { 
	                if (k > 0) { 
	                    palin[l] = '9'; 
	                } 
	            } 
  
	            if (palin[l] < '9') { 
	                if (k >= 2 && palin[l] == str.charAt(l) 
	                        && palin[r] == str.charAt(r)) { 
	                    k -= 2; 
	                    palin[l] = palin[r] = '9'; 
	                } 
	               else if (k >= 1 && (palin[l] != str.charAt(l) 
	                        || palin[r] != str.charAt(r))) { 
	                    k--; 
	                    palin[l] = palin[r] = '9'; 
	                } 
	            } 
	            l++; 
	            r--; 
	        } 
	        for(int i = 0;i<palin.length;i++) 
	            ans+=palin[i]; 
	        return ans; 
	    } 

	    public static void main(String[] args) throws ParseException {
	        int k = scn.nextInt(); 
	        String str = scn.next(); 
	        System.out.println(maximumPalinUsingKChanges(str, k)); 
	    }
}

