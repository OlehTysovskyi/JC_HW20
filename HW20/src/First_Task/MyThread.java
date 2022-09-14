package First_Task;

import java.util.Scanner;

public class MyThread extends Thread{
	
	private int delay;
	public MyThread(int delay) {
		super();
		this.delay = delay;
	}

	@Override
	public synchronized void run(){
		int previousNum, Num, nextNum;
		Scanner scn = new Scanner(System.in);
		System.out.print("-Enter count of fibonachi numbers: ");
		int count = scn.nextInt();
		int[] list = new int[count];
		
		System.out.print("-Thread: ");
		if(count == 1) {
			Num = 0;
			System.out.println(Num);
		}
		else if(count == 2) {
			Num = 0;
			for(int i=0; i<count; i++) {
				System.out.print(Num + " ");
				Num++;
				try {
					Thread.sleep(delay);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		else {
			list[0] = 0;
			list[1] = 1;
			for(int i=2; i<count; i++) {
				list[i] = list[i-1] + list[i-2];
			}
			for(int i=0; i<count; i++){
				System.out.print(list[i] + " ");
				try {
					Thread.sleep(delay);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
