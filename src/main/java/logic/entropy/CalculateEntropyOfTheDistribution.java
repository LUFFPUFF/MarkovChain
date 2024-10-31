package logic.entropy;

import logic.entropy.util.AbstractCalculate;

import java.util.List;

public class CalculateEntropyOfTheDistribution {

    public static double calculate(List<Double> probabilities) {
        return AbstractCalculate.calculate(probabilities);
    }
}
