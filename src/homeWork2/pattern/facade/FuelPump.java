package homeWork2.pattern.facade;

public class FuelPump {
    public Fuel getFuelFromTank(Energy energy,FuelTank fuelTank){
        return fuelTank.getFuel();
    }
}
