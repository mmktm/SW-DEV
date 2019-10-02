
public class ChessBoard {
	

	ChessPiece[][] board = new ChessPiece[BOARD_SIZE][BOARD_SIZE];
	static final int BOARD_SIZE = 8;
	
	// constructor
	public ChessBoard(){
		// place 32 pieces on board
		addPiece(new King(0, 3, 0));   // row col color 0 = black
		addPiece(new Queen(0, 4, 0));
		 
		addPiece(new King(7, 3, 1));   // row col color 1 = white
		addPiece(new Queen(7, 4, 1));
	}
	
	// board setter
	void addPiece(ChessPiece piece){
		
		board[piece.row][piece.col] = piece;
	}
	
	// board getter
	ChessPiece pieceAt(int row, int col){
		
		return board[row][col];
	}
	
	void printBoard(){
		
		for(ChessPiece[] pieceArray : board) {
			for(ChessPiece piece : pieceArray) {
				if(piece != null)
					piece.printPiece();     // polymorphism
				else
					System.out.print(". ");
			}
			System.out.println();
		}
	}
	
}
