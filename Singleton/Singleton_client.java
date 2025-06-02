package Singleton;

public class Singleton_client {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        Singleton s4 = Singleton.getInstance();
         /*By the singleton design only one object is get created the address for all the variables are same.
         this statement is for verification
         but this is not for mutli-Threaded environment */
    }
}
