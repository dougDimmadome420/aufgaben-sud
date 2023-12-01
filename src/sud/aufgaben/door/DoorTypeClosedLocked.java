package door;

public class DoorTypeClosedLocked extends DoorType {
    public DoorState open() throws DoorException {
        throw new DoorException("The door is closed and locked.");
    }

    public DoorState close() throws DoorException {
        throw new DoorException("The door is already closed.");
    }

    public DoorState lock() throws DoorException {
        throw new DoorException("The door is already and locked.");
    }

    public DoorState unlock() {
        return DoorState.CLOSEDUNLOCKED;
    }

    public DoorState getDoorState() {
        return DoorState.CLOSEDLOCKED;
    }
}
