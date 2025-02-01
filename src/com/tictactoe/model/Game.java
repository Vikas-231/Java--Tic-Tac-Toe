package com.tictactoe.model;

import java.util.ArrayList;
import java.util.List;

import com.tictactoe.strategy.winning.WinningStrategy;

import lombok.Data;

@Data
public class Game {

	private Board board;
	private List<Player> players;
	private List<Move> moves;
	private int nextPlayerIndex;
	private Player Winner;
	private Gamestate gamestate;
	private List<WinningStrategy> winningStrategis;

	public Game(int dimension, List<Player> players, List<WinningStrategy> winningStrategis) {
		this.players = players;
		this.winningStrategis = winningStrategis;
		this.board = new Board(dimension);
		this.moves = new ArrayList<>();
		this.nextPlayerIndex = 0;
		this.gamestate = Gamestate.INIT;

	}

}
