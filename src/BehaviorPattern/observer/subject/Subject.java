package BehaviorPattern.observer.subject;

import java.util.Vector;

/**
 * @ author PanLong
 * @ since  2021-01-09 13:53
 */
//主题 subject
    //首先定义一个观察者  增删通知操作
public class Subject {
    //观察者数组
    private Vector<Observer> oVector = new Vector<>();
    //增加一个观察者
    public void addObserver(Observer observer){
        this.oVector.add(observer);
    }
    //删除一个观察者
    public void deleteObserver(Observer observer){
        this.oVector.remove(observer);
    }
    //通过所有观察者
    public void notifyObserver(){
        for (Observer observer : this.oVector) {
            observer.update();
        }
    }
}
