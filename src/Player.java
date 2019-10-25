//Study group 37 CDIO part 2, last edited 21.10.2019
//Sejr Abildgaard s195481
//Silas Rindorf s195474
//Betina Hansen s195389
//Morten Kruuse s183681
//written by Silas and Betina


public class Player {

    private String name;
    private Account account;


    //constructor
    public Player(String name){
            this.name = name;
            //creating an account from the Class Account
            account = new Account();
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
