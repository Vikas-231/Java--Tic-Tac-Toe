package com.tictactoe.model;

import lombok.Data;

@Data
public class Cell {

	private int row, col;
	private CellState cellState;
	private Player player;
}
