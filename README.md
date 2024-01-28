# Tic Tac Toe Game

The Tic Tac Toe Game is a simple console-based application implemented in Java. It allows two players to play the classic game of Tic Tac Toe.

## Overview

This application provides a text-based interface for players to take turns marking spaces on a 3x3 grid. The game continues until one player wins or the board is full, resulting in a draw.

## Features

- **Display Board:** Visual representation of the current game board.
- **Player Turns:** Alternating turns for two players (X and O).
- **Winning Condition:** Recognizes when a player has won the game.
- **Draw Condition:** Ends the game in a draw if the board is full.

### Planning
 Project Duration: 31 days
 Type: Console Application
 Language: Java
 Contributor: 1

## Project Structure

- **Package: com.zsgs.view**
  - `TicTacToeView`: Displays the game board, winner, and draw messages.

- **Package: com.zsgs.viewModel**
  - `TicTacToeViewModel`: Manages the game logic, player turns, and game outcomes.

- **Package: com.zsgs.model**
  - `TicTacToeModel`: Represents the game board and its state.

## Usage

1. Start the application.
2. Players take turns entering a number (1-9) to mark the corresponding space on the board.
3. The game continues until one player wins or the board is full.

## Classes

### `TicTacToeView`

The view class responsible for displaying the game board and outcome messages.

### `TicTacToeViewModel`

Manages the game logic, including player turns, winning conditions, and game outcomes.

### `TicTacToeModel`

Represents the game board and its state.

## License

This Tic Tac Toe Game is licensed under the [MIT License](LICENSE).
