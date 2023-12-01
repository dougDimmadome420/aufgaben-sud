package door;

public class DoorTypeOpenLocked extends DoorType {
    public DoorState open() throws DoorException {
        throw new DoorException("The door is already open.");
    }

    public DoorState close() throws DoorException {
        throw new DoorException("The door is locked and cannot be closed.");
    }

    public DoorState lock() throws DoorException {
        throw new DoorException("The door is already locked.");
    }

    public DoorState unlock() {
        return DoorState.OPENUNLOCKED;
    }

    public DoorState getDoorState() {
        return DoorState.OPENLOCKED;
    }
}
