package first;
import java.util.TreeMap;
public class treemap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
        tm.put(3309, "chaitanya");
        tm.put(3320,"hari");
        tm.put(3321, "harinath");
        tm.put(3319, "teja");
        System.out.println(tm);
        tm.replace(3319,"hari");
        System.out.println(tm);
        
	}
}