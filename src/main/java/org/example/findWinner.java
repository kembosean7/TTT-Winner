package org.example;

public class findWinner {
    public String Winner(String[][] board) throws IllegalArgumentException{

        if(board.length != 3 || board[0].length != 3 || board[1].length != 3 || board[2].length != 3){
            throw new IllegalArgumentException("Board must be a 3x3 grid");
        }

        String[][] possibleWins = {
                {board[0][0], board[0][1], board[0][2]},
                {board[1][0], board[1][1], board[1][2]},
                {board[2][0], board[2][1], board[2][2]},
                {board[0][0], board[1][0], board[2][0]},
                {board[0][1], board[1][1], board[2][1]},
                {board[0][2], board[1][2], board[2][2]},
                {board[0][0], board[1][1], board[2][2]},
                {board[0][2], board[1][1], board[2][0]}
        };

        for (String[] line : possibleWins) {
            if (line[0].equals("X") && line[1].equals("X") && line[2].equals("X")) {
                return "X";
            } else if (line[0].equals("O") && line[1].equals("O") && line[2].equals("O")) {
                return "O";
            } else if (!(line[0].equals("O") || line[0].equals("X")) || !(line[1].equals("O") || line[1].equals("X")) || !(line[2].equals("O") || line[2].equals("X"))) {
                throw new IllegalArgumentException("Invalid character in board, Only 'X', 'O'");
            }

        }
        return null;
    }
}
