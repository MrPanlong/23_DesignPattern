package BehaviorPattern.observer.observer;

/**
 * @ author PanLong
 * @ since  2021-01-09 15:09
 */
public class Client {
    public static void main(String[] args) {
        Subject subscriptionSubject = new SubscriptionSubject();
        //创建微信用户
        WeiXinUser user1 = new WeiXinUser("java");
        WeiXinUser user2 = new WeiXinUser("scala");
        //订阅公众号
        subscriptionSubject.attach(user1);
        subscriptionSubject.attach(user2);
        //公众号更新发出消息给订阅的微信用户
        subscriptionSubject.notify("java 更新了专栏");
    }
}
