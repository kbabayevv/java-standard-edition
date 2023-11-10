package creational.singleton;

public final class SingletonClass {
    private static SingletonClass singletonClass;//lazy loading

    private SingletonClass() {

    }

    public static SingletonClass getInstance() {
        //Double checked locking
        if (singletonClass == null) {
            synchronized (SingletonClass.class) {
                if (singletonClass == null) {
                    singletonClass = new SingletonClass();
                }
            }
        }
        return singletonClass;
    }
}
