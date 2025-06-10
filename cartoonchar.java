package first;
import java.util.*;
public class cartoonchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<>();
		al.add("tom&jerry");
		al.add("Mr.Bean");
		al.add("Oggy");
		al.add("Ben10");
		al.add("Doremon");
		al.remove(0);
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		

	}

}
