public abstract class Appliance {
    protected String brand;
    protected String model;

    public Appliance(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public abstract void start();
}