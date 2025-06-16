package xyz;

public class logtimeexample {

	public static void main(String[] args) {
		int[] num= {1,3,5,7,9,11,13};
		int t=7;
		int low=0;
		int high=num.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(num[mid]==t) {
				System.out.println("found number "+t+" at position"+mid);
				return;
			}
			else if(num[mid]<t) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
			}
		System.out.println("not found number.");
	}
}
