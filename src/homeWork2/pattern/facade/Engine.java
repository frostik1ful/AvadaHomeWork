package homeWork2.pattern.facade;

public class Engine {
    private Fuel fuel;
    public void addFuel(Fuel fuel){
        this.fuel = fuel;
    }
    public void start(){
        fuel = null;
        System.out.println("engine started");
    }
}
