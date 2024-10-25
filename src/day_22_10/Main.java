package day_22_10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Node puntikA = new Node("a");
        Node puntikB = new Node("b");
        Node puntikC = new Node("c");
        Node puntikD = new Node("d");

        puntikA.addNeighbour(puntikB);
        puntikB.addNeighbour(puntikA);
        puntikB.addNeighbour(puntikC);
        puntikB.addNeighbour(puntikD);
        puntikC.addNeighbour(puntikB);
        puntikD.addNeighbour(puntikB);

        ArrayList<Node> list = new ArrayList<>();

        list.add(puntikA);
        list.add(puntikB);

        Graph graph = new Graph(list);

        graph.addPuntik(puntikC);
        graph.addPuntik(puntikD);

        List<Node> vysledky = graph.dfs();

        System.out.println("vypsání bodů v pořadí");
        for (int i = 0; i < vysledky.size();i++){
            System.out.println(vysledky.get(i));
        }




        for (int i = 0; i < graph.puntiky.size(); i++){
            Node puntik = graph.puntiky.get(i);

            System.out.println("Jsem: " + puntik + "\nSousedi:");


            for (int j = 0; j < puntik.getNeighbours().size(); j++){
                Node soused = puntik.getNeighbours().get(j);
                System.out.println(" "+soused);
            }
        }
    }

}
