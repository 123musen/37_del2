//Study group 37 CDIO part 2, last edited 29.10.2019
//Sejr Abildgaard s195481
//Silas Rindorf s195474
//Betina Hansen s195389
//Morten Kruuse s183681
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