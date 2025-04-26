public class MotorThread implements Runnable {
    public void run() {
        System.out.println("Motor is rotating...");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {}
    }
}