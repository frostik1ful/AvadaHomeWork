package homeWork3.pattern.state;

public class RearState extends State{
    public RearState(GearBox gearBox) {
        super(gearBox,"RearMode");
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

    }

    @Override
    void setNeutralState() {
        gearBox.setState(new NeutralState(gearBox));
    }
}
