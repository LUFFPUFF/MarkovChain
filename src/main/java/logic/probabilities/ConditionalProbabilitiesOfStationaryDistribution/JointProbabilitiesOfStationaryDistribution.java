package logic.probabilities.ConditionalProbabilitiesOfStationaryDistribution;

import configAndStart.Probabilities;
import logic.probabilities.ProbabilitiesOfStationaryDistribution.ProbabilitiesOfStationaryDistribution;

public class JointProbabilitiesOfStationaryDistribution {

    public static double Pa_Paa = ProbabilitiesOfStationaryDistribution.P_A * Probabilities.p_aa;
    public static double Pb_Pab = ProbabilitiesOfStationaryDistribution.P_B * Probabilities.p_ab;
    public static double Pc_Pac = ProbabilitiesOfStationaryDistribution.P_C * Probabilities.p_ac;

    public static double Pa_Pba = ProbabilitiesOfStationaryDistribution.P_A * Probabilities.p_ba;
    public static double Pb_Pbb = ProbabilitiesOfStationaryDistribution.P_B * Probabilities.p_bb;
    public static double Pc_Pbc = ProbabilitiesOfStationaryDistribution.P_C * Probabilities.p_bc;

    public static double Pa_Pca = ProbabilitiesOfStationaryDistribution.P_A * Probabilities.p_ca;
    public static double Pb_Pcb = ProbabilitiesOfStationaryDistribution.P_B * Probabilities.p_cb;
    public static double Pc_Pcc = ProbabilitiesOfStationaryDistribution.P_C * Probabilities.p_cc;
}
