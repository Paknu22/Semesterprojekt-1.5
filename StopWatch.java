public class StopWatch {

    long timeStart = 0;
    long timeStop = 0;
    boolean running = false;


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
        long timeElapsed;
        if (running) {
            timeElapsed = ((System.currentTimeMillis() - timeStart) / 1000);
        } else {
            timeElapsed = ((timeStop - timeStart) / 1000);
        }
        return timeElapsed;
    }
}
