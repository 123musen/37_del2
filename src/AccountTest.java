import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {
    @Test
    public void getCoins() {
        Account account3 = new Account();
        assertEquals(1000,account3.getCoins());
    }

    @Test
    public void setCoins() {
        Account account1 = new Account();
        account1.setCoins(0);
        assertEquals(0,account1.getCoins());

        account1.setCoins(-1);
        assertEquals(0,account1.getCoins());

        account1.setCoins(0);
        assertEquals(0,account1.getCoins());

        account1.setCoins(1);
        assertEquals(1,account1.getCoins());

        account1.setCoins(100000);
        assertEquals(100000,account1.getCoins());

        account1.setCoins(-400000);
        assertEquals(0,account1.getCoins());
    }

    @Test
    public void changeCoins() {
        Account account2 = new Account();

        account2.changeCoins(-2000);
        assertEquals(0,account2.getCoins());

        account2.changeCoins(-2000);
        assertEquals(0,account2.getCoins());
    }

    @Test
    public void testMultiple(){
        for (int i = 0; i < 100000; i++) {
            setCoins();
            changeCoins();
            getCoins();
        }
    }
}