package com.tictactoe.strategy.winning;

import com.tictactoe.model.Board;
import com.tictactoe.model.Cell;

public interface WinningStrategy {
	
	boolean checkWin(Cell cell, Board board);

}
