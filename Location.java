import java.util.Scanner;

abstract class Location {
    //Abstract class which inherits all the other locations
    //Writing a Scanner here, which can be used in all the other subclasses
    Scanner input = new Scanner(System.in);

    GameSession gameSession = new GameSession();

    public abstract String getLocationName();//To get the location name
    public void getLocationInformation() //Calling the information for the player to read
    {
        System.out.println("Location Info has not been set");
    }
    public abstract void PrintQuestions(); //Prints the questions to be answered

    //Collecting all the methods one place, so it's easier to be called in the "Game" class
    public void AskQuestion(){
        System.out.println("\nYou chose: " + getLocationName() + "\n");

        getLocationInformation();
        PrintQuestions();
    }

    public void YesQuestion(){
        String answer = input.nextLine();
        if(answer.equals("Ja") || answer.equals("ja")){
            System.out.println("Korrekt!");
        }
        else if(answer.equals("Nej") || answer.equals("nej")){
            System.out.println("Forkert!");
        }
        else{
            System.out.println("Undskyld, men skriv venligst en af svarmulighederne");
            PrintQuestions();
        }
    }
    public void NoQuestion(){
        String answer = input.nextLine();
        if(answer.equals("Ja") || answer.equals("ja")){
            System.out.println("Forkert!");
        }
        else if(answer.equals("Nej") || answer.equals("nej")){
            System.out.println("Korrekt!");
        }
        else{
            System.out.println("Undskyld, men skriv venligst en af svarmulighederne");
            PrintQuestions();
        }
    }

    public void Correct1(){
        String answer = input.nextLine();
        if(answer.equals("1")){
            System.out.println("Korrekt!");
        }
        else if(answer.equals("2") || answer.equals("3")){
            System.out.println("Forkert!");
        }
        else {
            System.out.println("Undskyld, men skriv venligst en af svarmulighederne");
            PrintQuestions();
        }
    }

    public void Correct2(){
        String answer = input.nextLine();
        if(answer.equals("2")){
            System.out.println("Korrekt!");
        }
        else if(answer.equals("1") || answer.equals("3")){
            System.out.println("Forkert!");
        }
        else {
            System.out.println("Undskyld, men skriv venligst en af svarmulighederne");
            PrintQuestions();
        }
    }
    public void Correct3(){
        String answer = input.nextLine();
        if(answer.equals("3")){
            System.out.println("Korrekt!");
        }
        else if(answer.equals("1") || answer.equals("2")){
            System.out.println("Forkert!");
        }
        else {
            System.out.println("Undskyld, men skriv venligst en af svarmulighederne");
            PrintQuestions();
        }
    }
}
