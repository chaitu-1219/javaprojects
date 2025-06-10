	package abc;
	import java.util.*;

	public class DFS2 {
	    private Map<String, List<String>> hm = new HashMap<>();
	    private Set<String> v = new HashSet<>();

	    public void connectperson(String person, String connectedperson) {
	        hm.computeIfAbsent(person, k -> new ArrayList<>()).add(connectedperson);
	        hm.computeIfAbsent(connectedperson, k -> new ArrayList<>());
	    }  
	    public void dfs2(String currentperson) {
	        if (v.contains(currentperson))
	            return;
	        v.add(currentperson);
	        System.out.println("Visited person: " + currentperson);
	        for (String n : hm.getOrDefault(currentperson, new ArrayList<>()))
	            dfs2(n);
	    }
	    public static void main(String[] args) {
	        DFS2 h = new DFS2();
	        h.connectperson("chaitanya", "subhash");
	        h.connectperson("chaitanya", "rithesh"
	        		+ "");
	        h.connectperson("subhash", "nithin");
	        System.out.println("DFS Traversal starting from chaitanya:");
	        h.dfs2("chaitanya");
	    }
	}