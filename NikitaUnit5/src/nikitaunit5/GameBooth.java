/*
 * I have decided to comment "Player", as I feel it is the more important of the two methods. Any methods I created myself in this class will be briefly explained when they appear in "Player" or "Main"
 */
package nikitaunit5;

import java.util.Random;

public class GameBooth {
    Random r = new Random();
    private String name;
    private double cost;
    private String winprize;
    private String loseprize;
    private int totallose;
    private int initiallose;
    private int totalwin; 
    private int initialwin;

    public GameBooth(String name, double cost, String winprize, String loseprize, int totallose, int totalwin) {
        this.name = name;
        this.cost = cost;
        this.winprize = winprize;
        this.loseprize = loseprize;
        this.totallose = totallose;
        this.initiallose = totallose;
        this.totalwin = totalwin;
        this.initialwin = totalwin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getWinprize() {
        return winprize;
    }

    public void setWinprize(String winprize) {
        this.winprize = winprize;
    }

    public String getLoseprize() {
        return loseprize;
    }

    public void setLoseprize(String loseprize) {
        this.loseprize = loseprize;
    }

    public int getTotallose() {
        return totallose;
    }

    public void setTotallose(int totallose) {
        this.totallose = totallose;
    }

    public int getTotalwin() {
        return totalwin;
    }

    public void setTotalwin(int totalwin) {
        this.totalwin = totalwin;
    }
    
    public boolean WinLose () {
        boolean play = true;
        for (int i = 0; i < 3; i++) {
            int chance = r.nextInt(2) + 1;
            if (chance == 1) {
                play = false;
            }
        }
        return play;
    }
    
   @Override
    public String toString(){
        String c = "Game: " + name;
        c += "\nCost: $" + cost;
        c += "\nPrize for Winning: " + winprize;
        c += "\nConsolation Prize: " + loseprize;
        c += "\nTotal Amount of Top Prizes: " + totalwin;
        c += "\nTotal Amount of Consolations: " + totallose;
        return c;
        
    }
    
    public String GivePrize(){
        String c = name + ": ";
        if ((initialwin - totalwin) == 1) {
            c += (initialwin - totalwin) + " ultimate prize; ";
        } else {
            c += (initialwin - totalwin) + " ultimate prizes; ";
        }
        
        if ((initiallose - totallose) == 1) {
            c += (initiallose - totallose) + " consolation prize";
        } else {
            c += (initiallose - totallose) + " consolation prizes";
        }
        
        return c;
    }
    
}
