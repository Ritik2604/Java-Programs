package recursionCB;

public class printNQueens {
	public static boolean isItSafe(boolean board[][],int row,int col) {
		for(int i=row;i>=0;i--) {
			if(board[i][col]) {
				return false;
			}
		}
		for(int i=row,j=col;i>=0&&j>=0;i--,j--) {
			if(board[i][j]) {
				return false;
			}
			
		}
		for(int i=row,j=col;i>=0&&j<board[row].length;i--,j++) {
			if(board[i][j]) {
				return false;
			}
		}
		return true;
				
	}
	public static void printNQueen(boolean board[][],int row,String result){
		if(row==board.length) {
			System.out.println(result);
			return;
		}
		for(int col=0;col<board[row].length;col++) {
			if(isItSafe(board,row,col)) {
				board[row][col]=true;
				printNQueen(board,row+1,result+"{"+row+","+col+"};");
				board[row][col]=false;
			}
		}
		
	}

	public static void main(String[] args) {
		boolean arr[][]=new boolean[4][4];
		printNQueen(arr,0,"");

	}

}
