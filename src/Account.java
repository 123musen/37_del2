public class Account {

    private int coins = 1000;

    //constructor
    public Account(){

    }


    public void setCoins(int coins){
        this.coins = coins;
    }

    public void changeCoins(int change){
        coins = coins + change;
    }

    public int getCoins() {
        return coins;
    }
}
