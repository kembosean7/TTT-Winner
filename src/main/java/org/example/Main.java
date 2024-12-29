package org.example;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public String findWinner(String[][] board){


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
            }

        }
        return null;
    }
    public static void main(String[] args){

        Main ttt = new Main();
        String[][] board = {
                {"P", "M", "X"},
                {"O", "X", "O"},
                {"X", "P", "X"}
        };

        String winner = ttt.findWinner(board);
        System.out.println(winner);
        if (!(winner == null)){
            System.out.println("Winner: "+ winner);
        }
        else{
            System.out.println("No winner");
        }


    }
}