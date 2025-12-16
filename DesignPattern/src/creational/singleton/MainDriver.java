package creational.singleton;

public class MainDriver {
	
	public static void main(String[] args) {
		System.out.println("---- Singleton Instance Created ----");
		
		Singleton singleton1 = Singleton.getInstance();
		singleton1.doSomething();
		System.out.println(singleton1.hashCode());
		Singleton singleton2 = Singleton.getInstance();
		singleton2.doSomething();
		System.out.println(singleton2.hashCode());
		
		
		
		System.out.println("---- Double Checked Locking Singleton ----");

        for (int i = 0; i < 5; i++) {
            Thread t = new SingletonDoubleChecked();
            t.start();
        }

        // Small delay for clean output
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n---- Thread Safe Singleton ----");

        for (int i = 0; i < 5; i++) {
            Thread t = new SingletonThreadSafe();
            t.start();
        }
		
	}

}
