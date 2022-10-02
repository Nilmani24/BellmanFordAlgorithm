import java.util.Arrays;
import java.util.List;

public class BellmanFord {

    private List<Edge> edges;
    private int v;
    int dist[];

    public BellmanFord(List<Edge> edges, int v){
        this.edges = edges;
        this.v = v;
        dist = new int[v];
        Arrays.fill(dist, 100000);

    }

    public void bellmanFord(int src){
        dist[src] =0;
        for(int i =1;i<v;i++){
           for(Edge vertex:  edges){
               int source = vertex.getSource();
               int destination = vertex.getDestination();
               int weight = vertex.getWeight();
               if(dist[source] + weight < dist[destination])
                   dist[destination] = dist[source] + weight;
           }
        }

      for(Edge vertex : edges){
          int source = vertex.getSource();
          int destination = vertex.getDestination();
          int weight = vertex.getWeight();
          if(dist[source] + weight < dist[destination]) {
              System.out.println("negative weight cycle");
              return;
          }
      }

      for(int i =0;i<v;i++){
          System.out.println(i+ " -->"+ dist[i] + " ");
      }
    }
}
