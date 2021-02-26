package homeWork3.pattern.chain;

public class EURElement extends ExchangeElement {
    public EURElement(ExchangeElement nextElement) {
        super(nextElement);
    }
    public EURElement(){}
    @Override
    public double calculateValue(CurrencyType typeFrom, CurrencyType typeTo, double value) {
        if (typeFrom == CurrencyType.EUR){
            return value * ExchangeData.getValue(CurrencyType.EUR) / ExchangeData.getValue(typeTo);
        }
        else if (getNextElement() != null){
            return getNextElement().calculateValue(typeFrom,typeTo,value);
        }
        return 0;
    }
}
