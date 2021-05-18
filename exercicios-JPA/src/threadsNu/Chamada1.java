package threadsNu;

public class Chamada1 {
public static void main(String[] args) {
	
	Thread r = new Thread(new MeuRunable());
	
	Thread q = Thread.currentThread();
	System.out.println(q.getName());
	r.start();
	
	
	r.interrupt();
	System.out.println(!(r.isInterrupted()));
}
}
