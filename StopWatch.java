public class StopWatch {

    public long counter;
    public long countDown = 5;
    long timeStart = 0;
    long timeStop = 0;
    long timeElapsed = 0;
    boolean running = false;


    public long start() {
        this.timeStart = System.currentTimeMillis();
        this.running = true;
        while (running) {
            timeElapsed = ((System.currentTimeMillis() - timeStart) / 1000);
            counter = timeElapsed;
            //System.out.println(counter);
            if (counter >= countDown) {
                stop();
                System.out.println(timeElapsed);
            }
        }
        return timeElapsed;
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

    public void CountDown() {
        if(timeElapsed >= countDown){
            stop();
        }
    }
}