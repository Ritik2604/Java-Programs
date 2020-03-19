package practiceQues;

public class SeidelPoint {
	public static void point(int arr[][]) {
		for(int row=0;row<arr.length;row++) {
			int min=arr[row][0],cin=0;
			for(int col=0;col<arr[row].length;col++) {
				if(min>arr[row][col]) {
					min=arr[row][col];
					cin=col;
				}
			}
			for(int k=0;k<arr.length;k++) {
				if(min<arr[k][cin]){
					min=-1;
					break;
				}
			}
			if(min!=-1) {
				System.out.println(min);
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= { {1, 2, 3},
                {4, 5, 6},
                {10, 18, 4}};
		point(arr);
	}

}
