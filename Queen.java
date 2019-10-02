
public class Queen extends ChessPiece {

	public Queen(int row, int col, int color) {
		super(row, col, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	void printPiece() {
		System.out.print("Q ");
		
	}

	@Override
	PieceType getType() {
		return PieceType.QUEEN;
	}

	@Override
	boolean isValidMove(ChessBoard board, int row, int col) {
		return false;
	}

}
