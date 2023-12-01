package door;

public class DoorTypeOpenUnlocked extends DoorType {
    public DoorState open() throws DoorException {
        throw new DoorException("The door is already open.");
    }

    public DoorState close() {
        return DoorState.CLOSEDUNLOCKED;
    }

    public DoorState lock() {
        return DoorState.OPENLOCKED;
    }

    public DoorState unlock() throws DoorException {
        throw new DoorException("The door is already unlocked.");
    }

    public DoorState getDoorState() {
        return DoorState.OPENUNLOCKED;
    }
}
