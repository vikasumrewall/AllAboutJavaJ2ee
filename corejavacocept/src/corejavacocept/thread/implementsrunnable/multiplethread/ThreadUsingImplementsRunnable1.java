package corejavacocept.thread.implementsrunnable.multiplethread;

public class ThreadUsingImplementsRunnable1  implements Runnable{

	@Override
	public void run() {
		
		
			for(int i=0;i<10;i++)
			{
				
				
				System.out.println("Thread Id="+Thread.currentThread().getId()+"Current Thread="+Thread.currentThread().getName()+" value="+i);
				
			
				
				
				try {
					Thread.currentThread().sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}		
		
		
		
	}
	
	
	public static void main(String[] args) {
		ThreadUsingImplementsRunnable1 obj=new ThreadUsingImplementsRunnable1();
		Thread thread1=new Thread(obj);
		thread1.start();
		
		
		

	}

}
