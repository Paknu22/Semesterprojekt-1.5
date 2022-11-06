public class ScoreSystem {
    public double score;


    public double getScore() {
        return score;
    }

    // Denne funktion virker ikke.
    public double addPoints(long timeSpent, long maxTime) {
        double points;
        points = (1-(timeSpent/maxTime)/2)*1000;
        return points;
    }
}
