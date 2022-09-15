package view;

import controller.ImprimirThreads;

public class Main{

	public class printThreads extends Thread {

		public static void main(String[] args) {
			for (int idT = 0 ; idT == 4 ; idT++) {
			Thread Imprimir = new ImprimirThreads();
			Imprimir.start();
			
			}

		}
	}
}
