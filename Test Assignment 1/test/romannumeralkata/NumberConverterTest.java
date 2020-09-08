package romannumeralkata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberConverterTest {

    @Test
    void arabicNumeralToRoman() {
        int arabicNumber = 55;
        String result = NumberConverter.arabicNumeralToRoman(arabicNumber);
        String ref = "LV";
        assert(result.equals(ref));
    }
}