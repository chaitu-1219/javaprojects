package first;

import java.util.Scanner;

public class calender {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	String day=sc.nextLine();
    	switch(day) {
    	case "monday":
    		System.out.println("lets start coding");
    	break;	
    	case "tuesday":
    		System.out.println("lets start scala");
    		break;
    	case "wednesday":
    		System.out.println("lets start c");
    		break;
    	case "thursday":
    		System.out.println("lets start c++");
    		break;
    	case "friday":
    		System.out.println("lets start sql");
    		break;    	
    	case "saturday":
    		System.out.println("lets start java");
    		break;
    	case "sunday":
    		System.out.println("lets start python");	
    		break;
    	default:
    		System.out.println("invalid input day");
    	}
    }
}
