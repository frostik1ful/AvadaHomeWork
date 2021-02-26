package homeWork3.pattern.visitor;

import homeWork3.pattern.visitor.fuel.Coal;
import homeWork3.pattern.visitor.fuel.Uranium;
import homeWork3.pattern.visitor.fuel.Water;
import homeWork3.pattern.visitor.powerPlant.CoalPlant;
import homeWork3.pattern.visitor.powerPlant.NuclearPlant;
import homeWork3.pattern.visitor.powerPlant.WaterPlant;

public class FuelFiller implements Visitor {

    @Override
    public void fillCoal(CoalPlant plant) {
        plant.addCoal(new Coal());
    }

    @Override
    public void fillWater(WaterPlant plant) {
        plant.addWater(new Water());
    }

    @Override
    public void fillUranium(NuclearPlant plant) {
        plant.addUranium(new Uranium());
    }
}
