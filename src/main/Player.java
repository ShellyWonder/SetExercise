package main;
public class Player{
    private String name;
    private String winningHand;
    
    
    
    public Player(String name, String winningHand){
        this.name = name;
        this.winningHand = winningHand;
    }   
    // Getters and setters  
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getWinningHand(){
        return winningHand;
    }   

    public void setWinningHand(String winningHand){
        this.winningHand = winningHand;
    }
}