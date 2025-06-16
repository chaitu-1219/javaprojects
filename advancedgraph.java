package first;
import java.util.*;
public class advancedgraph {
	static class graph{
		private Map<Integer,List<Integer>> obj=new HashMap<Integer ,List<Integer>>();
		void addedge(int u,int v) {
			obj.computeIfAbsent(u,k->new ArrayList<>()).add(v);
			obj.computeIfAbsent(v,k->new ArrayList<>()).add(u);
	}
		void printgraph() {
			for(int node:obj.keySet()) {
				
				System.out.println("Node"+node+" is connected to:");
				
				for(int neighbor:obj.get(node)) {
					System.out.println(neighbor+" ");
				}
				System.out.println(" ");
			}
		}
	}

	public static void main(String[] args) {
		graph g1=new graph();
		g1.addedge(1, 2);
		g1.addedge(1, 3);
		g1.addedge(1, 4);
		g1.addedge(1, 4);
		g1.printgraph();
		}
	}


