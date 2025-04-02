package entities;

public class CurrencyConverter {
    public static double converter(double dollarCot, double dollarBuyAmount){
        return dollarBuyAmount*dollarCot +  ((dollarCot*dollarBuyAmount)*0.06);
    }

}
