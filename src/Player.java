import java.io.Serializable;

public class Player implements Serializable {


    private String playerName;
    private int bankroll;
    private int playerBet;
    //private Hand playerHand;

    public void setName(String playerName){
        this.playerName = playerName;
    }

    public String getName(){
        return this.playerName;
    }

    public void setBankroll(int bankroll){
        this.bankroll = bankroll;
    }

    public int getBankroll(){
        return this.bankroll;
    }

    public void setPlayerBet(int playerBet){
        this.playerBet = playerBet;
    }

    public int getPlayerBet(){
        return this.playerBet;
    }
}
