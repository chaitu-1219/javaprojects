package first;
import java.util.*;
public class friend {
	public static void main(String[] args) {
		Map<String,List<String>> m=new HashMap<>();
		m.put("Alice", Arrays.asList("bob"));
		m.put("bob", Arrays.asList("Alice","charlie"));
		m.put("charlie", Arrays.asList("bob"));
		System.out.println(m);
		for(String per:m.keySet()) {
			System.out.println(per+" is a friend with "+m.get(per));
		}
	}

}
