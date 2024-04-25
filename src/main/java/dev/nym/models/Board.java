package dev.nym.models;

import java.util.ArrayList;
import java.util.List;

public class Board {

    int size;
    List<List<Cell>> board;

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }


    public Board(int size) {
        this.size = size;
        board = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            board.add(new ArrayList<>());

            for (int j = 0; j < size; j++) {
                board.get(i).add(new Cell(i, j));
            }
        }
    }

    public void printBoard() {
        for (List<Cell> row : board) {
            for (Cell cell : row) {
                if (cell.getCellState().equals(CellState.EMPTY)) {
                    System.out.print("| -- |");
                }
                else{
                    System.out.print("| " + cell.getPlayer().getSymbol().getaChar() + " |");
                }
            }

            System.out.println();
        }
    }

}
