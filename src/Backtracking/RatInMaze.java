package Backtracking;

import java.util.Scanner;

public class RatInMaze {
	public static Scanner scn =new Scanner(System.in);
	
	public static char[][] Grid;
	public static boolean IsSafe(int row,int col) {
		return row<Grid.length&&col<Grid[row].length&&Grid[row][col]=='O';
		
	}
	public static void display(int[][] board) {
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[i].length;j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	public static boolean solve(int [][]board,int row,int col) {
		if(row==board.length-1&&col==board[row].length-1) {
			board[row][col]=1;
			return true;
		}
		if(IsSafe(row,col)) {
			board[row][col]=1;
			if(solve(board,row,col+1))
				return true;
			if(solve(board,row+1,col))
				return true;
			board[row][col]=0;
			return false;
						
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row=scn.nextInt();
		int col=scn.nextInt();
		Grid=new char[row][col];
		for(int i =0;i<row;i++) {
			for(int j=0;j<col;j++) {
				Grid[i][j]=scn.next().charAt(0);

			}
		}
		int [][]board=new int[row][col];
		if(solve(board,0,0))
			display(board);
		else
			System.out.println(-1);
	}

}
