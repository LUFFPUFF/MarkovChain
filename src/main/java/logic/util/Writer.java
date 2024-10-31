package logic.util;

import com.mxgraph.layout.mxCircleLayout;
import com.mxgraph.layout.mxParallelEdgeLayout;
import com.mxgraph.model.mxCell;
import com.mxgraph.util.mxCellRenderer;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import logic.createdmarkovchain.CreatedMarkovChain;
import org.jgrapht.Graph;
import org.jgrapht.ext.JGraphXAdapter;
import org.jgrapht.graph.DefaultWeightedEdge;

import javax.imageio.ImageIO;

public class Writer {

    public static void writeToPngGraph(String filePath) {

        Graph<String, DefaultWeightedEdge> markovChain = CreatedMarkovChain.getStringDefaultWeightedEdgeGraph();

        JGraphXAdapter<String, DefaultWeightedEdge> graphAdapter =
                new JGraphXAdapter<>(markovChain);

        for (DefaultWeightedEdge edge : markovChain.edgeSet()) {
            mxCell cell = (mxCell) graphAdapter.getEdgeToCellMap().get(edge);
            double weight = markovChain.getEdgeWeight(edge);
            cell.setValue(String.valueOf(weight));
        }

        mxCircleLayout layout = new mxCircleLayout(graphAdapter);
        layout.execute(graphAdapter.getDefaultParent());

        mxParallelEdgeLayout parallelLayout = new mxParallelEdgeLayout(graphAdapter);
        parallelLayout.execute(graphAdapter.getDefaultParent());

        BufferedImage image = mxCellRenderer.createBufferedImage(graphAdapter, null, 2,  Color.WHITE, true, null);
        try {
            ImageIO.write(image, "PNG", new File(filePath));
            System.out.println("Маркова цепь успешно сохранено в файл: " + filePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeToTxtFile(String filePath, String content) {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(content);
            System.out.println("Текстовое решение успешно сохранено в файл: " + filePath);
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
