public class CurrentStatus extends Display {

    @Override
    void currentDisplay() {
        setSlot1("1. Empty Slot");
        setSlot2("2. Empty Slot");
        setSlot3("3. Empty Slot");

        System.out.println("{ " + getSlot1() + "  " + getSlot2() + "  " + getSlot3() + " }");
    }

    @Override
    void newDisplay() {}
}
