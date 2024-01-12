package door;

import door.Door.Key;

public class DoorTest {
    public static void main(String[] args) throws Exception {
        System.out.println("\n\nTEST OPEN UNLOCKED DOORS\n");
        Door openUnlocked = new Door(DoorState.OPENUNLOCKED);
        Key openUnlockedKey = openUnlocked.getKey();

        DoorTest.testState(openUnlocked, DoorState.OPENUNLOCKED);

        DoorTest.testOpenFail(openUnlocked);
        DoorTest.testUnlockFail(openUnlocked, openUnlockedKey);
        
        DoorTest.testClose(openUnlocked, DoorState.CLOSEDUNLOCKED);
        openUnlocked.setDoorType(DoorState.OPENUNLOCKED);
        DoorTest.testLock(openUnlocked, openUnlockedKey, DoorState.OPENLOCKED);
        
        System.out.println("\n\nTEST OPEN LOCKED DOORS\n");
        Door openLocked = new Door(DoorState.OPENLOCKED);
        Key openLockedKey = openUnlocked.getKey();

        DoorTest.testState(openLocked, DoorState.OPENLOCKED);

        DoorTest.testOpenFail(openLocked);
        DoorTest.testCloseFail(openLocked);
        DoorTest.testLockFail(openLocked, openLockedKey);

        DoorTest.testUnlock(openLocked, openLockedKey, DoorState.OPENUNLOCKED);

        System.out.println("\n\nTEST CLOSED UNLOCKED DOORS\n");
        Door closedUnlocked = new Door(DoorState.CLOSEDUNLOCKED);
        Key closedUnlockedKey = openUnlocked.getKey();

        DoorTest.testState(closedUnlocked, DoorState.CLOSEDUNLOCKED);

        DoorTest.testCloseFail(closedUnlocked);
        DoorTest.testUnlockFail(closedUnlocked, closedUnlockedKey);

        DoorTest.testOpen(closedUnlocked, DoorState.OPENUNLOCKED);
        closedUnlocked.setDoorType(DoorState.CLOSEDUNLOCKED);
        DoorTest.testLock(closedUnlocked, closedUnlockedKey, DoorState.CLOSEDLOCKED);

        System.out.println("\n\nTEST CLOSED LOCKED\n"); 
        Door closedLocked = new Door(DoorState.CLOSEDLOCKED);
        Key closedLockedKey = openUnlocked.getKey();

        DoorTest.testState(closedLocked, DoorState.CLOSEDLOCKED);

        DoorTest.testOpenFail(closedLocked);
        DoorTest.testCloseFail(closedLocked);
        DoorTest.testLockFail(closedLocked, closedLockedKey);

        DoorTest.testUnlock(closedLocked, closedLockedKey, DoorState.CLOSEDUNLOCKED);


        Door door1 = new Door(DoorState.OPENUNLOCKED);
        Key key1 = door1.getKey();

        Door door2 = new Door(DoorState.OPENUNLOCKED);

        door2.lock(key1);


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

    private static void testLock(Door door, Key key, DoorState newState) throws Exception {
        door.lock(key);

        System.out.print("Locking door, ");
        DoorTest.testState(door, newState);
    }

    private static void testLockFail(Door door, Key key) throws Exception {
        DoorState prevState = door.getDoorType().getDoorState();
        System.out.print("Expected fail: ");
        door.lock(key);

        DoorTest.testState(door, prevState);
    }

    private static void testUnlock(Door door, Key key, DoorState newState) throws Exception {
        door.unlock(key);

        System.out.print("Unlocking door, ");
        DoorTest.testState(door, newState);
    }

    private static void testUnlockFail(Door door, Key key) throws Exception {
        DoorState prevState = door.getDoorType().getDoorState();
        System.out.print("Expected fail: ");
        door.unlock(key);

        DoorTest.testState(door, prevState);
    }
}
