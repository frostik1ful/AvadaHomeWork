package homeWork2.pattern.bridge.PowerController;

import homeWork2.pattern.bridge.battery.AbstractBattery;


public class PowerController {
    final AbstractBattery battery;

    public PowerController(AbstractBattery battery) {
        this.battery = battery;
    }
    public void takeCharge(){
        if (battery.getChargeLevel()>0){
            battery.takeCharge();
        }
    }

}
