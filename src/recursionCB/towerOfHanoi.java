package recursionCB;

public class towerOfHanoi {
	public static int count=0;
	public static void toh(int n,String src,String dest,String helper) {
		if(n==0)
			return;
		toh(n-1,src,helper,dest);
		System.out.println(n+" th disc "+src+" to "+dest);
		count++;
		toh(n-1,helper,dest,src);
	}
	public static void main(String args[]) {
		toh(3,"src","dest","helper");
		System.out.print(count);
	}
}
