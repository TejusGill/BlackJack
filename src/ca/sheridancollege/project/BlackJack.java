/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.Scanner;

/**
 *@author Tejus Singh Gill
 * date 20 Nov,2020
 * @author gillt
 */
public class BlackJack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        String nickname;
        String input;

        // ask for nickname
        System.out.println("What nickname would you like to have?");
        input = scanner.nextLine();
        nickname = input;

        // mainloop
        do {

            // new game message
            System.out.println();
            System.out.println("A new game has begun.");
            System.out.println();

            // init
            Player player = new Player(nickname);
            Player dealer = new Player("Dealer");
            GroupOfCards group = new GroupOfCards();
            group.shuffle();
            boolean gameOver = false;

            // give cards to the player
            player.addCard(group.draw());
            player.addCard(group.draw());
            System.out.println(player.getHandAsString(false));

            // give cards to the dealer
            dealer.addCard(group.draw());
            dealer.addCard(group.draw());
            System.out.println(dealer.getHandAsString(true));

            // player's turn
            do {
                System.out.println("Would " + player.getNickname() + 
                        " like to bust or stay? 'Bust/Stay'");
                do {
                    input = scanner.nextLine();
                 } while (!input.equalsIgnoreCase("Bust") &&
                        !input.equalsIgnoreCase("Stay"));

                // BUST
                if (input.equalsIgnoreCase("Bust")) {
                    player.addCard(group.draw());
                    System.out.println(player.getNickname() + " drew a card.");
                    System.out.println();
                    System.out.println(player.getHandAsString(false));
                    if (player.getHandSum() > 21) {
                        System.out.println(
                         "You busted and got a total of " + player.getHandSum() +
                                 ". Dealer wins this time!");
                        gameOver = true;
                    }
                }
                // STAY
                if (input.equalsIgnoreCase("stay")) {
                    System.out.println("You have chosen to stay. Your hand: " + 
                            player.getHandSum());
                }

            } while (input.equalsIgnoreCase("Bust") && !gameOver);

            // dealer's turn
            if (!gameOver) {
                System.out.println();
                System.out.println("- Dealers turn -");
                System.out.println();
                System.out.println(dealer.getHandAsString(false));
            }

            while (!gameOver) {

                if (dealer.getHandSum() <= 15) {
                    // DRAW CARD
                    dealer.addCard(group.draw());
                System.out.println(dealer.getNickname() + " drew another card");
                    System.out.println();
                    System.out.println(dealer.getHandAsString(false));
                    if (dealer.getHandSum() == 15) {
                        System.out.println("Blackjack! Dealer won.");
                        gameOver = true;
                    }
                    if (dealer.getHandSum() > 21) {
                        System.out.println("Dealer busted and got a total of " +
                                dealer.getHandSum() + ". "
                                + player.getNickname() + " wins this time!");
                        gameOver = true;
                    }

                } else {
                    // STAY
                    System.out.println("Dealer has chosen to stay!");
                    System.out.println();
                    int totalDealerSum = dealer.getHandSum();
                    int totalPlayerSum = player.getHandSum();

                    if (totalDealerSum > totalPlayerSum) {
                        System.out.println(
                     "Both players has decided to stay. The winner is " + 
                             dealer.getNickname()
                                + " with a total of " + totalDealerSum + ".");
                    } else {
                        System.out.println(
                          "Both players has decided to stay. The winner is "
                                        + player.getNickname()
                                + " with a total of " + totalPlayerSum + ".");
                    }
                    gameOver = true;
                }

            }

            // ask for new game
            System.out.println();
            System.out.println("Would you like to start a new game?  'Yes/No' :");
            do {
                input = scanner.nextLine();
            } while (!input.equalsIgnoreCase("Yes") &&
                    !input.equalsIgnoreCase("No"));

        } while (input.equalsIgnoreCase("Yes"));

        // tidy up
        scanner.close();
    }
    }
    

