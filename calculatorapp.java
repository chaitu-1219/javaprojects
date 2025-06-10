package cal.chai;
import java.util.*;
public class calculatorapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner i=new Scanner(System.in);
		double num1,num2;
		System.out.println("enter number1 & number2 values:");
		num1=i.nextDouble();
		num2=i.nextDouble();
		System.out.println("enter operator");
		System.out.println("1.addition");
		System.out.println("2.substraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		int op=i.nextInt();
		double res;
		switch(op) {
		case 1:
			res=num1+num2;
			System.out.println(res);
			break;
		case 2:
			res=num1-num2;
			System.out.println(res);
			break;
		case 3:
			res=num1*num2;
			System.out.println(res);
			break;
		case 4:
			if(num2!=0) {
			res=num1/num2;
			System.out.println(res);
			}
			else
			System.out.println("/ by zero error");
			break;
		default:
			System.out.println("invalid operator");
		}
		

	}

}
