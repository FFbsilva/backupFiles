package threadsNu;

public class MeuRunable implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	
	

	
}
