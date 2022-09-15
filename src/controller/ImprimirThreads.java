package controller;

public class ImprimirThreads extends Thread {

	public void run() {
		System.out.print("Thread id: " + this.getId());
	}
	
}