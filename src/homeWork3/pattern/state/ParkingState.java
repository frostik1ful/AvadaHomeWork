package homeWork3.pattern.state;

public class ParkingState extends State{
    public ParkingState(GearBox gearBox) {
        super(gearBox,"ParkingMode");
    }

    @Override
    void setDriveState() {
        gearBox.setState(new DriveState(gearBox));
    }

    @Override
    void setParkingState() {

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
