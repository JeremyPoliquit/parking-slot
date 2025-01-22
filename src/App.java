public class App {
    public static void main(String[] args) throws Exception {
        Display currentStatus = new CurrentStatus();
        Display newStatus = new NewStatus();

        System.out.println("-----WELCOME TO SM PARKING-----");
        System.out.println("CURRENT STATUS PARKING SLOT");
        currentStatus.currentDisplay();

        // Just for spacing
        System.out.println();

        newStatus.newDisplay();
    }
}
