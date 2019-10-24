import java.util.Scanner;


public class Game {
    public void Round() {

        Scanner scan= new Scanner (System.in);

        Dice d1 = new Dice(6);
        Dice d2 = new Dice(6);

        Player p1 = new Player(scan.nextLine());


        System.out.println(d1.getEyes());

        switch (d1.getEyes()+d2.getEyes()){
            case 2:
                p1.changeCoins(250);
                System.out.print("Tower +250" + coins);
                break;

            case 3:
                p1.changeCoins(-100);
                System.out.print("Crater -100" + coins);
                break;

            case 4:
                p1.changeCoins(+100);
                System.out.print("Palace Gates +100" + coins);
                break;

            case 5:
                p1.changeCoins(-20);
                System.out.print("Cold Desert -20" + coins);
                break;

            case 6:
                p1.changeCoins(+180);
                System.out.print("Walled city +180" + coins);
                break;

            case 7:
                p1.changeCoins (+0);
                System.out.print("Monastary 0" + coins);
                break;

            case 8:
                p1.changeCoins(-70);
                System.out.print("Black Cave -70" + coins);
                break;

            case 9:
                p1.changeCoins(+60);
                System.out.print("Huts in the Mountain +60" + coins);
                break;

            case 10:
                p1.changeCoins(-80);
                System.out.print("The Werewolf-Wall -80" + coins);
                System.out.println("roll again");
                break;

            case 11:
                p1.changeCoins(-50);
                System.out.print("The Pit -50" + coins);
                break;

            case 12:
                p1.changeCoins(+650);
                System.out.print("Goldmine +650" + coins);
                break;


        }
    }
}