package door;

enum DoorState {
    OPENUNLOCKED, CLOSEDUNLOCKED, OPENLOCKED, CLOSEDLOCKED
};

public abstract class DoorType {
    public abstract DoorState open() throws DoorException;
    public abstract DoorState close() throws DoorException;
    public abstract DoorState lock() throws DoorException;
    public abstract DoorState unlock() throws DoorException;

    public abstract DoorState getDoorState();
}
