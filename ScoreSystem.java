public class ScoreSystem {
    public double score;


    public double getScore() {
        return score;
    }

    public double addPoints(long timeSpent, long maxTime) {
        double points;
        double spentDivMax = (double)timeSpent/(double)maxTime;
        points = (1-(spentDivMax)/2) * 1000;
        return points;
    }
}
