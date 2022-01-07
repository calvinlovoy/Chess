package com.company;

public class Piece {

    public String color;
    public String type;

    public Piece(){
        this.color = " ";
        this.type = " ";
    }
    public Piece(String color, String type){
        this.color = color;
        this.type = type;
    }

    public String getPiece(){
        return this.color + this.type;
    }

    public void setPiece(String new color, String new type){
        this.color = new_color;
        this.type = new_type;
    }
}
