import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Current Count:" + counter.getCount());
		
		counter.increment();
		
		System.out.println("Current Count:" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("Current Count:" + counter.getCount());

		counter.increaseBy();
		
		System.out.println("Current count:" + counter.getCount());

		counter.decreaseBy();
		
		System.out.println("Current count:" + counter.getCount());

		counter.multiplyBy();
		
		System.out.println("Current count:" + counter.getCount());
		
	}

}
