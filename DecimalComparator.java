import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;


public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2){
        BigDecimal number11 = new BigDecimal(number1, MathContext.DECIMAL64);
        BigDecimal number22 = new BigDecimal(number2, MathContext.DECIMAL64);
        System.out.println("before - " + number11);
        System.out.println("before - " + number22);
        number11 = number11.setScale(3, RoundingMode.DOWN);
        number22 = number22.setScale(3, RoundingMode.DOWN);
        System.out.println(number11);
        System.out.println(number22);

        int x = number11.compareTo(number22);

        if (x == 0)
            return true;

            else return false;
        // return true;
    }

}
