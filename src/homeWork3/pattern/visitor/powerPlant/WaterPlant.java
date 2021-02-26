package homeWork3.pattern.visitor.powerPlant;

import homeWork3.pattern.visitor.Visitable;
import homeWork3.pattern.visitor.Visitor;
import homeWork3.pattern.visitor.fuel.Water;

public class WaterPlant implements Visitable {
    @Override
    public void visit(Visitor visitor) {
        visitor.fillWater(this);
    }

    public void addWater(Water water) {
        System.out.println("Water added");
    }
}
