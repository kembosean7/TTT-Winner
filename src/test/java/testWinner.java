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

}