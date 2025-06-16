package xyz;

public class Binary {
	public static int binarySearchRecursive(int[] arr,int target, int left, int right) {
	    if (left > right) {
	        return -1;
	    }
	    int mid = left + (right - left) / 2;

	    if (arr[mid]==target)
	        return mid;
	    else if (arr[mid]<target)
	        return binarySearchRecursive(arr, target, mid + 1, right);
	    else
	        return binarySearchRecursive(arr, target, left, mid - 1);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,4,1,6,3,5};
		int t=5;
		int l=0;
		int r=a.length-1;
		int re=binarySearchRecursive(a,t,l,r);
		System.out.println("found "+t+" at index "+re);

	}

}
