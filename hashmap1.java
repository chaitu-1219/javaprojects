package first;
import java.util.Scanner;

import java.util.HashMap;

public class hashmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(3309,"chaitanya");
		hm.put(3319, "guruteja");
		hm.put(3340, "manaswin");
		hm.put(3333, "koushik");
			System.out.println(hm);
		hm.remove(3319);
		System.out.println(hm);
		hm.put(3321, "harinath");
		System.out.println(hm);
		hm.put(3309,"chaitany");
		System.out.println(hm);
		boolean HM=hm.containsValue("chaitany");
		System.out.println(HM);
		boolean HM1=hm.containsKey(3319);
		System.out.println(HM1);
	}
}
