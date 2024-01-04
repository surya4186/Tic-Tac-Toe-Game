package com.zsgs.view;

import com.zsgs.viewModel.TicTacToeViewModel;

public class TicTacToeView {
	TicTacToeViewModel viewModel;

	public TicTacToeView() {
		viewModel = new TicTacToeViewModel(this);
		viewModel.startGame();
	}

	public void displayBoard(char[][] board) {
		System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
		System.out.println("-----------");
		System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
		System.out.println("-----------");
		System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
	}

	public void showWinner(char winner) {
		System.out.println("Player " + winner + " wins!");
	}

	public void showDraw() {
		System.out.println("Game ends in a draw!");
	}

}
