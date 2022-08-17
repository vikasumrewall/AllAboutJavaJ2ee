package corejavacocept.thread.threadclass;

public class ThreadUsingExtendsThread  extends Thread{
	
	public void run()
	{
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
		ThreadUsingExtendsThread threadExample=new ThreadUsingExtendsThread();
		threadExample.start();

	}

}
