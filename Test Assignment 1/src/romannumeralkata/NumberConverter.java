package romannumeralkata;

public class NumberConverter {
    public static String arabicNumeralToRoman(int num)
    {
        int[] decimalValue = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanNumeral = {
                "M",
                "CM",
                "D",
                "CD",
                "C",
                "XC",
                "L",
                "XL",
                "X",
                "IX",
                "V",
                "IV",
                "I"
        };

        String romanized = "";

        for (int index = 0; index < decimalValue.length; index++) {
            while (decimalValue[index] <= num) {
                romanized += romanNumeral[index];
                num -= decimalValue[index];
            }
        }

        return romanized;
    }
}
