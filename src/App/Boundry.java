package App;

import java.util.Scanner;

public class Boundry {

    Scanner scan = new Scanner(System.in);

    /**
     * Takes the parameter currentRoom and return the direction as a String, if
     * the direction is possible, else try again.
     *
     * @param currentRoom
     * @return String choice
     */
    /**
     *
     * Creates a player name
     *
     * @return String with name
     */
    public String createName() {

        boolean donePickingName = false;
        String inputName = "";

        while (donePickingName == false) {
            System.out.println("\nWHAT IS YOUR NAME?");
            System.out.print("NAME: ");
            inputName = scan.next();

            System.out.println("You chose " + "'" + inputName + "'" + " as your name.\n");
            System.out.println("Hello " + inputName + "!");
            System.out.println("This will be your name through the whole game, do you want to keep it?\n"
                    + "YES/NO");
            System.out.print("ACTION: ");

            String actionInput;
            actionInput = scan.next().substring(0, 1);

            if (actionInput.equalsIgnoreCase("n")) {
                donePickingName = false;
            }
            if (actionInput.equalsIgnoreCase("y")) {
                System.out.println("\nYou chose to keep your name");
                donePickingName = true;
            } else {
                System.out.println("\n'" + actionInput + "'" + " is not a valid option... Try again.");
            }

        }
        return inputName;
    }

    /**
     * Welcoming to game statement.
     */
    public void welcomeToGame() {
        System.out.println("     _____                                    _____                             _               \n"
                + "    / ____|                                  / ____|                           | |              \n"
                + "   | (___    _ __     __ _    ___    ___    | |       _ __    __ _  __      __ | |   ___   _ __ \n"
                + "    \\___ \\  | '_ \\   / _` |  / __|  / _ \\   | |      | '__|  / _` | \\ \\ /\\ / / | |  / _ \\ | '__|\n"
                + "    ____) | | |_) | | (_| | | (__  |  __/   | |____  | |    | (_| |  \\ V  V /  | | |  __/ | |   \n"
                + "   |_____/  | .__/   \\__,_|  \\___|  \\___|    \\_____| |_|     \\__,_|   \\_/\\_/   |_|  \\___| |_|   \n"
                + "            | |  \t  BECAUSE SPACE INVADERS WERE ALREADY TAKEN                                                                               \n"
                + "            |_| \n\n");
        
        System.out.println("=== WELCOME ===\n");
        System.out.println("Welcome to Space Crawler!");
        System.out.println("Space Crawler is a text-based Dungeon-Crawler where the main objective of the game is to reach the command bridge.");
        System.out.println("You interact with the game by 'USER INPUT':\n - E.G: Write 'HELP' to recieve a list of commands.");
        
        System.out.println("\n=== GAME : RUNNING ===");
    }
    

    public String takeGold() {
        String choice = "";
        System.out.println("\nDo you wish to pick up the gold ?");
        System.out.println("YES/NO");
        choice = scan.next();
        return choice;
    }

    public String chooseAction() {
        String action = "";
        System.out.println("Choose your action: ");
        action = scan.next().toLowerCase();
        return action;
    }

    public void helpCommand() {
        System.out.println("\n=== HELP ===");
        System.out.println("- Inspect");
        System.out.println("- Search");
        System.out.println("- Bank");
        System.out.println("- Help");
        System.out.println("- Exit");
        System.out.println("- North / South / East / West");
        System.out.println("- Yes / No");
        System.out.println("Pay");
        System.out.println("deny");
    }
    
    public void taxCollectorMeeting(){
        
       System.out.println("The door close behind you.");
        System.out.println("A big robot in a dark coat stands in your way");
        System.out.println("He is the \"TAXCOLLETOR\" and he is here to collect your money");
        System.out.println("You must pay his price to exit the room");
        System.out.println("You must pay me, 20 dollars");
        
        
       
    }
}
