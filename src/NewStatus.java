import java.util.Scanner;

public class NewStatus extends Display {

    @Override
    void newDisplay() {
        Scanner sc = new Scanner(System.in);

        System.out.print("SELECT SLOT: ");
        int opt = sc.nextInt();

        switch (opt) {
            case 1:
                Scanner sc1 = new Scanner(System.in);

                // Array for Available Options
                String[] optList1 = { "Taken Slot", "Empty Slot" };

                // Indication Options
                System.out.println("0: Taken Slot / 1: Empty Slot \n");
                
                // Input Slot
                System.out.print("SLOT 1: ");
                String cmdSlot1 = sc1.nextLine();

                if (cmdSlot1.equals("0")) {
                    // Slot Update
                    setSlot1("1. " + optList1[0]);
                    setSlot2("2. " + optList1[1]);
                    setSlot3("3. " + optList1[1]);
                } else {
                    setSlot1("1. " + optList1[1]);
                    setSlot2("2. " + optList1[1]);
                    setSlot3("3. " + optList1[1]);
                }

                // Print Display Slot
                System.out.println("\nNEW STATUS PARKING SLOT");
                System.out.println("{ " + getSlot1() + "  " + getSlot2() + "  " + getSlot3() + " }");
                break;

            case 2:
                Scanner sc2 = new Scanner(System.in);

                // Array for Available Options
                String[] optList2 = { "Taken Slot", "Empty Slot" };

                // Indication Options
                System.out.println("Options: (0)Taken Slot / (1)Empty Slot\n");

                // Input Slot
                System.out.print("SLOT 2: ");
                String cmdSlot2 = sc2.nextLine();

                if (cmdSlot2.equals("0")) {
                    // Slot Update
                    setSlot1("1. " + optList2[1]);
                    setSlot2("2. " + optList2[0]);
                    setSlot3("3. " + optList2[1]);
                } else {
                    setSlot1("1. " + optList2[1]);
                    setSlot2("2. " + optList2[1]);
                    setSlot3("3. " + optList2[1]);
                }

                // Print Display Slot
                System.out.println("\nNEW STATUS PARKING SLOT");
                System.out.println("{ " + getSlot1() + "  " + getSlot2() + "  " + getSlot3() + " }");
                break;

            case 3:
                Scanner sc3 = new Scanner(System.in);

                // Array for Available Options
                String[] optList3 = { "Taken Slot", "Empty Slot" };

                // Indication Options
                System.out.println("Options: (0)Taken Slot / (1)Empty Slot\n");

                // Input Slot
                System.out.print("SLOT 2: ");
                String cmdSlot3 = sc3.nextLine();

                if (cmdSlot3.equals("0")) {
                    // Slot Update
                    setSlot1("1. " + optList3[1]);
                    setSlot2("2. " + optList3[1]);
                    setSlot3("3. " + optList3[0]);
                } else {
                    setSlot1("1. " + optList3[1]);
                    setSlot2("2. " + optList3[1]);
                    setSlot3("3. " + optList3[1]);
                }

                // Print Display Slot
                System.out.println("\nNEW STATUS PARKING SLOT");
                System.out.println("{ " + getSlot1() + "  " + getSlot2() + "  " + getSlot3() + " }");
                break;
            default:
                break;
        }
    }

    @Override
    void currentDisplay() {
    }
}
