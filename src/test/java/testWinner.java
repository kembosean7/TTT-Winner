import static org.junit.Assert.assertEquals;

import org.example.findWinner;
import org.junit.Test;
public class testWinner {

    @Test
    public void testWinnerCol() {


        findWinner winner = new findWinner();
        String[][] board = {
                {"O", "X", "X"},
                {"O", "X", "O"},
                {"O", "O", "X"}
        };

        String output = winner.Winner(board);
        assertEquals("O", output);
    };
    @Test
    public void testWinnerRow(){
        findWinner winner = new findWinner();
        String[][] board = {
                {"X", "X", "X"},
                {"O", "O", "X"},
                {"O", "O", "X"}
        };
        String output = winner.Winner(board);
        assertEquals("X",output);

    };

    @Test
    public void testWinnerDia(){

        findWinner winner = new findWinner();
        String[][] board = {
                {"X", "O", "X"},
                {"O", "X", "O"},
                {"O", "X", "X"}
        };
        String output = winner.Winner(board);
        assertEquals("X",output);
    };


};
