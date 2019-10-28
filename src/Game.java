//Study group 37 CDIO part 2, last edited 21.10.2019
//Sejr Abildgaard s195481
//Silas Rindorf s195474
//Betina Hansen s195389
//Morten Kruuse s183681

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
//TODO Explanation for game, Player turn

class Game {

    void Round() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Choose language: Danish, English");
        String language = scan.nextLine();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    new FileInputStream("src\\language\\"+ language.toUpperCase()+
                            "\\"+ language.toLowerCase()+ ".txt")));
            Dice d1 = new Dice(6);
            Dice d2 = new Dice(6);

            System.out.print(br.readLine() + " ");
            Player p1 = new Player(scan.nextLine());

            System.out.print(br.readLine() + " ");
            Player p2 = new Player(scan.nextLine());

            System.out.println(br.readLine());
            br.mark(100);
            while (true) {
                br.reset();
                System.out.print("\n" + p1.getName() + " " + br.readLine());
                if (scan.nextLine().equalsIgnoreCase("Q")) {
                    return;
                }
                Turn(p1, d1, d2);
                br.reset();
                System.out.print("\n" + p2.getName() + " " + br.readLine());
                scan.nextLine();
                Turn(p2, d1, d2);
            }
        } catch (Exception ignored) {
            System.out.println("Error");
        }
    }

    private void Turn(Player player, Dice dice1, Dice dice2) {
        dice1.rollDice();
        dice2.rollDice();
        Scanner scan = new Scanner(System.in);
        switch (dice1.getEyes() + dice2.getEyes()) {
            //p1 is an object that calls the class "Account" and calls the method "changeCoins()"
            case 2:
                player.getAccount().changeCoins(250);
                System.out.println("Tower +250. Total coins: " + player.getAccount().getCoins());
                break;
            case 3:
                player.getAccount().changeCoins(-100);
                System.out.println("Crater -100. Total coins: " + player.getAccount().getCoins());
                break;
            case 4:
                player.getAccount().changeCoins(100);
                System.out.println("Palace Gates +100. Total coins: " + player.getAccount().getCoins());
                break;
            case 5:
                player.getAccount().changeCoins(-20);
                System.out.println("Cold Desert -20. Total coins: " + player.getAccount().getCoins());
                break;
            case 6:
                player.getAccount().changeCoins(180);
                System.out.println("Walled city +180. Total coins: " + player.getAccount().getCoins());
                break;
            case 7:
                player.getAccount().changeCoins(0);
                System.out.println("Monastary 0. Total coins: " + player.getAccount().getCoins());
                break;
            case 8:
                player.getAccount().changeCoins(-70);
                System.out.println("Black Cave -70. Total coins: " + player.getAccount().getCoins());
                break;
            case 9:
                player.getAccount().changeCoins(60);
                System.out.println("Huts in the Mountain +60. Total coins: " + player.getAccount().getCoins());
                break;
            case 10:
                player.getAccount().changeCoins(-80);
                System.out.println("The Werewolf-Wall -80. Total coins: " + player.getAccount().getCoins());
                System.out.print("roll again (press enter)");
                scan.nextLine();
                Turn(player, dice1, dice2);
                break;
            case 11:
                player.getAccount().changeCoins(-50);
                System.out.println("The Pit -50. Total coins: " + player.getAccount().getCoins());
                break;
            case 12:
                player.getAccount().changeCoins(650);
                System.out.println("Goldmine +650. Total coins: " + player.getAccount().getCoins());
                break;
            default:
                System.out.println("Error");

        }
    }
}