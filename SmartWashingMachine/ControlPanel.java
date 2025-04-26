import java.util.Scanner;
public class ControlPanel {
    public WashingMachine machine;

    public void controls() {
        Scanner scan = new Scanner(System.in);
        char select = 'b';
        while (select == 'b' || select == 'B') {
        System.out.println("Select an option.");
        System.out.println("1. Select Mode");
        System.out.println("2. Set wash time");
        System.out.println("3. Start machine");
            byte option = scan.nextByte();
            if (option == 1) {
                System.out.println("Select Mode");
                System.out.println("1. Normal Wash");
                System.out.println("2. Quick Wash");
                System.out.println("3. Heavy Wash");
                byte mode = scan.nextByte();
                if (mode == 1) {
                    machine.setMode(new NormalWash());
                } else if (mode == 2) {
                    machine.setMode(new QuickWash());
                } else if (mode == 3) {
                    machine.setMode(new HeavyWash());
                } else {
                    System.out.println("Select correct mode.");
                }
                System.out.println("Mode Set.");
            } else if (option == 2) {
                System.out.println("Set time in seconds (upto 10 sec)");
                int time = scan.nextInt();
                time *= 1000;
                machine.settime(time);

            } else if (option == 3) {
                machine.start();
            } else {
                System.out.println("Select correct option.");
            }
            System.out.println("Press 'B' to go back.");
            select = scan.next().charAt(0);
        }
        scan.close();
    }
}
