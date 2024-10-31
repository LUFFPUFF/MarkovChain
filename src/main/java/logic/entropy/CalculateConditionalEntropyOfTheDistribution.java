package logic.entropy;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class CalculateConditionalEntropyOfTheDistribution {

    public static double calculate(List<Double> entropyOfTheDistribution, List<Double> jointEntropyOfTheDistribution) {
        double result = -(CalculateEntropyOfTheDistribution.calculate(entropyOfTheDistribution)
                - CalculateJointEntropyOfTheDistribution.calculate(jointEntropyOfTheDistribution));
        return new BigDecimal(result).setScale(4, RoundingMode.HALF_UP).doubleValue();
    }
}
