package first;
import java.util.TreeSet;
public class treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TreeSet<Integer> num=new TreeSet<Integer>();
        num.add(30);
        num.add(40);
        num.add(10);
        num.add(20);
        num.add(60);
        num.add(50);
        num.add(70);
        num.add(70);
        System.out.println(num);
        System.out.println(num.first());
        System.out.println(num.higher(70));
        System.out.println(num.contains(80));
	}

}
