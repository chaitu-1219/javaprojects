package first;
import java.util.*;
public class searchusingtreeset {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("keyboard");
		ts.add("mouse");
		ts.add("monitor");
		ts.add("cpu");
		ts.add("webcam");
		System.out.println(ts);
		System.out.println(ts.contains("mouse "));
	}

}
