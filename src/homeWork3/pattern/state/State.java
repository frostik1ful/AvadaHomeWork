package homeWork3.pattern.state;

public abstract class State {
    final GearBox gearBox;
    private final String name;

    public State(GearBox gearBox, String name) {
        this.gearBox = gearBox;
        this.name = name;
    }

    public String getName() {
        return name;
    }


    abstract void setDriveState();

    abstract void setParkingState();

    abstract void setRearState();

    abstract void setNeutralState();
}
