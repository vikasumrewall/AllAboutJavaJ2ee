package corejavacocept.thread.implementsrunnable.multiplethread;

public class Test {

	public static void main(String[] args) {
		
		ThreadUsingImplementsRunnable1 obj=new ThreadUsingImplementsRunnable1();
		Thread thread1=new Thread(obj);
		thread1.start();
		
		ThreadUsingImplementsRunnable2 obj2=new ThreadUsingImplementsRunnable2();
		Thread thread2=new Thread(obj2);
		thread2.start();

	}

}
