package xyz;

public class linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,4,3,6,2,7,5,9,8};
		int t=9;
		boolean b=false;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==t) {
				System.out.println("found "+t+" at index "+i);
				b=true;
				break;
			}
		}

	}

}
