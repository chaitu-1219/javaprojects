package first;

public class linear {

	public static void main(String[] args) {
		int[] n= {4,8,1,3,7,2,5,6};
		int t=7;
		boolean f=false;
		for(int i=0;i<n.length;i++) {
			if(n[i]==t) {
			System.out.println("found"+t+"at index"+i);
			f=true;
			break;
		}
	}
	}
}