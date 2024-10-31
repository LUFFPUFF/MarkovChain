package logic.stringcontent;

import configAndStart.Probabilities;
import logic.entropy.CalculateConditionalEntropyOfTheDistribution;
import logic.entropy.CalculateEntropyOfTheDistribution;
import logic.entropy.CalculateJointEntropyOfTheDistribution;
import logic.formulas.Formulas;
import logic.probabilities.ConditionalProbabilitiesOfStationaryDistribution.JointProbabilitiesOfStationaryDistribution;
import logic.probabilities.ConditionalProbabilitiesOfStationaryDistribution.calculatingprobabilities.CalculatingConditionalProbabilitiesOfStationaryDistribution;
import logic.probabilities.ProbabilitiesOfStationaryDistribution.ProbabilitiesOfStationaryDistribution;
import logic.probabilities.ProbabilitiesOfStationaryDistribution.calculatingprobabilities.CalculatingProbabilitiesOfStationaryDistribution;

import java.util.List;

public class StringContent {

    private static final List<Double> entropyOfTheDistribution = CalculatingProbabilitiesOfStationaryDistribution.getListProbabilities();
    private static final List<Double> jointEntropyOfTheDistribution = CalculatingConditionalProbabilitiesOfStationaryDistribution.getListProbabilities();

    public static String getContent() {
        return "Данные вероятности:\n" +
                probabilitiesContent() +
                "\n\nВычисление вероятностей стационарного распределения: \n" +
                Formulas.formulasPxi_A + "\n" + Formulas.formulasPxi_B + "\n" + Formulas.formulasPxi_C +
                "\nСистема вычисленных вероятностей:\n" + Formulas.systemFormulasA_B_C +
                "\n----------" +
                "\nPa = " + ProbabilitiesOfStationaryDistribution.P_A + "\nPb = " + ProbabilitiesOfStationaryDistribution.P_B + "\nPc = " + ProbabilitiesOfStationaryDistribution.P_C +
                "\n\nВычисление энтропии распределения: \n" + Formulas.formulasHXi + " = " + Formulas.formulasHXiValues +
                "\n" + entropyOfTheDistributionContent() +
                "\n\nВычисление условных вероятностей: \n" +
                Formulas.formulasPa_Paa + " = " + JointProbabilitiesOfStationaryDistribution.Pa_Paa + "\n" +
                Formulas.formulasPb_Pab + " = " + JointProbabilitiesOfStationaryDistribution.Pb_Pab + "\n" +
                Formulas.formulasPc_Pac + " = " + JointProbabilitiesOfStationaryDistribution.Pc_Pac + "\n" +
                Formulas.formulasPa_Pba + " = " + JointProbabilitiesOfStationaryDistribution.Pa_Pba + "\n" +
                Formulas.formulasPb_Pbb + " = " + JointProbabilitiesOfStationaryDistribution.Pb_Pbb + "\n" +
                Formulas.formulasPc_Pbc + " = " + JointProbabilitiesOfStationaryDistribution.Pc_Pbc + "\n" +
                Formulas.formulasPa_Pca + " = " + JointProbabilitiesOfStationaryDistribution.Pa_Pca + "\n" +
                Formulas.formulasPb_Pcb + " = " + JointProbabilitiesOfStationaryDistribution.Pb_Pcb + "\n" +
                Formulas.formulasPc_Pcc + " = " + JointProbabilitiesOfStationaryDistribution.Pc_Pcc +
                "\nВычисление совместной энтропии: \n" +
                Formulas.formulasH_Xi_Xi_1 + "\n" + Formulas.formulasH_Xi_Xi_1Values +
                "\n" + jointEntropyOfTheDistribution() +
                "\n\nВычисление условной энтропии: \n" +
                Formulas.Hxi_Xi1 + CalculateJointEntropyOfTheDistribution.calculate(jointEntropyOfTheDistribution) + " - " + CalculateEntropyOfTheDistribution.calculate(entropyOfTheDistribution) +
                " = " + CalculateConditionalEntropyOfTheDistribution.calculate(entropyOfTheDistribution, jointEntropyOfTheDistribution);
    }

    private static String probabilitiesContent() {
        return "p(a|a) = " + Probabilities.p_aa +
                "\n" +
                "p(b|a) = " + Probabilities.p_ba +
                "\n" +
                "p(c|a) = " + Probabilities.p_ca +
                "\n\n" +
                "p(a|b) = " + Probabilities.p_ab +
                "\n" +
                "p(b|b) = " + Probabilities.p_bb +
                "\n" +
                "p(c|b) = " + Probabilities.p_cb +
                "\n\n" +
                "p(a|c) = " + Probabilities.p_ac +
                "\n" +
                "p(b|c) = " + Probabilities.p_bc +
                "\n" +
                "p(c|c) = " + Probabilities.p_cc;

    }

    private static String entropyOfTheDistributionContent() {
        return "H(Xi) = " + CalculateEntropyOfTheDistribution.calculate(entropyOfTheDistribution);
    }

    private static String jointEntropyOfTheDistribution() {
        return "H(XiXi+1) = " + CalculateJointEntropyOfTheDistribution.calculate(jointEntropyOfTheDistribution);
    }
}
