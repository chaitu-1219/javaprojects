package first;
import java.util.*;
public class undo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> s=new Stack<>();
		s.add("read");
		s.add("write");
		s.add("view");
		System.out.println(s.peek());
		System.out.println(s);
		s.pop();
		s.pop();
		System.out.println(s);
	}

}
