package abc;
import java.util.*;

import java.util.*;

public class BFS2 {
    public static void main(String[] args) {
        // Build the graph
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("Entrance", Arrays.asList("Reptile House", "Bird Sanctuary", "Mammal Zone"));
        graph.put("Reptile House", Arrays.asList("Snake Pit"));
        graph.put("Bird Sanctuary", Arrays.asList("Parrot Pavilion"));
        graph.put("Mammal Zone", Arrays.asList("Lion Den", "Elephant Enclosure"));
        graph.put("Snake Pit", Collections.emptyList());
        graph.put("Parrot Pavilion", Collections.emptyList());
        graph.put("Lion Den", Collections.emptyList());
        graph.put("Elephant Enclosure", Collections.emptyList());

        // Display the graph
        for (String zone : graph.keySet()) {
            System.out.println(zone + " connects to: " + graph.get(zone));
        }

        System.out.println("\nBFS traversal starting from Entrance:");

        // BFS implementation
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        queue.add("Entrance");
        visited.add("Entrance");

        while (!queue.isEmpty()) {
            String current = queue.poll();
            System.out.println(current);

            for (String neighbor : graph.getOrDefault(current, Collections.emptyList())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }
}
