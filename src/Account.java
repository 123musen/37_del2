public class Account {
    private int coins = 1000;
    //constructor
    public Account(){}
    public void setCoins(int coins){
        if(!(coins < 0) )this.coins = coins;
        else this.coins = 0;
    }
    public void changeCoins(int change){
        if (!(coins + change < 0)){coins += change;}
        else coins = 0;
    }
    public int getCoins() {
        return coins;
    }
}