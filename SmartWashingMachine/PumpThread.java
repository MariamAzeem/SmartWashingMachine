public class PumpThread implements Runnable {
    public void run() {
        System.out.println("Pump is pumping water...");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {}
    }
}