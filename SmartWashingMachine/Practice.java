public class Practice{
    public static void main(String[] args) {
        WashingMachine myMachine = new WashingMachine("LG", "TurboWash360", new Motor(), new WaterPump(), new ControlPanel());
        User user = new User(myMachine);
        user.runMachine();
    }
}