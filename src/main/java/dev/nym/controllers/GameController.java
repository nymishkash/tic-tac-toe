package dev.nym.controllers;

import dev.nym.exceptions.InvalidMoveException;
import dev.nym.models.GameState;
import dev.nym.models.Player;
import dev.nym.models.Game;

import java.util.List;

public class GameController {

    public Game startGame(int dimension, List<Player> players) {
        return new Game(dimension, players);
    }

    public void makeMove(Game game) throws InvalidMoveException {
        game.makeMove();
    }

    public GameState checkState(Game game) {
        return game.getGameState();
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }

    public void printBoard(Game game) {
        game.printBoard();
    }
}
