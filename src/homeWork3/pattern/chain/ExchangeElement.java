package homeWork3.pattern.chain;

public abstract class ExchangeElement{
    ExchangeElement nextElement;


    public ExchangeElement(ExchangeElement nextElement) {
        this.nextElement = nextElement;


    }
    public ExchangeElement() {

    }
    public abstract double calculateValue(CurrencyType typeFrom,CurrencyType typeTo,double value);

    ExchangeElement getNextElement() {
        return nextElement;
    }






}
