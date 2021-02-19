package homeWork2.pattern.facade;


import java.util.LinkedList;


public class FuelTank {
    private final LinkedList<Fuel> fuels = new LinkedList<>();

    public FuelTank() {
        fuels.add(new Fuel());
    }

    public boolean isEmpty(){
        return fuels.isEmpty();
    }
    public Fuel getFuel(){
        return fuels.pollFirst();
    }
}
