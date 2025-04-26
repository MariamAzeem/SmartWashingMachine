public class WaterPump {
    private Thread p;
    private boolean isPumped = false;

    public void pumpWater() {
        p = new Thread(new PumpThread());
        p.start();
        isPumped = true;
    }

    public void stop() {
        p.interrupt();
        try {
            p.join();
        } catch (InterruptedException e) {
        }
    }

    public void drainWater() {
        if (isPumped) {
            System.out.println("Draining water...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Draining Inturrupted.");
            }
            System.out.println("Draining complete...");
        }
        else{
            System.out.println("No water in machine");
        }
    }
}
