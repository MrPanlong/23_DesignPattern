package BehaviorPattern.observer.observer;

/**
 * @ author PanLong
 * @ since  2021-01-09 14:16
 */
/*具体实现者*/
public class WeiXinUser implements Observer{
    //微信用户名
    private String name;

    public WeiXinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "----"+message);
    }
}
