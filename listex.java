package first;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class listex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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