package first;
public class student {
    private String name;
    private int rollNumber;
    private int marks;   
    public student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }   
    public String getName() {
        return name;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public int getMarks() {
        return marks;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
    public boolean isPassed() {
        return marks >= 40; 
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number:" + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Status: " + (isPassed () ? "Pass" : "Fail"));
    }
    public static void main(String[] args) {
        student student1 = new student("Alice", 101, 85);
        student student2 = new student("Bob", 102, 35);
        student1.displayInfo();
        System.out.println();
        student2.displayInfo();
    }	 
}