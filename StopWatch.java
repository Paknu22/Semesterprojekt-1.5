public class StopWatch {

    long maxTime = 30; //How much time the player has to answer before it becomes negative
    long timeStart = 0;
    long timeStop = 0;
    long timeElapsed = 0;
    boolean running;


    public void start() {
        this.timeStart = System.currentTimeMillis();
        this.running = true;
    }


    public void stop() {
        this.timeStop = System.currentTimeMillis();
        this.running = false;
    }


    //elapsed time in seconds
    public long getElapsedTime() {
        if (running == true) {
            timeElapsed = ((System.currentTimeMillis() - timeStart) / 1000);
        }
        else {
            timeElapsed = ((timeStop - timeStart) / 1000);
        }
        return timeElapsed;
    }

    public long getMaxTime() {
        return maxTime;
    }
}