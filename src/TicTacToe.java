public class TicTacToe {
	
	public void ticTacToe() {
		
		System.out.println("Game is starting, initializing the board!");
		board = new char[3][3];
		for(int i = 0;i<board.length;i++) {
			for(int j = 0;j<board.length;j++) {
				board[i][j] = ' ';
				
			}
		}
		
		
	}
	
	 char[][] board;
	
	 static char playerMark = 'X';

	public void printBoard() {
		System.out.println("-------------");
	
		for(int i = 0;i<board.length;i++) {
			System.out.print("| ");
			for(int j = 0;j<board.length;j++) {
				System.out.print(board[i][j]);	
				System.out.print(" | ");
			}
			
			System.out.println();
			System.out.println("-------------");
		}
		
	}
	
	public void printCurrentMark() {
		System.out.println("Current player Mark is: "+ playerMark);
	}
	
	
	public void setMark(int positionRow, int positionColumn) {
		
		if(board[positionRow-1][positionColumn-1] != ' ') {
			System.out.println("That place is already taken. Please check the board again.");
			System.out.println("This is the current board!");
			printBoard();
		}
		
		else {
			if(playerMark == 'X') {
				System.out.println("Setting the 'X' player Mark");
				board[positionRow-1][positionColumn-1] = 'X';
				playerMark = 'O';
			}
			else if(playerMark =='O') {
				System.out.println("Setting the 'O' player Mark");
				board[positionRow-1][positionColumn-1] = 'O';
				playerMark = 'X';
			}
			
			printBoard();
			printCurrentMark();
			
		}
	}
	
	
	public boolean checkForWinner() {
		if(checkRows() == true || checkColumns() == true || checkDiagonals() == true) return true;
		else return false;
	}
	
	public boolean checkRows() {
	
		for(int i = 0;i<board.length;) {
			
			if(board[i][0] == board[i][1] && board[i][0] == board[i][2] && board[i][0] != ' ') {
				return true;
			}
			else return false;
			
		}
		return false;
		
	}
	
	public boolean checkColumns() {
		
		for(int j = 0;j<board.length;) {
			
			if(board[0][j] == board[1][j] && board[0][j] == board[2][j] && board[0][j] != ' ') {
				return true;
			}
			else return false;
			}
		return false;	
	}
	
	public boolean checkDiagonals() {
		
		if(board[0][0] == board[1][1] && board[0][0] == board[2][2] & board[0][0] != ' ') return true;
		else if( board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[0][2] != ' ') return true;
		else return false;
	}
	
	
	public static void main(String[] args) {
		TicTacToe ttt = new TicTacToe();
		ttt.printBoard();
		ttt.setMark(3, 2);
		ttt.setMark(3, 3);
		ttt.setMark(3, 1);
		ttt.setMark(2, 2);
		ttt.setMark(3, 3);
		ttt.setMark(2, 1);
		ttt.setMark(1, 1);
		if(ttt.checkForWinner() == true) System.out.println("Win");
		
		
	}
	

}
