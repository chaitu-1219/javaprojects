package abc;

public class mergesort {
    
    void merge(int a[], int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int l[] = new int[n1];
        int r[] = new int[n2];
        for(int i = 0; i < n1; i++)
            l[i] = a[left + i]; 
        for(int j = 0; j < n2; j++)
            r[j] = a[mid + 1 + j];
        int i = 0, j = 0;
        int k = left;
        while(i < n1 && j < n2) {
            if(l[i] <= r[j]) {
                a[k] = l[i];
                i++;
            } else {
                a[k] = r[j];
                j++;
            }
            k++;
        }
        while(i < n1) {
            a[k] = l[i];
            i++;
            k++;
        }

        while(j < n2) {
            a[k] = r[j];
            j++;
            k++;
        }
    }

    void sort(int a[], int left, int right) {
        if(left < right) {
            int mid = (left +right)/2; 

            sort(a, left, mid);
            sort(a, mid + 1, right);
            merge(a, left, mid, right);
        }
    }
    static void printarr(int a[]) {
        for(int num : a) {
            System.out.print(num + " "); 
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] a = {12, 8, 9, 3, 11, 5, 4};
        System.out.println("Original array:");
        printarr(a);
        mergesort ol = new mergesort();
        ol.sort(a, 0, a.length - 1);
        System.out.println("Sorted array:");
        printarr(a);
    }
}
