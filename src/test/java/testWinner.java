import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
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

    @Test
    public void testWinnerDia2(){

        findWinner winner = new findWinner();
        String[][] board = {
                {"O", "X", "O"},
                {"O", "O", "X"},
                {"X", "X", "O"}
        };
        String ouput = winner.Winner(board);
        assertEquals("O",ouput);
    };

    @Test
    public void testInvalidBoard(){

        findWinner winner = new findWinner();
        String[][] board = {
                {"X", "O", "x",},
                {"O", "O", "X"}
        };

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> { winner.Winner(board);});
        assertEquals("Board must be a 3x3 grid", exception.getMessage());

    };
    @Test
    public void testInvalidBoard2(){

        findWinner winner = new findWinner();
        String[][] board = {
                {"X", "O", "x",},
                {"O", "O", "X"},
                {"O", "X"}

        };

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> { winner.Winner(board);});
        assertEquals("Board must be a 3x3 grid", exception.getMessage());

    };

    @Test
    public void testInvalidBoardPLay(){

        findWinner winner = new findWinner();
        String[][] board = {
                {"O", "X", "P"},
                {"O", "Z", "X"},
                {"X", "X", "O"}
        };

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {winner.Winner(board);});
        assertEquals("Invalid character in board, Only 'X', 'O'", exception.getMessage());

    };

    @Test
    public void testInvalidBoardEmptySpace(){

        findWinner winner = new findWinner();
        String[][] board = {
                {"O", "X", ""},
                {"O", "", "X"},
                {"X", "X", "O"}
        };

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {winner.Winner(board);});
        assertEquals("Invalid character in board, Only 'X', 'O'", exception.getMessage());

    };


};
