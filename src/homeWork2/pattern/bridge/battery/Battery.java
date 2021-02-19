package homeWork2.pattern.bridge.battery;

public class Battery extends AbstractBattery {


    @Override
    public void addCharge() {
        throw new RuntimeException("this battery can't be charged");
    }

    @Override
    public void fastCharge() {
        addCharge();
    }
}
