package abc;
import java.util.*;

public class DFS {
    private Map<String, List<String>> hm = new HashMap<>();
    private Set<String> v = new HashSet<>();

    public void addRoom(String room, String connectedRoom) {
        hm.computeIfAbsent(room, k -> new ArrayList<>()).add(connectedRoom);
        hm.computeIfAbsent(connectedRoom, k -> new ArrayList<>());
    }  
    public void dfs(String currentRoom) {
        if (v.contains(currentRoom))
            return;
        v.add(currentRoom);
        System.out.println("Visited: " + currentRoom);
        for (String n : hm.getOrDefault(currentRoom, new ArrayList<>()))
            dfs(n);
    }

    public static void main(String[] args) {
        DFS h = new DFS();
        h.addRoom("Living Room", "Kitchen");
        h.addRoom("Living Room", "Bedroom");
        h.addRoom("Bedroom", "Bathroom");

        System.out.println("DFS Traversal starting from Living Room:");
        h.dfs("Living Room");
    }
}
