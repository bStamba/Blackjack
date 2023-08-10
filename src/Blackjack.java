import java.util.*;

public class Blackjack {

    private ArrayList<Card> currentDeck = new ArrayList<>();
    private ArrayList<Card> playersHand = new ArrayList<>();
    private ArrayList<Card> dealersHand = new ArrayList<>();
    private Player player1 = new Player();
    private Hand handHelper = new Hand();
    Deck theDeck = new Deck();

    public void startGame(){
        System.out.println("Welcome to Bongo McElmore's Blackjack Casino!");
        System.out.println("The object of the game is to get closest to 21 without going over.");
        System.out.println("The dealer will stay on hard 17, otherwise will hit.");
        System.out.println("Enjoy and please place your bets!");

        theDeck.initalizeDeck();
        deal();
    }

    public void deal(){
        currentDeck = theDeck.getDeck();

        //Deal the starting 4 cards unless we don't have enough, then we will shuffle
        //but we will keep the cards that were remaining on top.
        if(currentDeck.size() > 3){
            for(int i = 0; i < 2; i++) {
                handHelper.setPlayerHand(currentDeck.get(0));
                currentDeck.remove(0);
                handHelper.setDealerHand(currentDeck.get(0));
                currentDeck.remove(0);
            }
        }
        else{
            theDeck.shuffleDeck(currentDeck);
            currentDeck = theDeck.getDeck();
            for(int i = 0; i < 2; i++) {
                handHelper.setPlayerHand(currentDeck.get(0));
                currentDeck.remove(0);
                handHelper.setDealerHand(currentDeck.get(0));
                currentDeck.remove(0);
            }
        }

    }

    public void getBets(){
        int playerBet = 0;

        if(player1.getBankroll() > 0){
            System.out.println("Place your bets.");
            //player1.setPlayerBet();
        }
        else {
            //player1.setBankroll(100);
        }
    }

    //We want to display the player bet, the current card values, and the 2nd or higher
    //card of the dealer should be face up. We should check for blackjack, then we want to
    //prompt the player to hit or stay if there is no blackjack.
    public void currentAction(){
        //playerHand = playerHand.getPlayerHand();
    }

}
