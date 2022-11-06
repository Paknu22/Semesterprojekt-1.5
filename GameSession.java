import java.util.*;

public class GameSession {
    //Creating Arraylist to store objects of type Location
    public HashMap<String, Double> allScores = new HashMap<>();
    ArrayList<Location> locations = new ArrayList<>();
    int amountOfLocations;
    //Initialising a Scanner, so we can use the players input
    Scanner playerInput = new Scanner(System.in);
    Player player;
    ScoreSystem scoreSystem = new ScoreSystem();
    String name;
    double score = 0;
    static boolean isCorrect = false;
    static boolean gameOver = false;
    //Using this method to call all the other methods and starting the game in the "Main" class
    public void StartGame()
    {
        //Adding all the locations to the arraylist
        locations.add(new USA());
        locations.add(new Brazil());
        locations.add(new Indonesia());
        locations.add(new Australia());
        locations.add(new Africa());
        locations.add(new Portugal());
        locations.add(new Greece());

        System.out.println("Welcome to World of Forest fires! Please enter your name: ");
        name = playerInput.nextLine();
        System.out.println("Hello " + name + "! Ready to play?");
        player = new Player(name, score);

        amountOfLocations = locations.size();
        for(int i = 0; i < amountOfLocations && !gameOver; i++) {
            ChooseCountry();
            System.out.println("Your score is " + player.score);
            System.out.print("Your items collected: \n" + player.playerInventory + "\n");
            forestFire();
        }
        allScores.put(player.name, player.score);
    }
    // Function that prints out all the scores of all the players, in a HashMap.
    public void getAllScores() {
        System.out.println("\n" + allScores);
    }

    // Function that prints out the highest score
    public void getHighScore() {
        System.out.println("The Highscore is: " + Collections.max(allScores.values()));
    }

    // Function that randomly starts a forest fire in the game.
    public void forestFire() {
        if (player.score > 0 && player.playerInventory.size() > 0) {
            Random random = new Random();
            if (random.nextInt(2) == 1) {
                System.out.print("A man made forest fire has started somewhere in the world. \n" +
                        "Enter the name of one of your items you wish to use to " +
                        "extinguish the forest fire.\n");
                Scanner itemInput = new Scanner(System.in);
                String chosenItem = itemInput.nextLine();
                player.playerInventory.remove(chosenItem);
                System.out.print("The man made forest fire has been extinguished\n");
            }
        } else if (player.score > 0) {
            System.out.print("A man made forest fire has started somewhere in the world. \n" +
                    "You have no items to extinguish the forest fire, the game is over. \n");
            gameOver = true;
        }
    }

    //Separate method to ask the player what location he wants to go to
    public void ChooseCountry()
    {
        int countLocations = 0;

        System.out.println("Please choose a country: ");
        for (Location l: locations)
        {
            countLocations++;
            System.out.print(countLocations + ": ");
            System.out.println(l.getLocationName());
        }

        String answer = playerInput.nextLine();
       try
       {
        switch (answer)
        {
            case "1" ->{
                locations.get(0).AskQuestion();
                if (isCorrect){
                    player.playerInventory.add(locations.get(0).addItem());
                }
                locations.remove(0);
            }
            case "2" ->{
                locations.get(1).AskQuestion();
                if (isCorrect){
                    player.playerInventory.add(locations.get(1).addItem());
                }
                locations.remove(1);
            }
            case "3" ->{
                locations.get(2).AskQuestion();
                if (isCorrect){
                    player.playerInventory.add(locations.get(2).addItem());
                }
                locations.remove(2);
            }
            case "4" ->{
                locations.get(3).AskQuestion();
                if (isCorrect){
                    player.playerInventory.add(locations.get(3).addItem());
                }
                locations.remove(3);
            }
            case "5" ->{
                locations.get(4).AskQuestion();
                if (isCorrect){
                    player.playerInventory.add(locations.get(4).addItem());
                }
                locations.remove(4);
            }
            case "6" ->{
                locations.get(5).AskQuestion();
                if (isCorrect){
                    player.playerInventory.add(locations.get(5).addItem());
                }
                locations.remove(5);
            }
            case "7" ->{
                locations.get(6).AskQuestion();
                if (isCorrect){
                    player.playerInventory.add(locations.get(6).addItem());
                }
                locations.remove(6);
            }
            default -> {
                System.out.println("Please type a number from the list");
                ChooseCountry();}
        }
           if (isCorrect) {
               player.AddToScore(10);
               isCorrect = false;
           }
       }
       catch (IndexOutOfBoundsException e){
           System.out.println("Sorry try choosing another number");
           ChooseCountry();
       }
    }
}
