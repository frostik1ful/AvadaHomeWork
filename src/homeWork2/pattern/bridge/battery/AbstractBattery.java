package homeWork2.pattern.bridge.battery;

public abstract class AbstractBattery {
    int capacity = 100;
    int charge = capacity;

    public abstract void addCharge();

    public abstract void fastCharge();

    public void takeCharge() {
        charge--;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
        charge = capacity;
    }

    public int getChargeLevel() {
        return charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }

}
