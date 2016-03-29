package ships;

import java.util.concurrent.*;

public class Main {
	public static void main(String[] args) {
		System.out.println("Start uploading");
		
		ExecutorService ex = Executors.newFixedThreadPool(2);

		ex.execute(new SingleThread(new Ship(11, "Victoria")));
		ex.execute(new SingleThread(new Ship(10, "Elza")));
		ex.execute(new SingleThread(new Ship(12, "Aurora")));

		ex.shutdown();
		System.out.println("Finish uploading");
	}
}
