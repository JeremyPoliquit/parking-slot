public class CurrentStatus extends Display {

    @Override
    void currentDisplay() {
        // Option List
        String[] optList1 = { "Taken Slot", "Empty Slot" };

        setSlot1("1. " + optList1[1]);
        setSlot2("2. " + optList1[1]);
        setSlot3("3. " + optList1[1]);

        System.out.println("{ " + getSlot1() + "  " + getSlot2() + "  " + getSlot3() + " }");
    }

    @Override
    void newDisplay() {
    }
}
