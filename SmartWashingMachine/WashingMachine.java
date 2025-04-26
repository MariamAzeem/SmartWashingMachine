public class WashingMachine extends Appliance {
    private Motor motor;
    private WaterPump pump;
    private WashMode mode = new NormalWash();
    private int washTime = 3000;
    public ControlPanel panel;

    public WashingMachine(String brand, String model, Motor motor, WaterPump pump, ControlPanel panel) {
        super(brand, model);
        this.motor = motor;
        this.pump = pump;
        panel.machine = this;
        this.panel = panel;
    }

    public void setMode(WashMode mode) {
        this.mode = mode;
    }

    public void settime(int washTime) {
        this.washTime = washTime;
    }

    public void start() {
        System.out.println("Washing Machine Starting...");
        mode.activate();
        washing(washTime);
        rinsing();
        drying();
        System.out.println("All the cycles are completed.");
    }

    private void washing(int time) {
        System.out.println("Washing started...");
        motor.rotate();
        pump.pumpWater();
        Thread timer = new Thread(new TimerThread(time));
        timer.start();
        Thread mixing = new Thread(new DetergentThread());
        mixing.start();
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            System.out.println("Washing Inturrupted.");
        }
        motor.stop();
        pump.stop();
        System.out.println("Washing completed.");
        pump.drainWater();
    }

    private void rinsing() {
        System.out.println("Rinsing started...");
        motor.rotate();
        pump.pumpWater();
        Thread timer = new Thread(new TimerThread(3000));
        timer.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Washing Inturrupted.");
        }
        motor.stop();
        pump.stop();
        System.out.println("Rinsing completed.");
        pump.drainWater();
    }

    private void drying() {
        System.out.println("Drying started...");
        motor.rotate();
        Thread timer = new Thread(new TimerThread(3000));
        timer.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Washing Inturrupted.");
        }
        motor.stop();
        System.out.println("Drying completed.");
    }
}