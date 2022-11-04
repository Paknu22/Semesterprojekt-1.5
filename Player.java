import java.util.ArrayList;

public class Player {
    String name;
    double score;
    public ArrayList<String> playerInventory = new ArrayList<>();
    public ArrayList<String> gameItems = new ArrayList<>();

    Player(String name, double score){
        this.name = name;
        this.score = score;
        gameItems.add("Genstand 1");
        gameItems.add("Genstand 2");
        gameItems.add("Genstand 3");
        gameItems.add("Genstand 4");
        gameItems.add("Genstand 5");
        gameItems.add("Genstand 6");
        gameItems.add("Genstand 7");
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public void AddToScore(double points){
        score += points;
    }
}
