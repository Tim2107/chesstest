package at.nathaniel.JTimChess.pieces;

import at.nathaniel.JTimChess.Alliance;
import at.nathaniel.JTimChess.board.Board;
import at.nathaniel.JTimChess.board.Move;

import java.util.Collection;

public abstract class Piece {

	protected final int piecePosition;
	protected final Alliance pieceAlliance;
	protected final boolean isFirstMove;

	Piece(final int piecePosition, final Alliance pieceAlliance){
		this.pieceAlliance = pieceAlliance;
		this.piecePosition = piecePosition;
		//Todo more work here!!!!!!
		this.isFirstMove = false;
	}

	public int getPiecePosition() {
		return this.piecePosition;
	}

	public Alliance getPieceAlliance(){
		return this.pieceAlliance;
	}

	public boolean isFirstMove() {
		return this.isFirstMove;
	}

	public abstract Collection<Move> calculateLegalMoves(final Board board);

}
