package first;
import java.util.*;
class arraylist{
	public arraylist(){
	ArrayList<String> employee=new ArrayList<>();

   employee.add("subhash");
employee.add("hruday");
employee.add("harinath");
employee.add("guru teja");
employee.add("Kamalesh");
Collections.reverse(employee);
System.out.println("--------------reverse------------");
for(int i=0;i<employee.size();i++) {
	  System.out.println(employee.get(i));
}
employee.remove(3);
System.out.println("---------------remove------------");
for(int i=0;i<employee.size();i++) {
	  System.out.println(employee.get(i));
}
Collections.sort(employee);
System.out.println("---------------sorting------------");
for(int i=0;i<employee.size();i++) {
	  System.out.println(employee.get(i));
}
	}
}
class linkedlist extends arraylist{
	public linkedlist() {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("subhash");
		ll.add("manaswin");
		ll.add("chatanya");
		System.out.println(ll);
	}
}
class hashmap extends linkedlist{
	public hashmap() {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(3309,"chaitanya");
		hm.put(3319, "guruteja");
		hm.put(3340, "manaswin");
		hm.put(3333, "koushik");
			System.out.println(hm);
			System.out.println("-------remove------");
		hm.remove(3319);
		System.out.println(hm);
		System.out.println("-------insert------");
		hm.put(3321, "harinath");
		System.out.println(hm);
		System.out.println("-------update------");
		hm.put(3309,"chaitany");
		System.out.println(hm);
		System.out.println("-------checks------");
		boolean HM=hm.containsValue("chaitany");
		System.out.println(HM);
		boolean HM1=hm.containsKey(3319);
		System.out.println(HM1);
	}
}
class hset extends hashmap{
	public hset(){
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(10);
		hs.add(90);
		hs.add(40);
		hs.add(30);
		System.out.println(hs);
	}
}
public class AllLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hset has=new hset();
}
}