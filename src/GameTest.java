import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {
    @Test
    public void round() {
        Player player = new Player("BIb");
        assertEquals(3.5, player.getDice()[0].getEyes(), 2.5);
        assertEquals(3.5, player.getDice()[1].getEyes(), 2.5);
        assertEquals(1850, player.getAccount().getCoins(), 1850);
    }
    @Test
    public void roundMultiple(){
        for (int i = 0; i < 1000; i++) {
            round();
        }
    }
}