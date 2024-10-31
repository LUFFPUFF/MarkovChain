package logic.probabilities.ConditionalProbabilitiesOfStationaryDistribution.calculatingprobabilities;

import logic.probabilities.ConditionalProbabilitiesOfStationaryDistribution.JointProbabilitiesOfStationaryDistribution;

import java.util.ArrayList;
import java.util.List;

public class CalculatingConditionalProbabilitiesOfStationaryDistribution {

    public static List<Double> getListProbabilities() {
        return new ArrayList<>(List.of(
                JointProbabilitiesOfStationaryDistribution.Pa_Paa,
                JointProbabilitiesOfStationaryDistribution.Pb_Pab,
                JointProbabilitiesOfStationaryDistribution.Pc_Pac,
                JointProbabilitiesOfStationaryDistribution.Pa_Pba,
                JointProbabilitiesOfStationaryDistribution.Pb_Pbb,
                JointProbabilitiesOfStationaryDistribution.Pc_Pbc,
                JointProbabilitiesOfStationaryDistribution.Pa_Pca,
                JointProbabilitiesOfStationaryDistribution.Pb_Pcb,
                JointProbabilitiesOfStationaryDistribution.Pc_Pcc
        ));
    }
}
