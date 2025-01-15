public class NewStatus extends Display {

    @Override
    void newDisplay () {
        setSlot1("1. Taken Slot");
        setSlot2("2. Taken Slot");
        setSlot3("3. Taken Slot");
        System.out.println("{ " + getSlot1() + "  " + getSlot2() + "  " + getSlot3() + " }");
    }

    @Override
    void currentDisplay() {
        // Optionally, provide an implementation here or leave this method empty.
        System.out.println("Current display not implemented in NewStatus.");
    }
}
