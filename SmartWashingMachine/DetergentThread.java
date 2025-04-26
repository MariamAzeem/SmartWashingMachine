public class DetergentThread implements Runnable {
    public void run() {
        try {
            System.out.println("Adding detergent...");
            Thread.sleep(1000); // simulate time for mixing
            System.out.println("Detergent mixed properly.");
        } catch (InterruptedException e) {
            System.out.println("Detergent mixing interrupted.");
        }
    }
}