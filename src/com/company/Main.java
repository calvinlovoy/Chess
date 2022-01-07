package com.company;

public class Main {

    public static void main(String[] args) {

        /*
        The goal is to create a Chess program

        Requirements:
        - Command Line Chess Program (No graphical component)

        Classes/Objects Overview
        - Board Class
            - Attributes
                - 64 tiles to make up a board
                - Rows
                - Columns
                - Data Structure: 2d array
            - Functions:
                - setUpBoard
                - printBoard
        - Tile Class
            - Attributes:
                - position
                - Piece
            - Functions
                - isValidMove()
                - isEmpty()
                - Move() -> purely use row/column
        - Piece Class -> String Black Bishop -> "BB" (Empty Piece -> "  ")
            - Attributes:
                - color
                    - Black: B
                    - White: W
                - type
                    - Pawn: P
                    - King: K
                    - Queen: Q
                    - Rook: R
                    - Knight: N
                    - Bishop: B
             Function:
                - setPiece()
                - getPiece()

        Setting up the rest of the board

        How do we move?
        - Scanner Inputs -> (curr_row, curr_col) -> (new_row, new_col)
        - Is the user input valid?
        - What type is the piece?
        - Is the move valid?
        - Is it capturing or is the tile empty?
         */

    }
}
