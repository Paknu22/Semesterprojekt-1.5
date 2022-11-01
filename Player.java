public class Player {
    String name;
    double score;

    Player(String name, double score){
        this.name = name;
        this.score = score;
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
