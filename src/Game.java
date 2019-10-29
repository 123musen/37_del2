//Study group 37 CDIO part 2, last edited 21.10.2019
//Sejr Abildgaard s195481
//Silas Rindorf s195474
//Betina Hansen s195389
//Morten Kruuse s183681

import java.io.File;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
//TODO Explanation for game, Player turn

class Game {
    private String[] text = new String[20];
    void Round() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose language: Danish, English");
        String language = scan.nextLine();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (Main.class.getResourceAsStream("\\language\\"+ language.toUpperCase()+
                            "\\"+ language.toLowerCase()+ ".txt"))));
            //new FileInputStream
            int x = 0;
            for (String line;  (line = br.readLine()) != null;) {
                text[x] = line;
                x++;
            }
            System.out.println(text[3]);
            Dice d1 = new Dice(6);
            Dice d2 = new Dice(6);

            System.out.print(text[0] + " ");
            Player p1 = new Player(scan.nextLine());

            System.out.print(text[1] + " ");
            Player p2 = new Player(scan.nextLine());

            System.out.println(text[2]);
            while (true) {
                System.out.print("\n" + p1.getName() + " " + text[3]);
                if (scan.nextLine().equalsIgnoreCase("Q")) {
                    break;
                }
                Turn(p1, d1, d2);
                if (Victory(p1)){
                    return;
                }
                System.out.print("\n" + p2.getName() + " " + text[3]);
                scan.nextLine();
                Turn(p2, d1, d2);
                if (Victory(p2)){
                    return;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
    private boolean Victory(Player player){
        boolean bool = player.getAccount().getCoins() == 3000;
        if (bool){
            System.out.println(player.getName() + " " + text[17]);
        }
        return bool;
    }

    private void Turn(Player player, Dice dice1, Dice dice2) {
        dice1.rollDice();
        dice2.rollDice();
        Scanner scan = new Scanner(System.in);
        switch (dice1.getEyes() + dice2.getEyes()) {
            //p1 is an object that calls the class "Account" and calls the method "changeCoins()"
            case 2:
                player.getAccount().changeCoins(250);
                System.out.println(text[5] + text[4]+ " " + player.getAccount().getCoins());
                break;
            case 3:
                player.getAccount().changeCoins(-100);
                System.out.println(text[6] + text[4]+ " " + player.getAccount().getCoins());
                break;
            case 4:
                player.getAccount().changeCoins(100);
                System.out.println(text[7] + text[4]+ " " + player.getAccount().getCoins());
                break;
            case 5:
                player.getAccount().changeCoins(-20);
                System.out.println(text[8] + text[4]+ " "  + player.getAccount().getCoins());
                break;
            case 6:
                player.getAccount().changeCoins(180);
                System.out.println(text[9]+ text[4]+ " " + player.getAccount().getCoins());
                break;
            case 7:
                player.getAccount().changeCoins(0);
                System.out.println(text[10] + text[4]+ " " + player.getAccount().getCoins());
                break;
            case 8:
                player.getAccount().changeCoins(-70);
                System.out.println(text[11] + text[4]+ " " + player.getAccount().getCoins());
                break;
            case 9:
                player.getAccount().changeCoins(60);
                System.out.println(text[12] + text[4]+ " " + player.getAccount().getCoins());
                break;
            case 10:
                player.getAccount().changeCoins(-80);
                System.out.println(text[13] + text[4]+ " " + player.getAccount().getCoins());
                System.out.print(text[14]);
                scan.nextLine();
                Turn(player, dice1, dice2);
                break;
            case 11:
                player.getAccount().changeCoins(-50);
                System.out.println(text[15] + text[4]+ " " + player.getAccount().getCoins());
                break;
            case 12:
                player.getAccount().changeCoins(650);
                System.out.println(text[16] + text[4]+ " " + player.getAccount().getCoins());
                break;
            default:
                System.out.println("Error");

        }
    }
}