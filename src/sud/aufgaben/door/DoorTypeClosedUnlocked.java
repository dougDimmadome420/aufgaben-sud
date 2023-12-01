package door;

public class DoorTypeClosedUnlocked extends DoorType {
    public DoorState open() throws DoorException {
        return DoorState.OPENUNLOCKED;
    }

    @Override
    public DoorState close() throws DoorException {
        throw new DoorException("The door is already closed.");
    }

    @Override
    public DoorState lock() {
        return DoorState.CLOSEDLOCKED;
    }

    public DoorState unlock() throws DoorException {
        throw new DoorException("The door is already unlocked.");
    }

    public DoorState getDoorState() {
        return DoorState.CLOSEDUNLOCKED;
    }
}
