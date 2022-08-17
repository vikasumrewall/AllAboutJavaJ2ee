package corejavacocept.thread.mainthread;

public class MainThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=9;
		int b=10;
		int c=a+b;
		Thread mainThread=Thread.currentThread();
		mainThread.setName("thread1");
		System.out.println("main Thread name="+mainThread.getName());

	}

}
