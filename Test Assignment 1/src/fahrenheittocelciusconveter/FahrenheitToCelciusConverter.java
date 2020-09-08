package fahrenheittocelciusconveter;

public class FahrenheitToCelciusConverter {

    private static final int CONSTANT =32;

    public static double FahrenheitToCelciusConvert(double fahrenheit)
    {
        double res = fahrenheit - CONSTANT;
        res = res *5/9;
        return res;
    }

    public static double CelciusToFahrenheitConvert(double celcius)
    {
        double res = celcius * 9/5;
        res = res + CONSTANT;
        return res;
    }

}
