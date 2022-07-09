package BehaviorPattern.observer.subject;

/**
 * @ author PanLong
 * @ since  2021-01-09 13:57
 */
public class ConCreateSubject extends Subject{
    //具体业务
    public void doSomeThing(){
        super.notifyObserver();
    }
}
