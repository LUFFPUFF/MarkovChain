package logic.formulas;

import configAndStart.Probabilities;
import logic.probabilities.ConditionalProbabilitiesOfStationaryDistribution.JointProbabilitiesOfStationaryDistribution;
import logic.probabilities.ProbabilitiesOfStationaryDistribution.ProbabilitiesOfStationaryDistribution;

public class Formulas {

    public static final String formulasPxi_A = "P(Xi+1 = a) = p(a)*p(a|a) + p(b)*p(a|b) + p(c)*p(a|c)";
    public static final String formulasPxi_B = "P(Xi+1 = b) = p(a)*p(b|a) + p(b)*p(b|b) + p(c)*p(b|c)";
    public static final String formulasPxi_C = "P(Xi+1 = c) = p(a)*p(c|a) + p(b)*p(c|b) + p(c)*p(c|c)";

    public static final String systemFormulasA_B_C =
            Probabilities.p_aa + "p(a) + " + Probabilities.p_ab + "p(b) + " + Probabilities.p_ac + "p(c)\n" +
                    Probabilities.p_ba + "p(a) + " + Probabilities.p_bb + "p(b) + " + Probabilities.p_bc + "p(c)\n" +
                    Probabilities.p_ca + "p(a) + " + Probabilities.p_cb + "p(b) + " + Probabilities.p_cc + "p(c)\n" +
            "p(a) + p(b) + p(c) = 1";

    public static final String formulasHXi = "H(Xi) = p(a)log2(p(a)) + p(b)log2(p(b)) + p(c)log2(p(c))";
    public static final String formulasHXiValues = "(" + ProbabilitiesOfStationaryDistribution.P_A + ")" + "log2" + "(" + ProbabilitiesOfStationaryDistribution.P_A + ")" + " + " +
            "(" + ProbabilitiesOfStationaryDistribution.P_B + ")" + "log2" + "(" + ProbabilitiesOfStationaryDistribution.P_B + ")" + " + " +
            "(" + ProbabilitiesOfStationaryDistribution.P_C + ")" + "log2" + "(" + ProbabilitiesOfStationaryDistribution.P_C + ")";

    public static final String formulasPa_Paa = "p(Xi = a, Xi+1 = a) = p(a)p(a|a) = " + ProbabilitiesOfStationaryDistribution.P_A + " * " + Probabilities.p_aa;
    public static final String formulasPb_Pab = "p(Xi = b, Xi+1 = a) = p(b)p(a|b) = " + ProbabilitiesOfStationaryDistribution.P_B + " * " + Probabilities.p_ab;
    public static final String formulasPc_Pac = "p(Xi = c, Xi+1 = a) = p(c)p(a|c) = " + ProbabilitiesOfStationaryDistribution.P_C + " * " + Probabilities.p_ac;
    public static final String formulasPa_Pba = "p(Xi = a, Xi+1 = b) = p(a)p(b|a) = " + ProbabilitiesOfStationaryDistribution.P_A + " * " + Probabilities.p_ba;
    public static final String formulasPb_Pbb = "p(Xi = b, Xi+1 = b) = p(b)p(b|b) = " + ProbabilitiesOfStationaryDistribution.P_B + " * " + Probabilities.p_bb;
    public static final String formulasPc_Pbc = "p(Xi = c, Xi+1 = b) = p(c)p(b|c) = " + ProbabilitiesOfStationaryDistribution.P_C + " * " + Probabilities.p_bc;
    public static final String formulasPa_Pca = "p(Xi = a, Xi+1 = c) = p(a)p(c|a) = " + ProbabilitiesOfStationaryDistribution.P_A + " * " + Probabilities.p_ca;
    public static final String formulasPb_Pcb = "p(Xi = b, Xi+1 = c) = p(b)p(c|b) = " + ProbabilitiesOfStationaryDistribution.P_B + " * " + Probabilities.p_cb;
    public static final String formulasPc_Pcc = "p(Xi = c, Xi+1 = c) = p(c)p(c|c) = " + ProbabilitiesOfStationaryDistribution.P_C + " * " + Probabilities.p_cc;

    public static final String formulasH_Xi_Xi_1 = "p(a)p(a|a)*log2(p(a)p(a|a)) + p(b)p(a|b)*log2(p(b)p(a|b)) + p(c)p(a|c)*log2(p(c)p(a|c)) + " +
            "p(a)p(b|a)*log2(p(a)p(b|a)) + \np(b)p(b|b)*log2(p(b)p(b|b)) + p(c)p(b|c)*log2(p(c)p(b|c)) + p(a)p(c|a)*log2(p(a)p(c|a)) + " +
            "p(b)p(c|b)*log2(p(b)p(c|b)) + p(c)p(c|c)*log2(p(c)p(c|c)) = ";
    public static final String formulasH_Xi_Xi_1Values = JointProbabilitiesOfStationaryDistribution.Pa_Paa + "log2(" + JointProbabilitiesOfStationaryDistribution.Pa_Paa + ") + " +
            JointProbabilitiesOfStationaryDistribution.Pb_Pab + "log2(" + JointProbabilitiesOfStationaryDistribution.Pb_Pab + ") + " +
            JointProbabilitiesOfStationaryDistribution.Pc_Pac + "log2(" + JointProbabilitiesOfStationaryDistribution.Pc_Pac + ") + " +
            JointProbabilitiesOfStationaryDistribution.Pa_Pba + "log2(" + JointProbabilitiesOfStationaryDistribution.Pa_Pba + ") + " +
            JointProbabilitiesOfStationaryDistribution.Pb_Pbb + "log2(" + JointProbabilitiesOfStationaryDistribution.Pb_Pbb + ") + " +
            JointProbabilitiesOfStationaryDistribution.Pc_Pbc + "log2(" + JointProbabilitiesOfStationaryDistribution.Pc_Pbc + ") + " +
            JointProbabilitiesOfStationaryDistribution.Pa_Pca + "log2(" + JointProbabilitiesOfStationaryDistribution.Pa_Pca + ") + " +
            JointProbabilitiesOfStationaryDistribution.Pb_Pcb + "log2(" + JointProbabilitiesOfStationaryDistribution.Pb_Pcb + ") + " +
            JointProbabilitiesOfStationaryDistribution.Pc_Pcc + "log2(" + JointProbabilitiesOfStationaryDistribution.Pc_Pcc + ")";

    public static final String Hxi_Xi1 = "Hxi(Xi+1) = H(XiXi+1) - H(Xi) = ";


}
