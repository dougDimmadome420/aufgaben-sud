package door;

import java.util.HashMap;
import java.util.Map;

public class Door {
    private DoorType doorType;

    private Map<DoorState, DoorType> types = new HashMap<>();

    public Door(DoorState state) {
        types.put(DoorState.OPENUNLOCKED, new DoorTypeOpenUnlocked());
        types.put(DoorState.OPENLOCKED, new DoorTypeOpenLocked());
        types.put(DoorState.CLOSEDUNLOCKED, new DoorTypeClosedUnlocked());
        types.put(DoorState.CLOSEDLOCKED, new DoorTypeClosedLocked());

        this.doorType = types.get(state);
    }

    public void open() throws DoorException {
        try {
            this.doorType = this.getTypeFromState(doorType.open());
        } catch (DoorException e) {
            System.out.println(e.getMessage());
        }
    }

    public void close() {
        try {
            this.doorType = this.getTypeFromState(doorType.close());
        } catch (DoorException e) {
            System.out.println(e.getMessage());
        }
    }

    public void lock() {
        try {
            this.doorType = this.getTypeFromState(doorType.lock());
        } catch (DoorException e) {
            System.out.println(e.getMessage());
        }
    }
 
    public void unlock() {
        try {
            this.doorType = this.getTypeFromState(doorType.unlock());
        } catch (DoorException e) {
            System.out.println(e.getMessage());
        }
    }

    public DoorType getTypeFromState(DoorState state) {
        return this.types.get(state);
    }

    public DoorType getDoorType() {
        return this.doorType;
    }

    public void setDoorType(DoorState state) {
        this.doorType = types.get(state);
    }
}
