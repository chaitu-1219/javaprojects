package abc;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {5,2,4,1,3};
		
		for(int i=0;i<num.length-1;i++) {
			for(int j=0;j<num.length-1;j++) {
				if(num[j]>num[j+1]) {
					int t=num[j];
					num[j]=num[j+1];
					num[j+1]=t;
				}
			}
		}
		for(int number:num) {
			System.out.println(number);
		}

	}

}
