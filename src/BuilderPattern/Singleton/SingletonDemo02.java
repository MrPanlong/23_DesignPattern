package BuilderPattern.Singleton;

//懒汉式
public class SingletonDemo02 {
    private static SingletonDemo02 instance = null;
    private SingletonDemo02(){}
    public static synchronized SingletonDemo02 getInstance(){
        if(instance == null){
            instance = new SingletonDemo02();
        }
        return instance;
    }

}