package First_Task;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		MyThread mt = new MyThread(1000);
		mt.start();
		mt.join();
		
		RunableThread rt = new RunableThread(1000);
		Thread t = new Thread(rt);
		t.run();	
	}
}
