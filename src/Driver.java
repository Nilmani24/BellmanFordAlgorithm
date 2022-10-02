import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void main(String[] args) {
        int v = 5;
        int src = 0;
        List<Edge> edgeList = new ArrayList<>(v);
        edgeList.add(new Edge(0,1,4));
        edgeList.add(new Edge(2,0,7));
        edgeList.add(new Edge(1,3,5));
        edgeList.add(new Edge(4,2,8));
        edgeList.add(new Edge(3,4,-1));


        BellmanFord bellmanFord = new BellmanFord(edgeList, v);
        bellmanFord.bellmanFord(src);
    }
}
