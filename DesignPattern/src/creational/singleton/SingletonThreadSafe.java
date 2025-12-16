package creational.singleton;

public class SingletonThreadSafe extends Thread{
	
	private static SingletonThreadSafe obj;
	SingletonThreadSafe() {
		
	}
	
	public static synchronized  SingletonThreadSafe getInstance() {
		if(obj==null) {
			obj=new SingletonThreadSafe();
		}
		return obj;
	}
	
	@Override
    public void run() {
        SingletonThreadSafe instance =
                SingletonThreadSafe.getInstance();
        System.out.println("ThreadSafe instance hash: "
                + instance.hashCode());
    }

}
