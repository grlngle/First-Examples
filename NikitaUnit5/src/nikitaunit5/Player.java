/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nikitaunit5;

// Here, I import the neccessary java packages (unlike the main, this includes "ArrayList", allowing me to utilize ArrayLists).
import java.util.ArrayList;
import java.text.DecimalFormat;



public class Player {
    
    // In the following 5 lines, I initialize and declare that which I will use. Like in the main, I declare my "DecimalFormat", and I initialize an ArrayList, which I will use to store the prizes the Player wins in games. 
    // I also declare and initialize my variables "name", "money" and "counter". "name" and "money" store the name of the "Player" object, and the amount of money the "Player" has. "counter" is for the storing and setting information of "GameBooth" (more info under "PlayGame()")
    DecimalFormat decimal = new DecimalFormat("0.00");
    public final ArrayList <String> prizesWon = new ArrayList();;
    private String name; 
    private int counter;
    private double money; 

    // This is the constructor, used in the declaration and initialization of the object in the main. Here, the constructor requires you to put a string and double into the parameters, which get set as the "name" and "money".
    public Player(String name, double money) {
        this.name = name;
        this.money = money;
    }
    
    
    // This is one of my many "getters". When called, it simply returned the information requested (in this scenario, the name is returned). I didn't end up using all of my "getters", but I kept them as a back-up.
    public String getName() {
        return name;
    }
    // Going hand in hand with the "getters", this is a "setter". When called, the method recieves information, which is then set as the requested variable (for example, here, they set name. The method recieves a String, which is then set as the new "name"). Like the "getters", I don't believe I used all of my "setters".
    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public ArrayList<String> getPrizesWon() {
        return prizesWon;
    }
    
    // I made "addPrize" if I ever needed to add a prize to the ArrayList from the main. I never ended up calling this method, but I kept it just in case.
    public void addPrize(String x) {
        prizesWon.add(x);
    }
    
    // This is my "PlayGame" method, which runs the game itself (by recieving a "GameBooth" object through the parameter). I will provide my comments on different lines of the method.
    public void PlayGame(GameBooth obj) {
        System.out.println(name + " goes to play " + obj.getName());  // These first 3 lines (59-61), print that the "Player" went to the "GameBooth" (by using a "getter" from the "GameBooth").  I then use an if-statement to check that the player has enough money to play. If the player doesn't, they are simply told that they are unable to play. 
        if ((this.money - obj.getCost()) <= 0) {
            System.out.println("\tUh-oh, " + name + " doesn't have enough money!");
        } else {       // However, if they do have enough money, the rest of the code runs. The cost of the game is taken away from the money of the "Player". On line 64, I then check if the player has won with the GameBooth method "WinLose". When WinLose runs, a 50% chance is run 3 times. If the player wins the chance all three times, they win the game, returning "true".
            this.money = this.money - obj.getCost();
            if (obj.WinLose() == false)  {  // If the Player lost the game (WinLose() returned false), the method prints that "the player lost".
                System.out.print("\t" + name + " lost the game... ");
                if (obj.getTotallose() == 0) { // Then, if there are no more consolation prizes, the method also prints out that "the player didn't get a prize".
                    System.out.println("They didn't get any prize, as the booth is out of consolation prizes.");
                } else {      // If there are still conselation prizes, we use a "getter" to retrieve the conselation prize, and then add it to the ArrayList. I then use "counter", which uses a "getter" to retrieve the tptal amount of prizes, takes 1 away, and sets amount as the new total.
                    prizesWon.add(obj.getLoseprize());
                    System.out.println("They got " + obj.getLoseprize() + ".");
                    counter = obj.getTotallose();
                    counter = counter - 1;
                    obj.setTotallose(counter);
                }
            } else {      // If the player won the chance, this part of the code runs instead. It is identical to the above "losing" portion, except it uses winning prizes.
                System.out.print("\t" + name + " won the game! ");
                if (obj.getTotalwin() == 0) {          // If there is no winning prize left, you get the message that "the booth is out of prizes".
                    System.out.println("They didn't get any prize, as the booth is out of ultimate prizes.");
                } else {                               // If there is still a prize, it is added to the ArrayList "prizesWon", and 1 is taken away from the "Totalwin" in GameBooth (using counter, just like with the "losing" portion)
                    prizesWon.add(obj.getWinprize());
                    System.out.println("They got " + obj.getWinprize() + ".");
                    counter = obj.getTotalwin();
                    counter = counter - 1;
                    obj.setTotalwin(counter);
                }  
            }
        }
    }
        
    // This is my equals() method, which checks if the current object is equal to another (if this "Player" is the same as another "Player")
    // It does this by comparing the "name" and "money" variables, and returning "true" if they match (and "false" if they don't)
    // This method is never actually called in the main, but it can be helpful, and is therefore kept in case it would be needed.
    @Override 
    public boolean equals(Object obj) {
        Player temp = (Player) obj;
        if (this.money == temp.getMoney() && this.name.equals(temp.getName())){
            return true;
        }
            
        return false;
    }
    
    
    // This is my "toString" method. When called, it creates a String, which holds all of the information pertaining to the amount of money left, and then (using a "for loop"), adds all of the prizes won by a "Player" object. This string is then returned to the main.
    @Override
    public String toString(){
        String c = name + "'s money: $" + decimal.format(money);
        c += "\n" + name + " won: ";
        if (prizesWon.isEmpty()) {
            c += "Nothing :( ";
        } else {
            for (int i = 0; i < prizesWon.size(); i++) {
                if (i == (prizesWon.size() - 1)) {
                    c += prizesWon.get(i);
                } else {
                    c += prizesWon.get(i) + ", ";
                }
            }
        }
        return c;
        
    }
    
    
}
