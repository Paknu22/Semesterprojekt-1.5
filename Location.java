import java.util.Scanner;

abstract class Location {
    //Abstract class which inherits all the other locations
    //Writing a Scanner here, which can be used in all the other subclasses
    Scanner input = new Scanner(System.in);
    Scanner enterKey = new Scanner(System.in);
    StopWatch stopWatch = new StopWatch();
    GameSession gameSession = new GameSession();

    public long timePassed;

    public double points;

    public abstract String countryLocation1();
    public abstract String countryLocation2();
    public abstract String getLocationName();//To get the location name
    public abstract String getLocationInformation(); //Calling the information for the player to read
    public abstract String getLocationInformation2(); //Calling the information for the player to read

    public abstract void PrintQuestions(); //Prints the questions to be answered
    public abstract void PrintQuestions2(); //Prints the questions to be answered

    //Collecting all the methods one place, so it's easier to be called in the "Game" class
    public void AskQuestion() {
        System.out.println("\nYou chose: " + getLocationName());
        Scanner choice = new Scanner(System.in);
        System.out.println(getLocationInformation());
        System.out.print("Tryk 'Enter' for at få spørgsmålet");
        String waitingForEnter = enterKey.nextLine();
        stopWatch.start();
        PrintQuestions();
        if (gameSession.isCorrect == true) {
            timePassed = stopWatch.getElapsedTime();
        }
    }
    
    public abstract String addItem();

    public void YesQuestion(){
        String answer = input.nextLine();
        if(answer.equals("Ja") || answer.equals("ja")){
            System.out.println("Korrekt!");
            gameSession.isCorrect = true;
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
            gameSession.isCorrect = true;
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
            gameSession.isCorrect = true;
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
            gameSession.isCorrect = true;
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
            gameSession.isCorrect = true;
        }
        else if(answer.equals("1") || answer.equals("2")){
            System.out.println("Forkert!");
        }
        else {
            System.out.println("Undskyld, men skriv venligst en af svarmulighederne");
            PrintQuestions();
        }
    }

    public long getTimePassed() {
        return timePassed;
    }
}
