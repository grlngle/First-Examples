/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nikitaunit5;

// Here, I import Decimal Format and Scanner, which I will use at times in the code. They will allow me to accept user input and make sure that cost is two decimals, respectively.
import java.text.DecimalFormat;
import java.util.Scanner;

public class Carnival {

    /*
     * In the next section of code (Lines 21 - 31), I declare and initialize objects and variables, which I will use throughout the program.
     * First, I initialize Scanner and Decimal Format, so that I am able to use both of them. 
     * Then, I declare and initialize 4 "Player" and 3 "GameBooth" objects, one for each of the players and games. I do this by calling the constructor the objects, setting up the required information (e.g. the names of the players, the amount of money they have, the cost of the games)
     * Finally, I declare two variables (answer and name), which I will use for storing inputs.
     */
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.00");
        Player Bob = new Player("Bob", 10.00);
        Player Rob = new Player("Rob", 10.00);
        Player Jacob = new Player("Jacob", 20.00);
        Player user = new Player("name", 15.00);
        GameBooth balloon = new GameBooth("Balloon Shot", 1.50, "Stuffed Tiger", "Red Balloon",  40, 10);
        GameBooth wheel = new GameBooth("Spin the Wheel", 3.00, "Hot Dog Toaster", "Hard Candy", 50, 3);
        GameBooth bottle = new GameBooth("Bottle Throw", 2.00, "Pokemon Plush", "Colored Pencil", 30, 5);
        String answer;
        String name;
        System.err.println("THERE ARE THREE GAMES: BALLOON SHOT, SPIN THE WHEEL, AND BOTTLE THROW");
        System.err.println("BALLOON SHOT COSTS $1.50, SPIN THE WHEEL COSTS $3.00, and BOTTLE THROW COSTS $2.00");
        
        /* 
        * After printing various information to the user (32-33), I start running the next section of the program (42-51), which sets the name of the final "Player" object.
        * In a "while true" loop, I ask the user for their name. If their name is equal to one of the existing names, they are asked to re-enter a name. If they enter "quit", I also ask them to think of a better name.
        * Else, the name of the final player is set with the help of a "setter" from the Player Class (after which I break out of the while loop).
        */
        
        while (true) {
            System.out.println("What is your name? (NOTE: IF YOUR NAME IS BOB, ROB, OR JACOB, YOU ARE ALREADY IN THE GAME. INPUT A DIFFERENT NAME)");
            name = input.nextLine(); 
            if (name.toLowerCase().equals("bob") || name.toLowerCase().equals("rob") || name.toLowerCase().equals("jacob")) {
                System.out.println("Please follow the instructions provided more carefully.");
            } else if (name.toLowerCase().equals("quit")){
                System.out.println("\"Quit\"? Really? You can think of a better name than that!");
            } else {
                user.setName(name);
                break;
            }
        }
        
        // The majority of the code is inside of this "while true" loop, so that the program can loop as many times as the user needs it to. The program asks which character the user wishes to use, and the user is able to input their answer.
        while (true) {
            System.out.println("Choose a player or type quit: Bob ($" + decimal.format(Bob.getMoney()) + "), Rob ($" + decimal.format(Rob.getMoney()) + "), Jacob ($" + decimal.format(Jacob.getMoney()) + ") or " + user.getName() + " ($" + decimal.format(user.getMoney()) + ")");
            System.out.print("");
            answer = input.nextLine().toLowerCase();      // "answer" stores the user input, so that it can be compared as a String. 
            if (answer.equals("bob")) {  // If the user inputted "bob", they are taken into the options for Bob. NOTE: I will only explain Bob's portion of the code, because every user related code in this loop is almost identical (the only difference being the name and Player object used).
                while (true) {                  // Entering another "while loop", the user is asked what game they would like to play, and the correct keywords to type to play a game. The user is then able to input an answer, which will be fittingly stored in the variable "answer". This variable will then be compared in If-statements. 
                    System.out.println("What game does Bob want to play? (type Balloon, Wheel, or Bottle)");    
                    answer = input.nextLine().toLowerCase();
                    if (answer.equals("balloon")) {    // If the user has inputted "balloon", the program runs the Player method, "PlayGame". Since the method needs to use other methods from GameBooth, the GameBooth object "balloon" is entered as a parameter. After running the method, the program breaks out of the inner while loop.
                        Bob.PlayGame(balloon);
                        break;
                    } else if (answer.equals("wheel")) {  // If the user has inputted "wheel", the program runs "PlayGame", using the GameBooth object "wheel" in the parameter. The program will then break out of the while loop.
                        Bob.PlayGame(wheel);
                        break;
                    } else if (answer.equals("bottle")) {   // If the user has inputted "bottle", the program runs "PlayGame", using the object "bottle" in the parameter. After the program finishes running "PlayGame", it too will break out of the while loop.
                        Bob.PlayGame(bottle);
                        break;
                    } else {                  // If none of the above options were entered, then you are told that the game you are looking for "doesn't exist", and the loop repeats. 
                        System.out.println("Sorry, that game doesn't exist.");
                    }
                }
            }
            else if (answer.equals("rob")) {
                while (true) {       // If the user has inputted "rob", they are then given the options for Rob, which are almost identical to Bob's.
                    System.out.println("What game does Rob want to play? (type Balloon, Wheel, or Bottle)");
                    answer = input.nextLine().toLowerCase();
                    if (answer.equals("balloon")) {
                        Rob.PlayGame(balloon);
                        break;
                    } else if (answer.equals("wheel")) {
                        Rob.PlayGame(wheel);
                        break;
                    } else if (answer.equals("bottle")) {
                        Rob.PlayGame(bottle);
                        break;
                    } else {
                        System.out.println("Sorry, that game doesn't exist.");
                    }
                }
            } else if (answer.equals("jacob")) {
                while (true) {       // If the user has inputted "jacob", then they are able to play games as him, which are close to identical to Bob's and Rob's. 
                    System.out.println("What game does Jacob want to play? (type Balloon, Wheel, or Bottle)");
                    answer = input.nextLine().toLowerCase();
                    if (answer.equals("balloon")) {
                        Jacob.PlayGame(balloon);
                        break;
                    } else if (answer.equals("wheel")) {
                        Jacob.PlayGame(wheel);
                        break;
                    } else if (answer.equals("bottle")) {
                        Jacob.PlayGame(bottle);
                        break;
                    } else {
                        System.out.println("Sorry, that game doesn't exist.");
                    }
                }
            } else if (answer.equals(name.toLowerCase())) {  
                while (true) {       // Finally, if the user inputted the name of the person they entered, they are able to select options as them. Once again, this is near identical to the above three sections of code.
                    System.out.println("What game does " + user.getName() + " want to play? (type Balloon, Wheel, or Bottle)");
                    answer = input.nextLine().toLowerCase();
                    if (answer.equals("balloon")) {
                        user.PlayGame(balloon);
                        break;
                    } else if (answer.equals("wheel")) {
                        user.PlayGame(wheel);
                        break;
                    } else if (answer.equals("bottle")) {
                        user.PlayGame(bottle);
                        break;
                    } else {
                        System.out.println("Sorry, that game doesn't exist.");
                    }
                }         // If, instead of entering the name of a Player, the user enters "quit", the program then thanks the user for playing, and breaks out of the main while loop (leading to the printed information at the end).
            } else if (answer.equals("quit")) {     
                System.out.println("Thank you for playing! Here is what everybody got:");
                break;
            }
            else {       // Finally, if the user didn't enter the name of one of the Players, or quit, I print that "the player isn't availible", and the loop re-runs itself.
                System.out.println("Sorry, that player isn't availible.");
            } 
        }
        
        
        /*
         * This final section of code only runs once you break out of the while loop. This involves printing all of the final information
         * I use the "toString" and "GivePrize" methods to get and print the required information. "toString" is used to return info on the "Players", while "GivePrize" returns information on prizes in the "GameBooths".
         * "GivePrize()" returns a string, which lists the amount of prizes taken from each booth in total. 
        */
        
        System.out.println("\n" + Bob.toString());
        System.out.println(Rob.toString());
        System.out.println(Jacob.toString());
        System.out.println(user.toString());
        System.out.println("");
        System.out.println(balloon.GivePrize());
        System.out.println(wheel.GivePrize());
        System.out.println(bottle.GivePrize());
    }
    
}
