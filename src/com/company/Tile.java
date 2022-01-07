package com.company;
public class Tile {

    Piece curr_piece;

    public Tile(Piece curr_piece){
        this.curr_piece = new Piece();
    }

    public Tile(String color, String type){
        this.curr_piece = new Piece(color, type);
    }
}
