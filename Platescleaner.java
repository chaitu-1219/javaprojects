package first;

import java.util.*;

public class Platescleaner {

	public static void main(String[] args) {
		Stack<String> pc=new Stack<String>();
		Scanner sc=new Scanner(System.in);
		pc.push("p1");
		pc.push("p2");
		pc.push("p3");
		pc.push("p4");
		pc.push("p5");
		for(int i=0;i<pc.size();i++) {
		System.out.println("enter to eat or not:");
		String et=sc.next().toLowerCase();
		if(et.equals("eat")) {
			pc.pop();
		}
		System.out.println(pc);
	}
	}
}
