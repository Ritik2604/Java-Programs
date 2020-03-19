package recursionCB;

public class sortedArray {
	public static boolean IsSorted(int []arr,int ind) {		
		if(arr.length-1==ind) 
			return true;
		if(arr[ind]>arr[ind+1])
			return false;
		boolean ans=IsSorted(arr ,ind+1);
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8,9};
		System.out.println(IsSorted(arr,0));
	}

}
