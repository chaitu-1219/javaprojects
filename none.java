package abc;
import java.util.ArrayList;
import java.util.Scanner;

public class none{

    public static void main(String[] args) {
        ArrayList<String> todoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("==== Simple To-Do List ====");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter a new task: ");
                    String task = scanner.nextLine();
                    todoList.add(task);
                    System.out.println("Task added.");
                    break;

                case 2:
                    System.out.println("\nYour To-Do List:");
                    if (todoList.isEmpty()) {
                        System.out.println("No tasks added.");
                    } else {
                        for (int i = 0; i < todoList.size(); i++) {
                            System.out.println((i + 1) + ". " + todoList.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter task number to remove: ");
                    int index = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    if (index > 0 && index <= todoList.size()) {
                        String removed = todoList.remove(index - 1);
                        System.out.println("Removed: " + removed);
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
