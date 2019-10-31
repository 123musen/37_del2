import org.junit.Test;
import static org.junit.Assert.*;
public class PlayerTest {
    @org.junit.Test
    public void getDice() {
        Player p3= new Player("test4");
        p3.getDice()[0].rollDice();
        p3.getDice()[1].rollDice();
        assertEquals(3.5,p3.getDice()[0].getEyes(),2.5);
        assertEquals(3.5,p3.getDice()[1].getEyes(),2.5);
    }

    @org.junit.Test
    public void swapDices() {
        Player p1 = new Player("test1");
        Player p2 = new Player("test2");

        Dice tempD1 = p1.getDice()[0];
        Dice tempD2 = p1.getDice()[1];
        Dice tempD3 = p2.getDice()[0];
        Dice tempD4 = p2.getDice()[1];

        p1.swapDices(p2);

        assertEquals(tempD3,p1.getDice()[0]);
        assertEquals(tempD4,p1.getDice()[1]);

        assertEquals(tempD1,p2.getDice()[0]);
        assertEquals(tempD2,p2.getDice()[1]);
    }
    @Test
    public void playerAccount(){
        Player p1 = new Player("test3");
        p1.getAccount().changeCoins(-3010);
        assertEquals(3000,p1.getAccount().getCoins(),3000);
    }

    @Test
    public void multipleTests(){
        for (int i = 0; i < 100000; i++) {
            getDice();
            playerAccount();
            swapDices();
        }
    }
}