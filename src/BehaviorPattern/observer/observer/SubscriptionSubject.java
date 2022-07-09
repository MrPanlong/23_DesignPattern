package BehaviorPattern.observer.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @ author PanLong
 * @ since  2021-01-09 14:20
 */
public class SubscriptionSubject implements Subject {
    //存储订阅微信公众号的微信的用户
    private List<Observer> weiXinUserList = new ArrayList<>();
    @Override
    public void attach(Observer observer) {
        weiXinUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weiXinUserList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : weiXinUserList) {
            observer.update(message);
        }
    }
}
