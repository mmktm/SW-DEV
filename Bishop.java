
public class Bishop extends ChessPiece {

	public Bishop(int row, int col, int color) {
		super(row, col, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	void printPiece() {
		System.out.print((this.color == 0) ? "b " : "B ");
		
	}

	@Override
	PieceType getType() {
		return PieceType.BISHOP;
	}

	@Override
	boolean isValidMove(ChessBoard board, int row, int col) {
		return true;
	}

	
}
