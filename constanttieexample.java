package xyz;

public class constanttieexample {
	public static void print(int[ ] a) {
		if(a.length>0) {
			for(int i=0;i<=a.length-1;i++) 
			System.out.println("element is:"+a[i]);
		}
		else
			System.out.println("Array is Empty.");
	}
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60};
		print(arr);
	}

}
