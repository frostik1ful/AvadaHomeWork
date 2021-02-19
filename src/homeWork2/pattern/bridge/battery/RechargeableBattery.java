package homeWork2.pattern.bridge.battery;

public class RechargeableBattery extends AbstractBattery {


    @Override
    public void addCharge() {
        charge++;
    }

    @Override
    public void fastCharge() {
        addCharge();
    }


}
