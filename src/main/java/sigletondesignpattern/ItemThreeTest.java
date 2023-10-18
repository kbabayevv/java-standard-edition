package sigletondesignpattern;

public class ItemThreeTest {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {

                }
                System.out.println("Hashcode of Lazy: " + LazyCache.getInstance().hashCode());
                System.out.println("Hashcode of Eager: " + EagerCache.getInstance().hashCode());
                System.out.println("Hashcode of Enum: " + CacheSingleton.INSTANCE.hashCode());//best practice
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hashcode of Lazy: " + LazyCache.getInstance().hashCode());
                System.out.println("Hashcode of Eager: " + EagerCache.getInstance().hashCode());
                System.out.println("Hashcode of Enum: " + CacheSingleton.INSTANCE.hashCode());
            }
        }).start();
    }
}
