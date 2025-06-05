package first;

public class binary {
	public static int binarySearchRecursive(int[] arr, int target, int left, int right) {
	    if (left > right) {
	        return -1;
	    }
	    int mid = left + (right - left) / 2;

	    if (arr[mid] == target)
	        return mid;
	    else if (arr[mid] < target)
	        return binarySearchRecursive(arr, target, mid + 1, right);
	    else
	        return binarySearchRecursive(arr, target, left, mid - 1);
	}


	public static void main(String[] args) {
		int[] num= {1,2,3,4,5,6,7,8};
		int target=5;
		int left=0;
		int right=num.length-1;
		int index=binarySearchRecursive(num,target,left,right);
		System.out.println("found "+target+" at index:"+index);
	}

}
