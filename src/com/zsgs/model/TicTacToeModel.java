package com.zsgs.model;

import com.zsgs.viewModel.TicTacToeViewModel;

public class TicTacToeModel {
	TicTacToeViewModel viewModel;
	public char[][] board = { { '1', '2', '3' }, { '4', '5', '6' }, { '7', '8', '9' } };
	private boolean draw = false;
	public char turn = 'x';
	public int row = 0;
	public int column = 0;

	public TicTacToeModel(TicTacToeViewModel ticTacToeViewModel) {
		this.viewModel = ticTacToeViewModel;

	}

	public boolean getDraw() {
		return draw;
	}

	public void setDraw(boolean draw) {
		this.draw = draw;
	}

}
