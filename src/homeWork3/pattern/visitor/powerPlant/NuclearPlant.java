package homeWork3.pattern.visitor.powerPlant;

import homeWork3.pattern.visitor.Visitable;
import homeWork3.pattern.visitor.Visitor;
import homeWork3.pattern.visitor.fuel.Uranium;

public class NuclearPlant implements Visitable {
    @Override
    public void visit(Visitor visitor) {
        visitor.fillUranium(this);
    }

    public void addUranium(Uranium uranium) {
        System.out.println("Uranium added");
    }
}
