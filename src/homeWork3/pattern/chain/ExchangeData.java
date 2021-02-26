package homeWork3.pattern.chain;

public class ExchangeData {
    private static final double USDVal = 1;
    private static final double EURVal = 1.22;
    private static final double UAHVal = 0.036;
    private static final double JPYVal = 0.0095;
    public static double getValue(CurrencyType type){
        switch (type){
            case USD: return USDVal;
            case EUR: return EURVal;
            case UAH: return UAHVal;
            case JPY: return JPYVal;
        }
        return 0;
    }
}
