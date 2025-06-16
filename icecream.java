package first;
import java.util.*;
public class icecream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> qu=new LinkedList<String>();
		qu.add("rithesh");
		qu.add("subhash");
		qu.add("vishnu");
		qu.add("wasim");
		qu.add("vikas");
		System.out.println(qu);
		System.out.println(qu.peek());
		qu.remove();
		System.out.println(qu);
		qu.add("sharan");
		System.out.println(qu);
		
	}

}
