package abc;

public class treads {

	public static void main(String[] args) {
		Thread lowPriorityThread=new Thread(()->{
			for(int i=1;i<=5;i++) {
				System.out.println(i);
			}
		});
		Thread highPriorityThread=new Thread(()->
		{
			for(int i=1;i<=5;i++) {
				System.out.println(i);
			}
		});
		lowPriorityThread.setPriority(Thread.MIN_PRIORITY);
		highPriorityThread.setPriority(Thread.MAX_PRIORITY);
		lowPriorityThread.start();
		highPriorityThread.start();
	}

}
