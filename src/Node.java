import java.util.ArrayList;
import java.util.List;

public class Node {

    private String name;

    private List<Node> connections;

    public Node(String name) {
        this.name = name;
        this.connections = new ArrayList<>();
    }

    public void add(Node node) {
        connections.add(node);
    }

    public Node get(String name) {
        //for (int i = 0; i < connections.size(); i++) {
        //    if (connections.get(i).name.equals(name)) {
        //        return connections.get(i);
        //    }
        //}

        for (Node connection : connections) {
            if (connection.name.equals(name)) {
                return connection;
            }
        }

        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Node> getConnections() {
        return connections;
    }

    public void setConnections(List<Node> connections) {
        this.connections = connections;
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                '}';
    }
}
