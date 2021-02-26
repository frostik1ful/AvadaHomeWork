package homeWork3.pattern.chain;

public class USDElement extends ExchangeElement{
    public USDElement(ExchangeElement nextElement) {
        super(nextElement);
    }
    public USDElement(){}

    @Override
    public double calculateValue(CurrencyType typeFrom, CurrencyType typeTo, double value) {
        if (typeFrom == CurrencyType.USD){
            return ExchangeData.getValue(typeTo) * value;
        }
        else if (getNextElement() != null){
            return getNextElement().calculateValue(typeFrom,typeTo,value);
        }
        return 0;
    }
}
