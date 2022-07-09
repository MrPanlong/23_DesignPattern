package BehaviorPattern.observer.subject;

/**
 * @ author PanLong
 * @ since  2021-01-09 13:59
 */
public class Client {
    public static void main(String[] args) {
        //创建一个主题
        ConCreateSubject subject = new ConCreateSubject();
        //定义一个观察者
        ConCreateObserver observer = new ConCreateObserver();
        //观察
        subject.addObserver(observer);
        //开始活动
        subject.doSomeThing();

    }
}
