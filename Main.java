package abc;
class animal{
	void sound() {
		System.out.println("animals make sound");
	}
}
class dog extends animal{
	void sounds() {
		System.out.println("dog barks");
	}
}
class act extends animal{
	void sound() {
		System.out.println("act mewo");
	}
}

public class Main {

	public static void main(String[] args) {
		animal a1=new animal();
		animal a2=new dog();
		//animal a3=new cat();
		a1.sound();
		a2.sound();
		
	}

}

