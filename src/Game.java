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


        System.out.println("Press enter to start");
        while (!scan.nextLine().equalsIgnoreCase("Q")) {
            System.out.println("Player 1. Press enter for turn");
            System.out.println(Turn(p1, d1, d2));
            System.out.println("Player 2. Press enter for turn");
            scan.nextLine();
            System.out.println(Turn(p2, d1, d2));

        }
    }
    private String Turn(Player p, Dice d1, Dice d2) {
        d1.rollDice();
        d2.rollDice();
        switch (d1.getEyes() + d2.getEyes()) {
            //p1 is an object that calls the class "Account" and calls the method "changeCoins()"
            case 2:
                p.getAccount().changeCoins(250);
                System.out.print("Tower +250. Total coins: " + p.getAccount().getCoins());
                break;

            case 3:
                p.getAccount().changeCoins(-100);
                System.out.print("Crater -100. Total coins: " + p.getAccount().getCoins());
                break;

            case 4:
                p.getAccount().changeCoins(100);
                System.out.print("Palace Gates +100. Total coins: " + p.getAccount().getCoins());
                break;

            case 5:
                p.getAccount().changeCoins(-20);
                System.out.print("Cold Desert -20. Total coins: " + p.getAccount().getCoins());
                break;

            case 6:
                p.getAccount().changeCoins(180);
                System.out.print("Walled city +180. Total coins: " + p.getAccount().getCoins());
                break;

            case 7:
                p.getAccount().changeCoins(0);
                System.out.print("Monastary 0. Total coins: " + p.getAccount().getCoins());
                break;

            case 8:
                p.getAccount().changeCoins(-70);
                System.out.print("Black Cave -70. Total coins: " + p.getAccount().getCoins());
                break;

            case 9:
                p.getAccount().changeCoins(60);
                System.out.print("Huts in the Mountain +60. Total coins: " + p.getAccount().getCoins());
                break;

            case 10:
                p.getAccount().changeCoins(-80);
                System.out.println("The Werewolf-Wall -80. Total coins: " + p.getAccount().getCoins());
                System.out.print("roll again");
                break;

            case 11:
                p.getAccount().changeCoins(-50);
                System.out.print("The Pit -50. Total coins: " + p.getAccount().getCoins());
                break;

            case 12:
                p.getAccount().changeCoins(650);
                System.out.print("Goldmine +650. Total coins: " + p.getAccount().getCoins());
                break;
        }
        return "";
    }
}