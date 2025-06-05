package first;

import java.util.Scanner;

public class RainUmbrella{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s=sc.next(); 
		if(s.equals("yes")) {
			System.out.println("take an umbrella");
		}
		else {
			System.out.println("no need of umbrella");
			
		}
	}

}