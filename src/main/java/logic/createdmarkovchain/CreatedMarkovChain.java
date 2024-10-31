package logic.createdmarkovchain;

import configAndStart.Probabilities;
import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultDirectedWeightedGraph;
import org.jgrapht.graph.DefaultWeightedEdge;
import logic.util.Writer;

public class CreatedMarkovChain {

    public static void main(String[] args) {
        String path = "src/main/java/OUTPUT/markov_chain.png";
        Writer.writeToPngGraph(path);
    }

    public static Graph<String, DefaultWeightedEdge> getStringDefaultWeightedEdgeGraph() {
        Graph<String, DefaultWeightedEdge> markovChain =
                new DefaultDirectedWeightedGraph<>(DefaultWeightedEdge.class);

        markovChain.addVertex("A");
        markovChain.addVertex("B");
        markovChain.addVertex("C");

        DefaultWeightedEdge edgeAA = markovChain.addEdge("A", "A");
        markovChain.setEdgeWeight(edgeAA, Probabilities.p_aa);

        DefaultWeightedEdge edgeAB = markovChain.addEdge("A", "B");
        markovChain.setEdgeWeight(edgeAB, Probabilities.p_ab);

        DefaultWeightedEdge edgeAC = markovChain.addEdge("A", "C");
        markovChain.setEdgeWeight(edgeAC, Probabilities.p_ac);

        DefaultWeightedEdge edgeBA = markovChain.addEdge("B", "A");
        markovChain.setEdgeWeight(edgeBA, Probabilities.p_ba);

        DefaultWeightedEdge edgeBB = markovChain.addEdge("B", "B");
        markovChain.setEdgeWeight(edgeBB, Probabilities.p_bb);

        DefaultWeightedEdge edgeBC = markovChain.addEdge("B", "C");
        markovChain.setEdgeWeight(edgeBC, Probabilities.p_bc);

        DefaultWeightedEdge edgeCA = markovChain.addEdge("C", "A");
        markovChain.setEdgeWeight(edgeCA, Probabilities.p_ca);

        DefaultWeightedEdge edgeCB = markovChain.addEdge("C", "B");
        markovChain.setEdgeWeight(edgeCB, Probabilities.p_cb);

        DefaultWeightedEdge edgeCC = markovChain.addEdge("C", "C");
        markovChain.setEdgeWeight(edgeCC, Probabilities.p_cc);
        return markovChain;
    }
}
