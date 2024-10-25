package day_22_10;

import java.util.*;

public class Graph {

public List<Node> puntiky = new ArrayList<>();

public Graph(List<Node> puntiky){
    this.puntiky = puntiky;
}
public void addPuntik(Node puntik){
    puntiky.add(puntik);
}
public List<Node> dfs(){

    Stack<Node> fronta = new Stack<>();
    List<Node> navstiveneVrcholy = new ArrayList<>();
    Set<Node> kontrola = new HashSet<>();


        Node start = puntiky.get(0);
        fronta.push(start);
        kontrola.add(start);


    while (!fronta.isEmpty()){


        Node puntik = fronta.pop();
        navstiveneVrcholy.add(puntik);

        for (int i = 0; i < puntik.getNeighbours().size(); i++){

            if (!kontrola.contains(puntik.getNeighbours().get(i))){
            fronta.add(puntik.getNeighbours().get(i));
            kontrola.add(puntik.getNeighbours().get(i));
        }}
    }
    return navstiveneVrcholy;
}

}
