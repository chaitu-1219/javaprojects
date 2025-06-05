package first;
import java.util.*;
public class binsarch {
		public static int binarySearchRecursive(String[] arr,String target, int left, int right) {
		    if (left > right) {
		        return -1;
		    }
		    int mid = left + (right - left) / 2;

		    if (arr[mid].compareTo(target)==0)
		        return mid;
		    else if (arr[mid].compareTo(target)<0)
		        return binarySearchRecursive(arr, target, mid + 1, right);
		    else
		        return binarySearchRecursive(arr, target, left, mid - 1);
		}

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 String[] arr= {"amit","divya","karan","zoya"};
		 Arrays.sort(arr);
		 System.out.println("enter an target value");
		 String target=sc.next();
		 int left=0;
		 int right=arr.length-1;
		 int index = binarySearchRecursive(arr,target,left,right);
		 System.out.println("Target "+target+" is found at index"+index);
	}
		
	}


