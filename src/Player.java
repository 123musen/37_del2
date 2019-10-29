//Study group 37 CDIO part 2, last edited 21.10.2019
//Sejr Abildgaard s195481
//Silas Rindorf s195474
//Betina Hansen s195389
//Morten Kruuse s183681
//written by Silas and Betina


public class Player {

    private String name;
    private Account account;
    private Dice[] dice = new Dice[2];

    //constructor
    public Player(String name){
            this.name = name;
            //creating an account from the Class Account
            account = new Account();
            dice[0] = new Dice(6);
            dice[1] = new Dice(6);
    }

    public void swapDices(Player player){
        Dice[] temp = this.getDice();
        this.setDice(player.getDice());
        player.setDice(temp);
    }
    public Dice[] getDice(){
        return dice;
    }
    public void setDice(Dice[] dice){
        this.dice = dice;
    }

    //method
    public String getName(){
        return name;
    }



    //returns a reference to class "Account" (method)
    public Account getAccount(){
        return account;
    }


}
