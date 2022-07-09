package BehaviorPattern.observer.subject;

/**
 * @ author PanLong
 * @ since  2021-01-09 13:59
 */
public class ConCreateObserver implements Observer{
    @Override
    public void update() {
        System.out.println("收到消息，进行处理");
    }
}
