package Graph.AdjacencyMatrixAndList;

public class App {

    private static int[][] adjacencyMatrix = {
            {0,2,4,0},
            {0,0,0,3},
            {0,0,0,0},
            {0,0,0,0}
    };

    public static void main(String[] args) {

        for(int i=0;i<adjacencyMatrix.length; i++){
            for(int j=0;j<adjacencyMatrix.length;j++){
                if(adjacencyMatrix[i][j]!=0){
                    System.out.println("Edge with weight: "+adjacencyMatrix[i][j ]);
                }
            }
        }
        System.out.println(adjacencyMatrix[0][2]);


        Vertex v1 = new Vertex("A");
        Vertex v2 = new Vertex("B");
        Vertex v3 = new Vertex("C");
        Vertex v4 = new Vertex("D");


        v1.addNeighbor(v2);
        v1.addNeighbor(v3);
        v2.addNeighbor(v4);

        v1.showNeighbors();
        v2.showNeighbors();
        v3.showNeighbors();
        v4.showNeighbors();
    }
}

