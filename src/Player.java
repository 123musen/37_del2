//Study group 37 CDIO part 2, last edited 21.10.2019
//Sejr Abildgaard s195481
//Silas Rindorf s195474
//Betina Hansen s195389
//Morten Kruuse s183681
//written by Silas and Betina


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
        this.coins = coins;
    }

    public void changeCoins(int change){
        coins = coins + change;
    }

    public int getCoins() {
        return coins;
    }
}
