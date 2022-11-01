import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GameSession {
    //Creating Arraylist to store objects of type Location
    public HashMap<String, Double> allScores = new HashMap<>();
    ArrayList<Location> locations = new ArrayList<>();
    int amountOfLocations;
    //Initialising a Scanner, so we can use the players input
    Scanner playerInput = new Scanner(System.in);
    Player player;
    String name;
    double score = 0;
    static boolean isCorrect = false;

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

        System.out.println("Welcome to World of Skovbrand! Venligst indtast dit navn: ");
        name = playerInput.nextLine();
        System.out.println("Hello " + name + "! Ready to play?");
        player = new Player(name, score);

        amountOfLocations = locations.size();
        for(int i = 0; i < amountOfLocations; i++) {
            ChooseCountry();
            System.out.println(player.score);
        }
        allScores.put(player.name, player.score);
    }
    // Function that prints out all the scores of all the players, in a HashMap.
    public void getAllScores() {
        System.out.println(allScores);
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
                if (isCorrect == true) {
                    player.AddToScore(10);
                    isCorrect = false;
                }
                locations.remove(0);
            }
            case "2" ->{
                locations.get(1).AskQuestion();
                if (isCorrect == true) {
                    player.AddToScore(10);
                    isCorrect = false;
                }
                locations.remove(1);
            }
            case "3" ->{
                locations.get(2).AskQuestion();
                if (isCorrect == true) {
                    player.AddToScore(10);
                    isCorrect = false;
                }
                locations.remove(2);
            }
            case "4" ->{
                locations.get(3).AskQuestion();
                if (isCorrect == true) {
                    player.AddToScore(10);
                    isCorrect = false;
                }
                locations.remove(3);
            }
            case "5" ->{
                locations.get(4).AskQuestion();
                if (isCorrect == true) {
                    player.AddToScore(10);
                    isCorrect = false;
                }
                locations.remove(4);
            }
            case "6" ->{
                locations.get(5).AskQuestion();
                if (isCorrect == true) {
                    player.AddToScore(10);
                    isCorrect = false;
                }
                locations.remove(5);
            }
            case "7" ->{
                locations.get(6).AskQuestion();
                if (isCorrect == true) {
                    player.AddToScore(10);
                    isCorrect = false;
                }
                locations.remove(6);
            }
            default -> {
                System.out.println("Please type a number from the list");
                ChooseCountry();}
        }
       }
       catch (IndexOutOfBoundsException e){
           System.out.println("Sorry try choosing another number");
           ChooseCountry();
       }
    }
}
