package org.example;
import java.util.Arrays;


public class Main {
    public static void main(String[] args){

        findWinner winner = new findWinner();
        String[][] board = {
                {"O", "X","X"},
                {"O", "X", "O"},
                {"O", "O", "X"}
        };

        String gameWinner = winner.Winner(board);
        if (!(gameWinner == null)){
            System.out.println("Winner: "+ gameWinner);
        }
        else{
            System.out.println("No winner");
        }


    }
}