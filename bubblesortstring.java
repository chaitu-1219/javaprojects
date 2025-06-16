package xyz;

public class bubblesortstring {

	public static void main(String[] args) {
		String[] s= {"chaitanya","subhash","nithin","bhanu"};
		for(int i=0;i<s.length-1;i++) {
			for(int j=0;j<s.length-1;j++) {
				if(s[j].compareTo(s[j+1])>0) {
					String t=s[j];
					s[j]=s[j+1];
					s[j+1]=t;
				}
			}
		}
		System.out.println("sorted string :");
		for(String st:s) {
			System.out.println(st+" ");
		}
		System.out.println();
	}

}
