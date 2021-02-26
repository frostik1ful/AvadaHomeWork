package homeWork3.pattern.state;

public class GearBox {
    private State state;

    public GearBox(){
        setState(new ParkingState(this));
    }

    public void setDriveMode() {
        state.setDriveState();
    }
    public void setParkingMode() {
        state.setParkingState();
    }
    public void setRearMode() {
        state.setRearState();
    }
    public void setNeutralMode() {
        state.setNeutralState();
    }

    public void setState(State state) {
        this.state = state;
        System.out.println("GearBox now in "+state.getName());
    }
}
