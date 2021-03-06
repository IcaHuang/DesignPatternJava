package creationalpatterns;

public class Singleton {
    // lazy construction
    // the class variable is null if no instance is instantiated
    private static Singleton uniqueInstance = null;

    private int count;
    private Singleton() {
        count = 1;
    }
    public int getCount() {
        return count;
    }
    public void addCount() {
        count++;
    }

    // lazy construction of the instance
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public static void main(String[] args) {
        Singleton singletonInstance1 = Singleton.getInstance();
        // Output: 1
        System.out.println(singletonInstance1.getCount());
        Singleton singletonInstance2 = Singleton.getInstance();
        singletonInstance2.addCount();

        // Output: 2
        // Also call getCount() from Instance1.
        // Though add one to count by calling Instance2 method, but the count in Instance1 add one, too.
        // It means that instance1 and instance2 related to the same instance.
        // It means that the SIngleton Pattern works.
        System.out.println(singletonInstance1.getCount());
    }
}
