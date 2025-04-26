public class User {
    private WashingMachine machine;

    public User(WashingMachine machine) {
        this.machine = machine;
    }

    public void runMachine() {
        machine.panel.controls();
    }
}
