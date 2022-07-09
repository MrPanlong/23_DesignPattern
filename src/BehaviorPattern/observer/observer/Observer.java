package BehaviorPattern.observer.observer;

/**
 * @ author PanLong
 * @ since  2021-01-09 14:15
 */
/*抽象观察者*/
// 里面定义了一个更新的方法
public interface Observer {
    public void update(String message);
}
