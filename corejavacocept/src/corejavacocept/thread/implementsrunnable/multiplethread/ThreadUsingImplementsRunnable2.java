package corejavacocept.thread.implementsrunnable.multiplethread;

public class ThreadUsingImplementsRunnable2  implements Runnable{

	@Override
	public void run() {
		
		
			for(int i=9;i<10;i--)
			{
				
				System.out.println("Thread Id="+Thread.currentThread().getId()+"Current Thread="+Thread.currentThread().getName()+" value="+i);
				
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}		
		
		
		
	}
	
	
	

}
