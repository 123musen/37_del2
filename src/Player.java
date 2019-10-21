public class Player {

    private String name;
    private int coins = 1000;


    //constructor
    public Player(String name){
            this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setCoins(int coins){
        this.coins = coins + this.coins;
    }
    public int getCoins() {
        return coins;
    }
}
