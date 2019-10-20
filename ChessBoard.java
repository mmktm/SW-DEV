
public class ChessBoard {
	

	ChessPiece[][] board = new ChessPiece[BOARD_SIZE][BOARD_SIZE];
	static final int BOARD_SIZE = 8;
	
	// constructor
	public ChessBoard(){
		// place 32 pieces on board
		addPiece(new Rook	(0, 0, 0));
		addPiece(new Knight	(0, 1, 0));
		addPiece(new Bishop	(0, 2, 0));
		addPiece(new King	(0, 3, 0));   // row col color 0 = black
		addPiece(new Queen	(0, 4, 0));
		addPiece(new Bishop	(0, 5, 0));
		addPiece(new Knight	(0, 6, 0));
		addPiece(new Rook	(0, 7, 0));
		addPiece(new Pawn	(1, 0, 0));
		addPiece(new Pawn	(1, 1, 0));
		addPiece(new Pawn	(1, 2, 0));
		addPiece(new Pawn	(1, 3, 0));
		addPiece(new Pawn	(1, 4, 0));
		addPiece(new Pawn	(1, 5, 0));
		addPiece(new Pawn	(1, 6, 0));
		addPiece(new Pawn	(1, 7, 0));
		 
		addPiece(new Rook	(7, 0, 1));
		addPiece(new Knight	(7, 1, 1));
		addPiece(new Bishop	(7, 2, 1));
		addPiece(new King	(7, 3, 1));   // row col color 1 = white
		addPiece(new Queen	(7, 4, 1));
		addPiece(new Bishop	(7, 5, 1));
		addPiece(new Knight	(7, 6, 1));
		addPiece(new Rook	(7, 7, 1));
		addPiece(new Pawn	(6, 0, 1));
		addPiece(new Pawn	(6, 1, 1));
		addPiece(new Pawn	(6, 2, 1));
		addPiece(new Pawn	(6, 3, 1));
		addPiece(new Pawn	(6, 4, 1));
		addPiece(new Pawn	(6, 5, 1));
		addPiece(new Pawn	(6, 6, 1));
		addPiece(new Pawn	(6, 7, 1));
	}
	
	// board setter
	void addPiece(ChessPiece piece){
		
		board[piece.row][piece.col] = piece;
	}
	void removePiece(int row,int col) {
		board[row][col] = null;
	}
	
	void movePiece(Coordinate from,Coordinate to) {
		ChessPiece cur = board[from.row][from.col];
		if(cur.isValidMove(this, to.row, to.col)) {
			cur.col = to.col;
			cur.row = to.row;
			board[from.row][from.col] = null;
			board[to.row][to.col] = cur;	
		}
	}
	
	// board getter
	ChessPiece pieceAt(int row, int col){
		
		return board[row][col];
	}
	
	void printBoard() {
		//System.out.flush();
		Integer indexRow = 8, row = 0, col = 0;
		System.out.println();
		System.out.println("   A B C D E F G H  ");
		System.out.println();
		for (ChessPiece[] pieceArray : board) {
			System.out.print(indexRow + "  ");
			for (ChessPiece piece : pieceArray) {
				if (piece != null)
					board[row][col].printPiece(); // polymorphism
				else
					System.out.print(". ");
				//System.out.print(row +""+ col + " ");
				col++;
			}
			col = 0;
			System.out.print("  " + indexRow);
			row++;
			indexRow--;
			System.out.println();
		}
		System.out.println();
		System.out.println("   A B C D E F G H  ");
		System.out.println();
	}
	
}
