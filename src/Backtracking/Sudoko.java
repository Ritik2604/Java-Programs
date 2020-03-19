package Backtracking;

public class Sudoko {
	private static int[][] Grid=
		{
			{3, 0, 6, 5, 0, 8, 4, 0, 0}, 
            {5, 2, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 8, 7, 0, 0, 0, 0, 3, 1}, 
            {0, 0, 3, 0, 1, 0, 0, 8, 0}, 
            {9, 0, 0, 8, 6, 3, 0, 0, 5}, 
            {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
            {1, 3, 0, 0, 0, 0, 2, 5, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 7, 4}, 
            {0, 0, 5, 2, 0, 6, 3, 0, 0}
		};
	private static int[][] boardSolved;
	public static void display(int[][]board) {
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[i].length;j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static boolean InRow(int[][]board,int row,int num) {
		for(int i=0;i<board.length;i++) {
			if(board[row][i]==num)
				return true;	
		}
		return false;
	}
	public static boolean InCol(int[][]board,int col,int num) {
		for(int i=0;i<board.length;i++) {
			if(board[i][col]==num)
				return true;	
		}
		return false;
	}
	public static boolean InBox(int[][]board,int row,int col,int num) {
		int r=row-row%3;
		int c=col-col%3;
		for(int i=r;i<r+3;i++) {
			for(int j=c;j<c+3;j++) {
				if(board[i][j]==num)
					return true;
			}
		}
		return false;
	}
	
	public static boolean IsSafe(int[][] board,int row,int col,int num) {
		return !InRow(board, row, num)&&!InCol(board, col, num)&&!InBox(board, row, col, num);
	}
	public static boolean solve(int[][]board){
		
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[i].length;j++) {
				if(board[i][j]==0) {
					for(int k=1;k<=board.length;k++) {
						if(IsSafe(board,i,j,k)) { 
							board[i][j]=k;
							if(solve(board)) {		//start backtracking					
								return true;
							}
							else {
								board[i][j]=0;//undo
							}
						}
					}
					return false;
				}
				
			}	
		
		}
		boardSolved=board;
		return true;
		
	}
	public static void main(String args[]) {
		if(solve(Grid)) {
			System.out.println("Solved");
			display(boardSolved);
		}
		else
			System.out.println("Not Solved");


	}

}
