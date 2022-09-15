import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class GameTest {

    @Test
    public void test() {
        Player player1 = new Player(1, "Alex", 300);
        Player player2 = new Player(22, "Anya", 100);
        Player player3 = new Player(333, "Sveta", 400);

        Game game = new Game();
        game.register(player1);
        game.register(player2);
        game.register(player3);

        ArrayList<Player> actual = game.getAllPlayers();
        ArrayList<Player> expected = new ArrayList<>();
        expected.add(player1);
        expected.add(player2);
        expected.add(player3);

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void test2() {

        Player player1 = new Player(1, "Alex", 300);
        Player player2 = new Player(22, "Anya", 100);
        Player player3 = new Player(333, "Sveta", 400);

        Game game = new Game();
        game.register(player1);
        game.register(player2);
        game.register(player3);

        game.round("Alex", "Anya");

        int actual = game.round("Alex", "Anya");
        int expected = 1;
        Assertions.assertEquals(expected, actual);


    }
}
