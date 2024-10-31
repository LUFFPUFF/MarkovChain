package logic.entropy.util;

import logic.util.Logarithm;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class AbstractCalculate {

    public static double calculate(List<Double> probabilities) {
        double sum = 0.0;

        for (Double prob : probabilities) {
            sum += prob * Logarithm.log(prob, 2);
        }

        sum = -sum;

        return new BigDecimal(sum).setScale(4, RoundingMode.HALF_UP).doubleValue();
    }
}
