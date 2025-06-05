package first;
import java.util.*;
public class contrymap {

	public static void main(String[] args) {
		TreeMap<String,String> concap=new TreeMap<String,String>();
		concap.put("india", "new delhi");
		concap.put("usa", "washington");
		concap.put("germany", "berlin");
		concap.put("japan", "tokyo");
		concap.put("india", "delhi");
		System.out.println(concap);
		System.out.println(concap.firstKey());
		System.out.println(concap.lastKey());
		System.out.println(concap.higherKey("usa"));
		System.out.println(concap.lowerKey("japan")); 
	}

}
