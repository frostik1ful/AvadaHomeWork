package homeWork3.pattern.state;

public class DriveState extends State{
    public DriveState(GearBox gearBox) {
        super(gearBox,"DriveMode");
    }

    @Override
    void setDriveState() {

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
        gearBox.setState(new NeutralState(gearBox));
    }
}
