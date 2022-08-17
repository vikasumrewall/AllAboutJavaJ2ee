package corejavacocept.thread.implementsrunnable.multiplethread.producerandconsumer;

public class Test {

	
	public static void main(String args[])
	{
		Company company =new Company();
		Producer prodThread =new Producer(company);
		Consumer consThread=new Consumer(company);
		prodThread.start();
		consThread.start();
		
	
	}
}
