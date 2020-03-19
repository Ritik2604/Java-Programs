package practiceQues;
import java.util.*;

public class OddIntegers {
    public static Scanner scn=new Scanner(System.in);
    public static long count=0;
    public static long countSteps(long arr[]) {
        count=0;
        for(int i=0;i<arr.length;i++) {
            
            while(arr[i]%2==0) {
                long k =arr[i];
                for(int j=i;j<arr.length;j++) {
                    if(k==arr[j])
                        arr[j]/=2;
                }
                count++;
            }
        }
        return count;
        
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        long test=scn.nextInt();
        for(long j=0;j<test;j++) {
            int size=scn.nextInt();
            long []arr=new long[size];
            for(int i=0;i<size;i++) {
                arr[i]=scn.nextInt();
            }
               
            System.out.println(countSteps(arr));
        }
    }
}