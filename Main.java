import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hvor mange spillere skal spille? ");
        GameSession gameSession = new GameSession();
        //Det flot
        Scanner input = new Scanner(System.in);
        int amountOfPlayers = input.nextInt();
        for(int i = 0; i<amountOfPlayers; i++) {
            gameSession.StartGame();
        }
        gameSession.getAllScores();
    }
}