package homeWork3.pattern.interpreter;

public class Number implements Expression{
    private int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return number;
    }
}