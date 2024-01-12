package door;

import java.util.HashMap;
import java.util.Map;

public class Door {
    private DoorType doorType;
    private Map<DoorState, DoorType> types = new HashMap<>();
    private Key key;

    public Door(DoorState state) {
        types.put(DoorState.OPENUNLOCKED, new DoorTypeOpenUnlocked());
        types.put(DoorState.OPENLOCKED, new DoorTypeOpenLocked());
        types.put(DoorState.CLOSEDUNLOCKED, new DoorTypeClosedUnlocked());
        types.put(DoorState.CLOSEDLOCKED, new DoorTypeClosedLocked());

        this.doorType = types.get(state);
        this.key = new Key();
    }

    public void open() throws DoorException {
        try {
            this.setDoorType(doorType.open());
        } catch (DoorException e) {
            System.out.println(e.getMessage());
        }
    }

    public void close() {
        try {
            this.setDoorType(doorType.close());
        } catch (DoorException e) {
            System.out.println(e.getMessage());
        }
    }

    public void lock(Key key) {
        if (this.getKey().equals(key)) {
            System.out.println("You don't have the key for this door.");
            return;
        }
        try {
            this.setDoorType(doorType.lock());
        } catch (DoorException e) {
            System.out.println(e.getMessage());
        }
    }
 
    public void unlock(Key key) {
        if (this.getKey().equals(key)) {
            System.out.println("You don't have the key for this door.");
            return;
        }
        try {
            this.setDoorType(doorType.unlock());
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

    public Key getKey() {
        return this.key;
    }

    public class Key {}
}
