import java.util.*;

public class Hand {

    private ArrayList<Card> playerHand = new ArrayList<>();
    private ArrayList<Card> dealerHand = new ArrayList<>();

    public Hand(){

    }
    public void setPlayerHand(Card card){
        playerHand.add(card);
    }

    public ArrayList<Card> getPlayerHand(){
        return playerHand;
    }

    public void setDealerHand(Card card){
        dealerHand.add(card);
    }

    public ArrayList<Card> getDealerHand(){
        return dealerHand;
    }

    public void endHand(){
        playerHand.clear();
        dealerHand.clear();
    }


}

