package xyz;

public class revwordinstring {

	public static void main(String[] args) {
		String st= "Hi i am chaitanya";
		String[] w=st.split(" ");
		for(int i=w.length-1;i>=0;i--) {
			System.out.print(w[i]+"  ");
		}
	}
}