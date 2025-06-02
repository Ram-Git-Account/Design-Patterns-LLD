package Singleton;

public class SingletonMultithreaded_client {
    public static void main(String[] args) {
        SingletonMultithreaded s1 = SingletonMultithreaded.getInstance();
        SingletonMultithreaded s2 = SingletonMultithreaded.getInstance();
        /*By the singleton design only one object is get created the adress for both the variables are same.
         this statement is for verification */
    }
}
