package creational.singleton;

class SingletonDoubleChecked extends Thread {
    private static volatile SingletonDoubleChecked obj = null;
    SingletonDoubleChecked() {}

    public static SingletonDoubleChecked getInstance()
    {
        if (obj == null) {
            // To make thread safe
            synchronized (SingletonDoubleChecked.class)
            {
                // check again as multiple threads can reach above step
                if (obj == null)
                    obj = new SingletonDoubleChecked();
            }
        }
        return obj;
    }
    
    @Override
    public void run() {
        SingletonDoubleChecked instance =
                SingletonDoubleChecked.getInstance();
        System.out.println("DoubleChecked instance hash: "
                + instance.hashCode());
    }
}
