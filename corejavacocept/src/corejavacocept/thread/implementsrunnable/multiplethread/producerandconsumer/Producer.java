package corejavacocept.thread.implementsrunnable.multiplethread.producerandconsumer;

public class Producer extends Thread{
	
	Company c;
	
	Producer(Company c)
	{
		this.c=c;
	}
	
	public void run()
	{
		int i=1;
		while(true)
		{
			try {
				this.c.produceItem(i);
				Thread.sleep(1000);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			i++;
			
		}
	}

}
