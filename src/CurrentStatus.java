public class CurrentStatus extends Display {
    Slots slot = new Slots();

    @Override
    void currentDisplay() {
        slot.setSlot1("1. Empty Slot");
        slot.setSlot2("2. Empty Slot");
        slot.setSlot3("3. Empty Slot");

        System.out.println("{ " + slot.getSlot1() + "  " + slot.getSlot2() + "  " + slot.getSlot3() + " }");
    }
}
