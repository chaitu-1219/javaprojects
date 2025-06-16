package xyz;

public class quadritictimeexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {1,2,3,4,5,4,4};
		boolean hasdup=false;
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]==num[j]) {
					hasdup=true;
					System.out.println("duplicate found:"+num[i]);
				}
			}
		}
		if(!hasdup) 
			System.out.println("no duplucate are found");
	}

}
