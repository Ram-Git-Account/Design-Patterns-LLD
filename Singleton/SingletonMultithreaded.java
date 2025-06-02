package Singleton;

public class SingletonMultithreaded {

    private static SingletonMultithreaded instance;
    private SingletonMultithreaded(){

    }

    public static SingletonMultithreaded getInstance(){
        if(instance == null){
            synchronized (SingletonMultithreaded.class){ // we can't use this in synchronized because sattic is a class level so need to mention .class in synchronized block.
                if(instance == null){
                    instance = new SingletonMultithreaded();
                }
            }
        }
        return  instance;
    }
}
