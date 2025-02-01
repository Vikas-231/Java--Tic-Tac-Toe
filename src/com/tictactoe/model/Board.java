package com.tictactoe.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Board {

	private int size;
	private List<List<Cell>> board;

	Board(int size) {
		this.size = size;
		createBoard();
	}

	private void createBoard() {
		for (int i = 0; i < size; i++) {
			board.add(new ArrayList<>(this.size));
		}
	}

}
