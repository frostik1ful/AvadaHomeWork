package homeWork3.pattern.visitor.powerPlant;

import homeWork3.pattern.visitor.Visitable;
import homeWork3.pattern.visitor.Visitor;
import homeWork3.pattern.visitor.fuel.Coal;

public class CoalPlant implements Visitable {
    @Override
    public void visit(Visitor visitor) {
        visitor.fillCoal(this);
    }

    public void addCoal(Coal coal) {
        System.out.println("Coal added");
    }
}
