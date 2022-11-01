public class Timer {
    //Make a timer
    //Make it start and stop, and then retrieve the value
    //Kahoot calculate the value
    //MAKE EVENTS
    //PROBABILITY
    int maxTime = 60;
    int secondsWaited = 0;
    public void StartTimer() throws InterruptedException {
    for (int i = 0; i < maxTime; i++){
        Thread.sleep(1000);
        secondsWaited++;
    }

    }
    public void StopTimer(){

    }
}
