public class NewStatus extends Slots {
    public void newDisplay () {
        setSlot1("1. Taken Slot");
        setSlot2("2. Taken Slot");
        setSlot3("3. Taken Slot");
        System.out.println("{ " + getSlot1() + "  " + getSlot2() + "  " + getSlot3() + " }");
    }
}
