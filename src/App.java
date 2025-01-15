public class App {
    public static void main(String[] args) throws Exception {
        Display currentStatus = new CurrentStatus();
        Display newStatus = new NewStatus();

        System.out.println("CURRENT STATUS PARKING SLOT");
        currentStatus.currentDisplay();

        for (int i = 1; i <= 3; i++) {
            System.out.println();
        }

        System.out.println("NEW STATUS PARKING SLOT");
        newStatus.newDisplay();
    }
}
