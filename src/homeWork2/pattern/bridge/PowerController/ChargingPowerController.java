package homeWork2.pattern.bridge.PowerController;


import homeWork2.pattern.bridge.battery.AbstractBattery;


public class ChargingPowerController extends PowerController {
    public ChargingPowerController(AbstractBattery battery) {
        super(battery);
    }
    public void charge(){
        if (battery.getChargeLevel()<battery.getCapacity()){
            battery.addCharge();
        }
    }
}
