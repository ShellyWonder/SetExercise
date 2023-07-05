package main;
public class PokerHand{
    private String playerName;
    private String winningHand;
    
    
    
    public PokerHand(String playerName, String winningHand){
        this.playerName = playerName;
        this.winningHand = winningHand;
    }   
    // Getters and setters  
    public String getplayerName(){
        return playerName;
    }

    public void setplayerName(String playerName){
        this.playerName = playerName;
    }

    public String getWinningHand(){
        return winningHand;
    }   

    public void setWinningHand(String winningHand){
        this.winningHand = winningHand;
    }
}