package recursionCB;

public class sortArray012 {
	public static void swap(int arr[],int a,int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	public static void main(String args[]) {
		int arr[]= {2,0,2,0,0,2,1,0,2,2};
		int mid=0,low=0,high=arr.length-1;
		while(mid<=high) {
			if(arr[mid]==0) {
				swap(arr,low,mid);
				low++;
				mid++;
			}
			else if(arr[mid]==1) {
			
				mid++;
			}
			else {
				swap(arr,mid,high);
				high--;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);}
	}

}
