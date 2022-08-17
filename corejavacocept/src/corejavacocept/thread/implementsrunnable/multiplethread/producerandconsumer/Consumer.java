package corejavacocept.thread.implementsrunnable.multiplethread.producerandconsumer;

public class Consumer extends Thread{
	
	Company c;
	
	Consumer(Company c)
	{
		this.c=c;
	}
	
	public void run()
	{
		int i=1;
		while(true)
		{
			
			try{
				this.c.consumeItem();
				Thread.sleep(2000);
				}catch(Exception e){}
			i++;
			
		}
	}

}
