package homeWork3.pattern.chain;

public class JPYElement extends ExchangeElement {
    public JPYElement(ExchangeElement nextElement) {
        super(nextElement);
    }
    public JPYElement(){}
    @Override
    public double calculateValue(CurrencyType typeFrom, CurrencyType typeTo, double value) {
        if (typeFrom == CurrencyType.JPY){
            return value * ExchangeData.getValue(CurrencyType.JPY) / ExchangeData.getValue(typeTo);
        }
        else if (getNextElement() != null){
            return getNextElement().calculateValue(typeFrom,typeTo,value);
        }
        return 0;
    }
}
