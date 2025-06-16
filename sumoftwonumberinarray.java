package xyz;

public class sumoftwonumberinarray {
	public static int[] twosum(int[] a,int t) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==t) 
					return new int[] {i,j};
			}
		}
		return new int[] {};
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5};
		int t=9;
		int[] res=twosum(a,t);
		if(res.length==2)
			System.out.println(res[0]+" "+res[1]);
		else
			System.out.println("subhash");
	}
}