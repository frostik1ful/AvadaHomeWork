package homeWork2.pattern.bridge.PowerController;

import homeWork2.pattern.bridge.battery.AbstractBattery;


public class FastChargingPowerController extends ChargingPowerController {
    public FastChargingPowerController(AbstractBattery battery) {
        super(battery);
    }
    public void fastCharge(){
        if (battery.getChargeLevel()+2 <= battery.getCapacity()){
            battery.fastCharge();
        }
    }
}
