package logic.probabilities.ConditionalProbabilitiesOfStationaryDistribution;

import configAndStart.Probabilities;
import logic.probabilities.ProbabilitiesOfStationaryDistribution.ProbabilitiesOfStationaryDistribution;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class JointProbabilitiesOfStationaryDistribution {

    public static double Pa_Paa = new BigDecimal(ProbabilitiesOfStationaryDistribution.P_A * Probabilities.p_aa)
            .setScale(4, RoundingMode.HALF_UP).doubleValue();
    public static double Pb_Pab = new BigDecimal(ProbabilitiesOfStationaryDistribution.P_B * Probabilities.p_ab)
            .setScale(4, RoundingMode.HALF_UP).doubleValue();
    public static double Pc_Pac = new BigDecimal(ProbabilitiesOfStationaryDistribution.P_C * Probabilities.p_ac)
            .setScale(4, RoundingMode.HALF_UP).doubleValue();

    public static double Pa_Pba = new BigDecimal(ProbabilitiesOfStationaryDistribution.P_A * Probabilities.p_ba)
            .setScale(4, RoundingMode.HALF_UP).doubleValue();
    public static double Pb_Pbb = new BigDecimal(ProbabilitiesOfStationaryDistribution.P_B * Probabilities.p_bb)
            .setScale(4, RoundingMode.HALF_UP).doubleValue();
    public static double Pc_Pbc = new BigDecimal(ProbabilitiesOfStationaryDistribution.P_C * Probabilities.p_bc)
            .setScale(4, RoundingMode.HALF_UP).doubleValue();

    public static double Pa_Pca = new BigDecimal(ProbabilitiesOfStationaryDistribution.P_A * Probabilities.p_ca)
            .setScale(4, RoundingMode.HALF_UP).doubleValue();
    public static double Pb_Pcb = new BigDecimal(ProbabilitiesOfStationaryDistribution.P_B * Probabilities.p_cb)
            .setScale(4, RoundingMode.HALF_UP).doubleValue();
    public static double Pc_Pcc = new BigDecimal(ProbabilitiesOfStationaryDistribution.P_C * Probabilities.p_cc)
            .setScale(4, RoundingMode.HALF_UP).doubleValue();
}
