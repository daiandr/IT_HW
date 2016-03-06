package Ships;

import java.util.Scanner;

public class Demo {



    static  void enterCoordinates(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter boat coordinates (row,col):");
        int row = scan.nextInt();
        int col = scan.nextInt();
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Player player1 = new Player();
        Player player2 = new Player();
        player1.setOpponent(player2);
        player2.setOpponent(player1);

        System.out.println("Add boat h/v : ");
        String entry = scan.nextLine();

        if(entry.equalsIgnoreCase("h")){
            System.out.println("Enter boat coordinates (row,col):");
            int row = scan.nextInt();
            int col = scan.nextInt();
            player1.addHorizontalShip(player1.getBoat(),row,col);
        }
        if(entry.equalsIgnoreCase("v")){
            System.out.println("Enter boat coordinates (row,col):");
            int row = scan.nextInt();
            int col = scan.nextInt();
            player1.addVerticalShip(player1.getBoat(),row,col);
        }


//        player1.addHorizontalShip(player1.getBoat(), 3, 4);
//        player1.addHorizontalShip(player1.getLiner(), 4, 2);
//        player1.addVerticalShip(player1.getSub(),0,2);
//        player2.shoot(3,5);
//        player1.printPlayerBoard();


    }


}
