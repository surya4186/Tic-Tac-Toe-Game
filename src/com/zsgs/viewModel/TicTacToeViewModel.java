package com.zsgs.viewModel;

import java.util.Scanner;

import com.zsgs.model.TicTacToeModel;
import com.zsgs.view.TicTacToeView;

public class TicTacToeViewModel {
	TicTacToeView view;
	TicTacToeModel model;

	public TicTacToeViewModel(TicTacToeView ticTacToeView) {
		this.view = ticTacToeView;
		this.model = new TicTacToeModel(this);
	}

	public void startGame() {
		Scanner scan = new Scanner(System.in);

		while (gameNotOver()) {
			view.displayBoard(model.board);
			playerTurn(scan);
//			gameNotOver();
		}

		if (model.turn == 'o' && !model.getDraw()) {
			view.showWinner('x');
		} else if (model.turn == 'x' && !model.getDraw()) {
			view.showWinner('o');
		} else {
			view.showDraw();
		}
	}

	private boolean gameNotOver() {
		for (int row = 0; row < 3; row++) {
			if (model.board[row][0] == model.board[row][1] && model.board[row][0] == model.board[row][2]
					|| model.board[0][row] == model.board[1][row] && model.board[0][row] == model.board[2][row]) {
				return false;
			} else if (model.board[0][0] == model.board[1][1] && model.board[0][0] == model.board[2][2]
					|| model.board[0][2] == model.board[1][1] && model.board[0][2] == model.board[2][0]) {
				return false;
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (model.board[i][j] != 'x' && model.board[i][j] != 'o') {
					return true;
				}
			}
		}
		model.setDraw(true);
		return false;
	}

	private void playerTurn(Scanner scan) {
		if (model.turn == 'x') {
			System.out.println("Player 1(x) turn");
		} else {
			System.out.println("Player 2(o) turn");
		}

		int choice = scan.nextInt();
		switch (choice) {
		case 1: {
			model.row = 0;
			model.column = 0;
			break;
		}
		case 2: {
			model.row = 0;
			model.column = 1;
			break;
		}
		case 3: {
			model.row = 0;
			model.column = 2;
			break;
		}
		case 4: {
			model.row = 1;
			model.column = 0;
			break;
		}
		case 5: {
			model.row = 1;
			model.column = 1;
			break;
		}
		case 6: {
			model.row = 1;
			model.column = 2;
			break;
		}
		case 7: {
			model.row = 2;
			model.column = 0;
			break;
		}
		case 8: {
			model.row = 2;
			model.column = 1;
			break;
		}
		case 9: {
			model.row = 2;
			model.column = 2;
			break;
		}
		}

		if (model.board[model.row][model.column] != 'x' && model.board[model.row][model.column] != 'o') {
			model.board[model.row][model.column] = model.turn;
			model.turn = (model.turn == 'x') ? 'o' : 'x';
		} else {
			System.out.println("Box already full");
			playerTurn(scan);
		}
	}

}
