package abc;
import java.util.*;
public class pro {
	public static void main(String[] args) {
		ArrayList<String> todo=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("\nsimple to-do-list-App");
			System.out.println("1.Add task");
			System.out.println("2.View task");
			System.out.println("3.Delete task");
			System.out.println("4.exit");
			System.out.println("choose an option 1-4:");
			int choice=sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				System.out.println("enter your task");
				String task=sc.nextLine();
				todo.add(task);
				System.out.println("task added");
				break;
			case 2:
				System.out.println("\n your to do list:");
				if(todo.isEmpty()) {
					System.out.println(" no task to view");
				}else {
				for(int i=0;i<todo.size();i++) {
					System.out.println(i+1+""+todo.get(i));
				}
				}
				break;
			case 3:	
				if(todo.isEmpty()) {
					System.out.println("no task to delete");
				}
				System.out.println("enter task number to remove");
				int tnum=sc.nextInt();
				if(tnum>0&&tnum<=todo.size()) {
					todo.remove(tnum-1);
					System.out.println("task removed");
				}
				else {
					System.out.println("invalid task");
				}
				break;
			case 4:
				System.out.println("tata bye!!");
				break;
	        default:
				System.out.println("invalid operator choose valid operator again");
				}		
		}
	}
}
