package door;

public class DoorTest {
    public static void main(String[] args) throws Exception {
        // TEST OPEN UNLOCKED DOORS
        Door openUnlocked = new Door(DoorState.OPENUNLOCKED);

        DoorTest.testState(openUnlocked, DoorState.OPENUNLOCKED);

        DoorTest.testOpenFail(openUnlocked);
        DoorTest.testUnlockFail(openUnlocked);
        
        DoorTest.testClose(openUnlocked, DoorState.CLOSEDUNLOCKED);
        openUnlocked.setDoorType(DoorState.OPENUNLOCKED);
        DoorTest.testLock(openUnlocked, DoorState.OPENLOCKED);
        
        // TEST OPEN LOCKED DOORS
        Door openLocked = new Door(DoorState.OPENLOCKED);

        DoorTest.testState(openLocked, DoorState.OPENLOCKED);

        DoorTest.testOpenFail(openLocked);
        DoorTest.testCloseFail(openLocked);
        DoorTest.testLockFail(openLocked);

        DoorTest.testUnlock(openLocked, DoorState.OPENUNLOCKED);

        // TEST CLOSED UNLOCKED DOORS
        Door closedUnlocked = new Door(DoorState.CLOSEDUNLOCKED);

        DoorTest.testState(closedUnlocked, DoorState.CLOSEDUNLOCKED);

        DoorTest.testCloseFail(closedUnlocked);
        DoorTest.testUnlockFail(closedUnlocked);

        DoorTest.testOpen(closedUnlocked, DoorState.OPENUNLOCKED);
        closedUnlocked.setDoorType(DoorState.CLOSEDUNLOCKED);
        DoorTest.testLock(closedUnlocked, DoorState.CLOSEDLOCKED);

        // TEST CLOSED LOCKED 
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
    }

    private static void testOpen(Door door, DoorState newState) throws Exception {
        door.open();

        // State should have changed
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

        DoorTest.testState(door, newState);
    }

    private static void testUnlockFail(Door door) throws Exception {
        DoorState prevState = door.getDoorType().getDoorState();
        System.out.print("Expected fail: ");
        door.unlock();

        DoorTest.testState(door, prevState);
    }
}
