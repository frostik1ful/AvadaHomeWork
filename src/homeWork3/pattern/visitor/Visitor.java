package homeWork3.pattern.visitor;

import homeWork3.pattern.visitor.powerPlant.CoalPlant;
import homeWork3.pattern.visitor.powerPlant.NuclearPlant;
import homeWork3.pattern.visitor.powerPlant.WaterPlant;

public interface Visitor {
    void fillCoal(CoalPlant plant);
    void fillWater(WaterPlant plant);
    void fillUranium(NuclearPlant plant);
}
