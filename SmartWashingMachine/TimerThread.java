public class TimerThread implements Runnable{
    private int time;

    public TimerThread(int time) {
            this.time = time/1000;
        }

    public void run() {
        try {
            while (time > 0) {
                System.out.println("Time left: " + time + " seconds");
                Thread.sleep(1000);
                time--;
            }
        } catch (InterruptedException e) {
            System.out.println("TImer interrupted.");
        }
    }
}
