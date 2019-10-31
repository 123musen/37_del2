//Study group 37 CDIO part 2, last edited 29.10.2019
//Sejr Abildgaard s195481
//Silas Rindorf s195474
//Betina Hansen s195389
//Morten Kruuse s183681
public class Player {
    private String name;
    private Account account;
    private Dice[] dice = new Dice[2];
    //Constructor
    public Player(String name){
            this.name = name;
            //creating an account from the Class Game.Account
            account = new Account();
            //Create dices for each player,
            dice[0] = new Dice(6);
            dice[1] = new Dice(6);
    }
    public void swapDices(Player player){
        Dice[] temp = this.getDice();
        this.dice = player.getDice();
        player.dice = temp;
    }
    private void setDice(Dice[] dice){
        this.dice = dice;
    }
    //
    public Dice[] getDice(){
        return dice;
    }
    //Set current dice array to a new dice array
    //Return name for player
    public String getName(){
        return name;
    }
    //returns a reference to class "Game.Account"
    public Account getAccount(){
        return account;
    }
    //Override the string to return name when object is called
    @Override
    public String toString(){
        return "Class Player [name: " +  name + "]";
    }
}