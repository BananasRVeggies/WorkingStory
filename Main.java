import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("You are Syelvester Rabbit and you have misplaced your pot o' gold. Do you \n1) Go to find it\n2) Stay here");
        try{
        int userInput = keyboard.nextInt();
        
        if(userInput == 1){
            go();
        } else if (userInput == 2){
            gameOver("You stayed on your couch, got obese, and couldn't move (Re-Execute)");
        }
        
        }catch(InputMismatchException e){
            invalidInput();
        }
        
    }      
    
    public static void gameOver(String deadLine){
        System.out.println(deadLine);
    }
    
    public static void invalidInput(){
        System.out.print("Invalid input. Re-execute");
    }
    
    
    public static void go(){
    	for(int k = 1; k <= 50; k++){
        	System.out.print("-");
        	}
    	System.out.println();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Your adventure has begun, will you go to \n1) The Jeopardous Jungle \n2) The Menacing Mountain\n3) The Partay Palace!");
        int userInput = keyboard.nextInt();
        if(userInput == 1){
            snake();
        } else if (userInput == 2){
            ram();
        }else if (userInput == 3){
            partyChimps();
            
        }else{
            invalidInput();
        }
            
            
        }
    
    public static void pinata(String onethLine){
    	for(int k = 1; k <= 50; k++){
        	System.out.print("-");
        	}
    	System.out.println();
       Scanner keyboard = new Scanner(System.in);
       System.out.println("Three pinatas appear in front of you, they have run out of candy!");
       System.out.println("Will you\n1) Give them your only lollipops\n2)Smash them with a bat");
       int userInput = keyboard.nextInt();
        if(userInput == 1){
            feralChickens("They loved the lollipops and lead you to the castle.");
        } else if (userInput == 2){
            gameOver("They dodged the bat and took it and smacked your bootay so hard you went flying back home! (Re-Execute)");
        } else {
            invalidInput();
        }
        keyboard.nextLine();
    }
    
    public static void partyChimps(){
    	for(int k = 1; k <= 50; k++){
        	System.out.print("-");
        	}
    	System.out.println();
    	Scanner keyboard = new Scanner(System.in);
       System.out.println("Welcome to the Partay Palace!");//SUCH FUN MANY WOW
       System.out.println("Two chimpanzees walk up to you with their heads down beecause they lost their party hats");
       System.out.println("Will you\n1) Help them search for their hat\n2) Ignore them");
       int userInput = keyboard.nextInt();
        if(userInput == 1){
            pinata("They were grateful that you got their hats back and let you pass");
        } else if (userInput == 2){
            gameOver("They bit your toe so you ran back home! (Re-Execute)");
        } else {
            invalidInput();
        }
        keyboard.nextLine();
    }
    
    public static void wizard(){
    	for(int k = 1; k <= 50; k++){
        	System.out.print("-");
        	}
    	System.out.println();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("You encounter three wizards Waggles, Tom, and Brute. They want you to collect them a plant called the Bootay Botania");
        System.out.println("Will you \n1) Get them the Bootay Botania\n2) Attack");
        int userInput = keyboard.nextInt();
        if(userInput == 1){
            feralChickens("They loved the Bootay Botania, and lead you to the castle.");
        } else if (userInput == 2){
            gameOver("Tom turned you to a toad! (Re-Execute)");
        } else {
            invalidInput();
        }
        keyboard.nextLine();
    } 
    public static void wizard(String firstLine){
    	for(int k = 1; k <= 50; k++){
        	System.out.print("-");
        	}
    	System.out.println();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("You encounter three wizards Waggles, Tom, and Brute. They want you to collect them a plant called the Bootay Botania");
        System.out.println("Will you \n1) Get them the Bootay Botania\n2) Attack");
        int userInput = keyboard.nextInt();
        if(userInput == 1){
            feralChickens("They loved the Bootay Botania, and lead you to the castle.");
        } else if (userInput == 2){
            gameOver("Tom turned you to a toad! (Re-Execute)");
        } else {
            invalidInput();
        }
        keyboard.nextLine();
    } 
    public static void ram(){
    	for(int k = 1; k <= 50; k++){
        	System.out.print("-");
        	}
    	System.out.println();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("You have entered the Menacing Mountain!");//SOOPER SPOOPY
        System.out.println("On your way up the mountain you encounter horned sheep\nthey are overheating and want you to cut their wool");
        System.out.println("Will you\n1)Cut their wool\n2)Smack 'em");
        int userInput = keyboard.nextInt();
        if(userInput == 1){
            yeti("They loved the wool cut, and let you pass.");
        } else if (userInput == 2){
            gameOver("They rammed you back to your house and you landed in a pond! (Re-Execute)");
        } else {
            invalidInput();
        }
        keyboard.nextLine();
    }
    
    public static void yeti(String onethLine){
    	for(int k = 1; k <= 50; k++){
        	System.out.print("-");
        	}
    	System.out.println();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("You are at the snowy part of the mountain, a yeti sneaks up on you.\n it asks for some meat");
        System.out.println("Will you\n1) Give him meat\n2)Attack him ");
        int userInput = keyboard.nextInt();
        if(userInput == 1){
            wizard("He loved the meat, and decided to let you pass.");
        } else if (userInput == 2){
            gameOver("He threw you back to your house! (Re-Execute)");
        } else {
            invalidInput();
        }
        keyboard.nextLine();
    }
    
    public static void monkey(String onethLine){
    	for(int k = 1; k <= 50; k++){
        	System.out.print("-");
        	}
    	System.out.println();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("There are talking monkeys flying on banana planes, they want a toy to play with");
        System.out.println("Will you \n1) Give them your beach ball \n2) Attack?");
        int userInput = keyboard.nextInt();
        if(userInput == 1){
            feralChickens("They loved the beach ball, and decided to lead you to the castle.");
        } else if (userInput == 2){
            gameOver("They threw banana peels at you, and you slipped and got a concussion! (Re-Execute)");
        } else {
            invalidInput();
        }
        keyboard.nextLine();
    }
    
    public static void snake(){
    	for(int k = 1; k <= 50; k++){
    	System.out.print("-");
    	}
    	System.out.println();
    	Scanner keyboard = new Scanner(System.in);
        System.out.println("You are now in The Jeopardous Jungle!");
        System.out.println("There are snakes blocking your path they require food");
        System.out.println("Will you \n1) Give them your grapes \n2) Poke them with a stick");
        int userInput = keyboard.nextInt();
        if(userInput == 1){
            parrot("They loved the grapes, and decided to let you pass.");
        } else if (userInput == 2){
            gameOver("They chased you back to your house! (Re-Execute)");
        } else {
            invalidInput();
        }
        keyboard.nextLine();
    }
    
    public static void parrot(String newLine){
    	for(int k = 1; k <= 50; k++){
        	System.out.print("-");
        	}
    	System.out.println();
         Scanner keyboard = new Scanner(System.in);
        System.out.println("Parrots swoop down and take your hat, if you want it back you have to give them crackers");
        System.out.println("Will you \n1) Give them your crackers \n2) Try to take your hat back with force");
        int userInput = keyboard.nextInt();
        if(userInput == 1){
            monkey("They loved the crackers, and decided to let you pass.");
        } else if (userInput == 2){
            gameOver("They pooped on you then flew away with your hat! (Re-Execute)");
        } else {
            invalidInput();
        }
        keyboard.nextLine();
    }
    
    public static void feralChickens(String firstLine){
    	for(int k = 1; k <= 50; k++){
        	System.out.print("-");
        	}
    	System.out.println();
        Scanner keyboard = new Scanner(System.in);
        System.out.println(firstLine);
        System.out.println("At the gate of the castle there are a bunch of feral chickens");
        System.out.println("Will you \n1) Give them all of your corn \n2) Attack");
        int userinput = keyboard.nextInt();
        if(userinput == 1){
            end();
        } else if (userinput == 2){
            gameOver("The chickens were so hungry they ate all your corn and your sandwich so you had to head back to your house to get a new one (Re-Execute)");
        } else {
            invalidInput();
        }
        keyboard.nextLine();
    }
    public static void end(){
    	for(int k = 1; k <= 50; k++){
        	System.out.print("-");
        	}
    	System.out.println();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("You have found your pot of gold. To get it you must sell your happiness for it.");
        System.out.println("Will you \n1) Leave the gold \n2) Sell your happiness?");
        int userinput = keyboard.nextInt();
        if(userinput == 1){
            System.out.println("You left the gold and realized happiness is worth more than gold");
        } else if (userinput == 2){
            System.out.println("You sold your happiness and realized happiness is worth more than gold");
        } else {
            invalidInput();
        }
        keyboard.nextLine();
    }
    
    
    }









































