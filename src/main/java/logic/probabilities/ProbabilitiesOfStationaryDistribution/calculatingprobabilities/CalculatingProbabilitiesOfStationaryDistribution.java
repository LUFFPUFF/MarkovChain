package logic.probabilities.ProbabilitiesOfStationaryDistribution.calculatingprobabilities;

import configAndStart.Probabilities;

import java.util.ArrayList;
import java.util.List;

public class CalculatingProbabilitiesOfStationaryDistribution {

    private static Double P_Xi_A;
    private static Double P_Xi_B;
    private static Double P_Xi_C;

    private static final double epsilon = 1e-9;


    public static List<Double> getListProbabilities() {
        calculateStationaryDistribution();
        double P_A = Math.round(P_Xi_A * 1000.0) / 1000.0;
        double P_B = Math.round(P_Xi_B * 1000.0) / 1000.0;
        double P_C = Math.round(P_Xi_C * 1000.0) / 1000.0;
        return new ArrayList<>(List.of(P_A, P_B, P_C));
    }

    private static void calculateStationaryDistribution() {
        initializeProbabilities();
        double delta;

        do {
            double prev_A = P_Xi_A;
            double prev_B = P_Xi_B;
            double prev_C = P_Xi_C;

            P_Xi_A = prev_A * Probabilities.p_aa + prev_B * Probabilities.p_ab + prev_C * Probabilities.p_ac;
            P_Xi_B = prev_A * Probabilities.p_ba + prev_B * Probabilities.p_bb + prev_C * Probabilities.p_bc;
            P_Xi_C = prev_A * Probabilities.p_ca + prev_B * Probabilities.p_cb + prev_C * Probabilities.p_cc;

            normalizeProbabilities();

            delta = Math.abs(P_Xi_A - prev_A) + Math.abs(P_Xi_B - prev_B) + Math.abs(P_Xi_C - prev_C);
        } while (delta > epsilon);
    }

    private static void normalizeProbabilities() {
        double sum = P_Xi_A + P_Xi_B + P_Xi_C;
        P_Xi_A /= sum;
        P_Xi_B /= sum;
        P_Xi_C /= sum;
    }

    private static void initializeProbabilities() {
        P_Xi_A = 1.0 / 3;
        P_Xi_B = 1.0 / 3;
        P_Xi_C = 1.0 / 3;
    }
}
