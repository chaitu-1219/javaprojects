package first;

abstract class Cars {
	abstract void internalparts();
	public void todrive() {
		System.out.println("Tyres must be 4");
		System.out.println("seat must be 2 or  more than 2");
	}
}
public class car extends Cars{
	void internalparts() {
		System.out.println("1.engine = 4.2l\n 2.petrol car\n 3.milage=29");
	}

	public static void main(String[] args) {
		car obj =new car();
		obj.internalparts();
		obj.todrive();
	}

}

