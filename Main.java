import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("Hvor mange spillere skal spille? ");
        GameSession gameSession = new GameSession();

        Scanner input = new Scanner(System.in);
        int amountOfPlayers = input.nextInt();
        for(int i = 0; i<amountOfPlayers; i++) {
            gameSession.StartGame();
        }
        gameSession.getAllScores(); //viser alle brugeres score
        gameSession.getHighScore(); //viser den højeste score
    }
}
