//Study group 37 CDIO part 2, last edited 21.10.2019
//Sejr Abildgaard s195481
//Silas Rindorf s195474
//Betina Hansen s195389
//Morten Kruuse s183681

//2 players that plays each other.
//2 dices to roll
//2-12 fields for players to land on - each field, different effect.
//Each players has 1 money deposit, start at a 1000
//End game when one player has 3000 money
//Easy to translate.

//Constructors needed:
//Player/coins (start 1000)/name

//methods to Player:
//get/set coins
//get/set names



public class Test {
    public static void main(String[] args) {
        Dice d1 = new Dice(6);
        Dice d2 = new Dice (6);

        d1.rollDice();

        System.out.println(d1.getEyes());







    }

}
