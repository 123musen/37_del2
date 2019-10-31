//Study group 37 CDIO part 2, last edited 29.10.2019
//Sejr Abildgaard s195481
//Silas Rindorf s195474
//Betina Hansen s195389
//Morten Kruuse s183681
//Import for UTF 8
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
//Use BufferedReader + InputStreamReader to get access to a file
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Game {
    //String array for future use
    private String[] text = new String[18];
    public void round() {
        Scanner scan = new Scanner(System.in);
        String language ="";
        //If the language typed in is not valid ask again
        while(!(language.equalsIgnoreCase("Danish") ||
                language.equalsIgnoreCase("English") ||
                language.equalsIgnoreCase("Spanish"))) {

            System.out.println("Choose language: Danish, English, Spanish");
            language = scan.nextLine();
        }
        //BufferedReader requires a Try catch for error where the txt file is not found
        try {
            //Use BufferedReader and InputStreamReader to get access to a file. The file has to
            // be in a language folder which has another
            // folder which is required to be spelled in uppercase and the file has to be in lowercase.
            //The uppercase folder name and the file name has to be the same
            //UTF_8 to get access to ÆØÅ...
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (getClass().getResourceAsStream( "language/" + language.toUpperCase()+
                            "/"+ language.toLowerCase()+ ".txt")), StandardCharsets.UTF_8));
            int x = 0;
            //Take a line until there is no lines in text document, save each line in the String array
            for (String line;  (line = br.readLine()) != null;) {
                text[x] = line;
                x++;
            }
            //Ask players for player 1's name
            System.out.print(text[0] + " ");
            Player p1 = new Player(scan.nextLine());
            //Ask players for player 2's name
            System.out.print(text[1] + " ");
            Player p2 = new Player(scan.nextLine());
            //How to quit messages
            System.out.println(text[2]);
            while (true) {
                //Ask the player to press enter
                System.out.print("\n" + p1.getName() + " " + text[3]);
                //If input is q exit for loop
                if (scan.nextLine().equalsIgnoreCase("Q")) {
                    break;
                }
                //Throw dices for player and give/take point
                turn(p1);
                //Check if the player has won
                if (victory(p1)){
                    return;
                }
                //Same procedure as earlier
                System.out.print("\n" + p2.getName() + " " + text[3]);
                if (scan.nextLine().equalsIgnoreCase("Q")) {
                    break;
                }
                turn(p2);
                if (victory(p2)){
                    return;
                }
                //Swap dices each turn
                p1.swapDices(p2);
                //end of loop
            }
           //Write out error and restart round
        } catch (Exception e) {
            System.out.println("Error: " + e);
            round();
        }
    }
    //Override toString for if a Game object is written out
    @Override
    public String toString(){
        return "Class Game This object is used to call method \"round\"";
    }
    private boolean victory(Player player){
        boolean bool = player.getAccount().getCoins() >= 3000;
        if (bool){
            System.out.println(text[4]+ " " + player.getAccount().getCoins() + " " + text[17]);
        }
        return bool;
    }
    private void turn(Player player) {
        player.getDice()[0].rollDice();
        player.getDice()[1].rollDice();
        Scanner scan = new Scanner(System.in);
        switch (player.getDice()[0].getEyes() + player.getDice()[1].getEyes()) {
            //p1 is an object that calls the class "Game.Game.Account" and calls the method "changeCoins()"
            case 2:
                player.getAccount().changeCoins(250);
                System.out.println(text[5]+ " " + text[4]+ " " + player.getAccount().getCoins());
                break;
            case 3:
                player.getAccount().changeCoins(-100);
                System.out.println(text[6]+ " " + text[4]+ " " + player.getAccount().getCoins());
                break;
            case 4:
                player.getAccount().changeCoins(100);
                System.out.println(text[7]+ " " + text[4]+ " " + player.getAccount().getCoins());
                break;
            case 5:
                player.getAccount().changeCoins(-20);
                System.out.println(text[8]+ " " + text[4]+ " "  + player.getAccount().getCoins());
                break;
            case 6:
                player.getAccount().changeCoins(180);
                System.out.println(text[9]+ " " + text[4]+ " " + player.getAccount().getCoins());
                break;
            case 7:
                player.getAccount().changeCoins(0);
                System.out.println(text[10]+ " " + text[4]+ " " + player.getAccount().getCoins());
                break;
            case 8:
                player.getAccount().changeCoins(-70);
                System.out.println(text[11]+ " " + text[4]+ " " + player.getAccount().getCoins());
                break;
            case 9:
                player.getAccount().changeCoins(60);
                System.out.println(text[12]+ " " + text[4]+ " " + player.getAccount().getCoins());
                break;
            case 10:
                player.getAccount().changeCoins(-80);
                System.out.println(text[13]+ " " + text[4]+ " " + player.getAccount().getCoins());
                System.out.print(text[14]);
                scan.nextLine();
                turn(player);
                break;
            case 11:
                player.getAccount().changeCoins(-50);
                System.out.println(text[15]+ " " + text[4]+ " " + player.getAccount().getCoins());
                break;
            case 12:
                player.getAccount().changeCoins(650);
                System.out.println(text[16]+ " " + text[4]+ " " + player.getAccount().getCoins());
                break;
            default:
                System.out.println("Error");
        }
    }
}