package corejavacocept.thread.implementsrunnable;

public class ThreadUsingImplementsRunnable  implements Runnable{

	@Override
	public void run() {
		
		
			for(int i=0;i<10;i++)
			{
				System.out.println("Thread t1="+i);
				
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}		
		
		
		
	}
	
	
	public static void main(String[] args) {
		ThreadUsingImplementsRunnable obj=new ThreadUsingImplementsRunnable();
		Thread thread1=new Thread(obj);
		thread1.start();
		
		
		

	}

}
