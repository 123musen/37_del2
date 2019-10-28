import java.util.Scanner;
//TODO Explanation for game, Player turn

public class Game {

    public void Round() {
        Scanner scan = new Scanner(System.in);

        Dice d1 = new Dice(6);
        Dice d2 = new Dice(6);

        System.out.print("Input Player 1 name: ");
        Player p1 = new Player(scan.nextLine());

        System.out.print("Input Player 2 name: ");
        Player p2 = new Player(scan.nextLine());


        while (true) {
            System.out.print("\nPlayer 1. Press enter for turn");
            if (scan.nextLine().equalsIgnoreCase("Q")){
                return;
            }
            Turn(p1, d1, d2);
            System.out.print("\nPlayer 2. Press enter for turn");
            scan.nextLine();
            Turn(p2, d1, d2);
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