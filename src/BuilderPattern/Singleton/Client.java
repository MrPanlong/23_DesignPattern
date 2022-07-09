package BuilderPattern.Singleton;

/**
 * 单例对象 占用资源少，不需要 延时加载
 * 枚举类 好于 饿汉式
 *
 * 单例对象 占用资源大 需要延时加载
 * 静态内部类 好于 懒汉式
 */

/**
 *
 *单一职责原则 接口隔离原则 依赖倒转原则
 * 里氏替换原则 开闭原则 迪米特法则
 * 合成复用原则
 */
public class Client {
    public static void main(String[] args) {
        SingletonDemo01 s1 = SingletonDemo01.getInstance();
        SingletonDemo01 s2 = SingletonDemo01.getInstance();
        System.out.println("单例模式01："+(s1 == s2));

        SingletonDemo02 s3 = SingletonDemo02.getInstance();
        SingletonDemo02 s4 = SingletonDemo02.getInstance();
        System.out.println("单例模式02："+(s3 == s4));

        SingletonDemo04 s5 = SingletonDemo04.getInstance();
        SingletonDemo04 s6 = SingletonDemo04.getInstance();
        System.out.println("单例模式01："+(s5 == s6));

        SingletonDemo05 s7 = SingletonDemo05.INSTANCE;
        SingletonDemo05 s8 = SingletonDemo05.INSTANCE;
        System.out.println("单例模式01："+(s7 == s8));
    }
}
