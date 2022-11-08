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
    StopWatch stopWatch = new StopWatch();
    String name;
    double score = 0;
    long timeSpent;
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

        System.out.println("Velkommen til World of Skovbrand! Venligst indtast dit navn: ");
        name = playerInput.nextLine();
        System.out.println("Hej " + name + "! Klar til at spille?");
        player = new Player(name, score);

        amountOfLocations = locations.size();
        for(int i = 0; i < amountOfLocations && !gameOver; i++) {
            ChooseCountry();
            System.out.println("Din score er " + player.score);
            System.out.print("Dine samlede genstande: \n" + player.playerInventory + "\n");
            forestFire();
        }
        gameOver = false;
        allScores.put(player.name, player.score);
    }
    // Function that prints out all the scores of all the players, in a HashMap.
    public void getAllScores() {
        System.out.println("\n" + allScores);
    }

    // Function that prints out the highest score
    public void getHighScore() {
        System.out.println("Den højeste score var: " + Collections.max(allScores.values()));
    }

    // Function that randomly starts a forest fire in the game.
    public void forestFire() {
        if (player.score > 0 && player.playerInventory.size() > 0) {
            Random random = new Random();
            if (random.nextInt(2) == 1) {
                System.out.print("En menneskeskabt er startet et sted i verden. \n" +
                        "Skriv navnet på en af dine genstande som du vil bruge " +
                        "til at slukke skovbranden med.\n");
                Scanner itemInput = new Scanner(System.in);
                String chosenItem = itemInput.nextLine();
                player.playerInventory.remove(chosenItem);
                System.out.print("Den menneskeskabte skovbrand er blevet slukket.\n");
            }
        } else if (player.score > 0) {
            System.out.print("En menneskeskabt skovbrand er startet et sted i verden. \n" +
                    "Du har ingen genstande i din inventar til at slukke skovbranden med, " +
                    "spillet er ovre.\n");
            gameOver = true;
        }
    }

    //Separate method to ask the player what location he wants to go to
    public void ChooseCountry()
    {
        int locationNumber = 0;
        int countLocations = 0;

        System.out.println("Vælg venligt et land: ");
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
            }
            case "2" ->{
                locations.get(1).AskQuestion();
            }
            case "3" ->{
                locations.get(2).AskQuestion();
            }
            case "4" ->{
                locations.get(3).AskQuestion();
            }
            case "5" ->{
                locations.get(4).AskQuestion();
            }
            case "6" ->{
                locations.get(5).AskQuestion();
            }
            case "7" ->{
                locations.get(6).AskQuestion();
            }
            default -> {
                System.out.println("Skriv venlist et nummer fra listen");
                ChooseCountry();}
        }
        locationNumber = Integer.parseInt(answer) - 1;
           if (isCorrect){
               player.playerInventory.add(locations.get(locationNumber).addItem());
               timeSpent = locations.get(locationNumber).getTimePassed();
               player.score += scoreSystem.addPoints(timeSpent, stopWatch.getMaxTime());
               isCorrect = false;
           }
           locations.remove(locationNumber);

       }
       catch (IndexOutOfBoundsException e){
           System.out.println("Vælg venligst et andet nummer");
           ChooseCountry();
       }
    }
}
