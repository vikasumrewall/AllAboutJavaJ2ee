package corejavacocept.thread.implementsrunnable.multiplethread.producerandconsumer;

public class Company {

	int n;
	boolean f = false;

	synchronized public void produceItem(int n) throws Exception {
		
		if (f) {
		
			wait();
		
		}
		
			this.n = n;
			System.out.println("Produced:" + n);
			f=true;
			notify();
		
	}

	synchronized public int consumeItem() throws Exception {
		if (!f) {
		
				Thread.currentThread().wait();
			
		}
		
		System.out.println("Consumed:" + n);
		f=false;
		Thread.currentThread().notify();
		return this.n;

	}

}
