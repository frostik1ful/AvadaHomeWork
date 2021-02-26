package homeWork3.pattern.state;

public class NeutralState extends State{
    public NeutralState(GearBox gearBox) {
        super(gearBox,"NeutralMode");
    }

    @Override
    void setDriveState() {
        gearBox.setState(new DriveState(gearBox));
    }

    @Override
    void setParkingState() {
        gearBox.setState(new ParkingState(gearBox));
    }

    @Override
    void setRearState() {
        gearBox.setState(new RearState(gearBox));
    }

    @Override
    void setNeutralState() {

    }
}
