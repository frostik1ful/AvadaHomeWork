package homeWork3.pattern.chain;

public class UAHElement extends ExchangeElement {
    public UAHElement(ExchangeElement nextElement) {
        super(nextElement);
    }
    public UAHElement(){}
    @Override
    public double calculateValue(CurrencyType typeFrom, CurrencyType typeTo, double value) {
        if (typeFrom == CurrencyType.UAH){
            return value * ExchangeData.getValue(CurrencyType.UAH) / ExchangeData.getValue(typeTo);
        }
        else if (getNextElement() != null){
            return getNextElement().calculateValue(typeFrom,typeTo,value);
        }
        return 0;
    }
}
