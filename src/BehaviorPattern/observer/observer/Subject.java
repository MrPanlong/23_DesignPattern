package BehaviorPattern.observer.observer;

/**
 * @ author PanLong
 * @ since  2021-01-09 14:17
 *//*抽象被观察者*/
public interface Subject {
    public void attach(Observer observer);
    public void detach(Observer observer);
    public void notify(String message);
}
