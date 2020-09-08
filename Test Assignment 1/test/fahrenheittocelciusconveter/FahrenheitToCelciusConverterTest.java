package fahrenheittocelciusconveter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FahrenheitToCelciusConverterTest {

    @Test
    void fahrenheitToCelciusConvert() {
        double fahrenheit = 41;
        double result = FahrenheitToCelciusConverter.FahrenheitToCelciusConvert(fahrenheit);
        double ref = 5;
        assert(result == ref);
    }

    @Test
    void celciusToFahrenheitConvert()
    {
        double celius = 0;
        double result = FahrenheitToCelciusConverter.CelciusToFahrenheitConvert(celius);
        double ref = 32;
        assert (result == ref);
    }
}