package day_10_9;

import java.util.HashSet;
import java.util.Set;

public class Graph {

    private boolean[][] GraphMatrix;

    public Graph(Label [][] graph) {
        Set<Label> unigeVertices = new HashSet<>(); // neprida stejnou hodnotu dvakrát
        for (int i = 0; i < graph.length; i++){
            for (int j = 0; j < 2; j++ ){
                unigeVertices.add(graph[i][j]);
            }
        }

    }
}
