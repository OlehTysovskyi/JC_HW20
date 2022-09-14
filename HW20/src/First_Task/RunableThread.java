package First_Task;

import java.util.ArrayList;
import java.util.Scanner;


public class RunableThread implements Runnable{
	
	private int delay;
	public RunableThread(int delay) {
		super();
		this.delay = delay;
	}

	@Override
	public synchronized void run() {		
		Scanner scn = new Scanner(System.in);
		System.out.print("-Enter count of reverse fibonach numbers: ");
		int count = scn.nextInt();
		int[] list = new int[count];
		
		System.out.print("\n-Runable: ");
		if(count == 1) {
			System.out.println(0);
		}
		else if(count == 2) {
			System.out.print(0 + " ");
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(1);
		}
		else {
			list[0] = 0;
			list[1] = 1;
			for(int i=2; i<count; i++) {
				list[i] = list[i-1] + list[i-2];
			}
			for(int i=count-1; i>=0; i--){
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
