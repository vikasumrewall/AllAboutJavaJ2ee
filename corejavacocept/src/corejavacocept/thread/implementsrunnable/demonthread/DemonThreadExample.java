package corejavacocept.thread.implementsrunnable.demonthread;

public class DemonThreadExample implements Runnable {

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
		DemonThreadExample obj=new DemonThreadExample();
		Thread t=new Thread(obj);
		t.setDaemon(true);//We need to setSemon true to make a thread  demon Thread.Demon thread is a supporting  thread  to other thread
		t.start();
	
	}

}
