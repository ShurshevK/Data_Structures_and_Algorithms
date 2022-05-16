package Graph.AdjacencyMatrixAndList;



import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private String name;

    private List<Vertex> adjacencyList;

    public Vertex(String name) {
        this.name = name;
        this.adjacencyList = new ArrayList<>();
    }

    public void addNeighbor(Vertex v) {
        adjacencyList.add(v);
    }

    public List<Vertex> getNeighbors() {
        return adjacencyList;
    }


    public void showNeighbors() {
        for(Vertex v: adjacencyList)
            System.out.println(v);
    }

    @Override
    public String toString() {
        return name;
    }
}
