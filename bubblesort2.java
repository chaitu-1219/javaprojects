package xyz;

public class bubblesort2 {
	public static void main(String[] args) {
		int[] a= {5,3,8,4,2};
		System.out.println("orginal list:");
		for(int nums:a)
			System.out.println(nums);
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("sorted list:");
		for(int num:a) {
			System.out.println(num);
		}
	}
}