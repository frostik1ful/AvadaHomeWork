package homeWork2.pattern.bridge.battery;

public class FastChargeableBattery extends RechargeableBattery {


    @Override
    public void fastCharge() {
        charge += 2;
    }
}
