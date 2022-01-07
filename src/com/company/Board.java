package com.company;

public class Board {

    final public Integer rows = 8;
    final public Integer cols = 8;
    Tile[][] my_board = new Tile[row][col];
    public Boolean isGameOver = false;

    public Board(){
        setupBoard();
        setupPieces();
    }

    public void setupBoard(){
        for (int row = 0; row < this.rows; row++){
            for (int col = 0; col < this.cols; col++){
                my_board[row][col] = new Tile();
            }
        }
    }

    public void setupPieces(){
        for (int col = 0; this.cols; col++){
            my_board[6][col].curr_piece.setPiece("W", "P");
        }
    }
}
