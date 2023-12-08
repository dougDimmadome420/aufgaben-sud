package door;

public class DoorTest {
    public static void main(String[] args) throws Exception {
        System.out.println("\n\nTEST OPEN UNLOCKED DOORS\n");
        Door openUnlocked = new Door(DoorState.OPENUNLOCKED);

        DoorTest.testState(openUnlocked, DoorState.OPENUNLOCKED);

        DoorTest.testOpenFail(openUnlocked);
        DoorTest.testUnlockFail(openUnlocked);
        
        DoorTest.testClose(openUnlocked, DoorState.CLOSEDUNLOCKED);
        openUnlocked.setDoorType(DoorState.OPENUNLOCKED);
        DoorTest.testLock(openUnlocked, DoorState.OPENLOCKED);
        
        System.out.println("\n\nTEST OPEN LOCKED DOORS\n");
        Door openLocked = new Door(DoorState.OPENLOCKED);

        DoorTest.testState(openLocked, DoorState.OPENLOCKED);

        DoorTest.testOpenFail(openLocked);
        DoorTest.testCloseFail(openLocked);
        DoorTest.testLockFail(openLocked);

        DoorTest.testUnlock(openLocked, DoorState.OPENUNLOCKED);

        System.out.println("\n\nTEST CLOSED UNLOCKED DOORS\n");
        Door closedUnlocked = new Door(DoorState.CLOSEDUNLOCKED);

        DoorTest.testState(closedUnlocked, DoorState.CLOSEDUNLOCKED);

        DoorTest.testCloseFail(closedUnlocked);
        DoorTest.testUnlockFail(closedUnlocked);

        DoorTest.testOpen(closedUnlocked, DoorState.OPENUNLOCKED);
        closedUnlocked.setDoorType(DoorState.CLOSEDUNLOCKED);
        DoorTest.testLock(closedUnlocked, DoorState.CLOSEDLOCKED);

        System.out.println("\n\nTEST CLOSED LOCKED\n"); 
        Door closedLocked = new Door(DoorState.CLOSEDLOCKED);

        DoorTest.testState(closedLocked, DoorState.CLOSEDLOCKED);

        DoorTest.testOpenFail(closedLocked);
        DoorTest.testCloseFail(closedLocked);
        DoorTest.testLockFail(closedLocked);

        DoorTest.testUnlock(closedLocked, DoorState.CLOSEDUNLOCKED);

        System.out.println("\n\nSUCCESS\n\n");
    }

    private static void testState(Door door, DoorState expected) throws Exception {
        DoorState actualState = door.getDoorType().getDoorState();

        if (actualState != expected) {
            throw new Exception("Door got state " + actualState.toString() + ". Expected: " + expected.toString());
        }
        System.out.println("State is '" + actualState.toString() + "'");
    }

    private static void testOpen(Door door, DoorState newState) throws Exception {
        door.open();

        // State should have changed
        System.out.print("Opening door, ");
        DoorTest.testState(door, newState);
    }

    private static void testOpenFail(Door door) throws Exception {
        DoorState prevState = door.getDoorType().getDoorState();
        System.out.print("Expected fail: ");
        door.open();
        
        // State should remain the same
        DoorTest.testState(door, prevState);
    }

    private static void testClose(Door door, DoorState newState) throws Exception {
        door.close();

        System.out.print("Closing door, ");
        DoorTest.testState(door, newState);
    }

    private static void testCloseFail(Door door) throws Exception {
        DoorState prevState = door.getDoorType().getDoorState();
        System.out.print("Expected fail: ");
        door.close();
        
        // State should remain the same
        DoorTest.testState(door, prevState);
    }

    private static void testLock(Door door, DoorState newState) throws Exception {
        door.lock();

        System.out.print("Locking door, ");
        DoorTest.testState(door, newState);
    }

    private static void testLockFail(Door door) throws Exception {
        DoorState prevState = door.getDoorType().getDoorState();
        System.out.print("Expected fail: ");
        door.lock();

        DoorTest.testState(door, prevState);
    }

    private static void testUnlock(Door door, DoorState newState) throws Exception {
        door.unlock();

        System.out.print("Unlocking door, ");
        DoorTest.testState(door, newState);
    }

    private static void testUnlockFail(Door door) throws Exception {
        DoorState prevState = door.getDoorType().getDoorState();
        System.out.print("Expected fail: ");
        door.unlock();

        DoorTest.testState(door, prevState);
    }
}
