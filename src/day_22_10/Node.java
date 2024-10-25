package day_22_10;

import java.util.ArrayList;
import java.util.List;

public class Node {

    private List<Node> neighbours = new ArrayList<>();
    private String name;

    public Node(String name){
        this.name = name;
    }

    public List<Node> getNeighbours() {
        return neighbours;
    }

    public void addNeighbour(Node neighbour){
        neighbours.add(neighbour);
    }

    @Override
    public String toString(){
        return name;
    }

}
