package creational.singleton;

public class SingletonEagerInitialization {

	private static SingletonEagerInitialization obj = new SingletonEagerInitialization();

	private SingletonEagerInitialization() {
	}

	public static SingletonEagerInitialization getInstance() {
		return obj;
	}
}
