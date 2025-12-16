package creational.singleton;

public class SingletonLazyInitialization {

	private static SingletonLazyInitialization obj;
	
	private SingletonLazyInitialization() {
		
	}
	
	public static SingletonLazyInitialization getInstance() {
		if(obj==null) {
			obj = new SingletonLazyInitialization();
		}
		return obj;
	}
}
