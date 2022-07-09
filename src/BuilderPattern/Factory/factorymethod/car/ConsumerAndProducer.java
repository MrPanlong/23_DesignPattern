package BuilderPattern.Factory.factorymethod.car;
/**
 * 使用wait方法和notify方法实现生产者和消费者
 * 1.什么是生产者和消费者模式
 *  生产线程负责生产，消费线程负责消费
 *  生产线程和消费线程要达到均衡
 *  这是一种特殊的业务需求 在这种特殊的情况下时要使用wait 和  notify 方法
 *
 * 2.wait和notify方法不是线程对象的方法  是普通java对象都有的方法
 *
 * 3.wait和notify方法是建立在同步的基础上 因为多线程操作一个仓库，会有线程安全问题
 *
 * 4.wait方法作用：o.wait() 让正在o对象活动的线程t进入等待状态，并且释放t线程之前占有o对象的锁
 *
 * 5.notify方法作用：让正在o对象上等待的线程唤醒 只是通知，不会释放o对象上之前占有的锁
 */
//List集合  仓库只能存放一个元素，如果仓库空就代表仓库空了

import java.util.ArrayList;
import java.util.List;

/**
 * @ author PanLong
 * @ since  2021-01-06 20:39
 */
public class ConsumerAndProducer {
    public static void main(String[] args) {
        Integer integer = new Integer(0);
        Thread t1 = new Thread(new Producer(integer));
        Thread t2 = new Thread(new Consumer(integer));

        t1.start();
        t2.start();

    }
}

class Producer implements Runnable{
    private Integer integer = 0;
    public Producer(Integer integer){
        this.integer = integer;
    }
    @Override
    public void run() {
        while (integer <= 100){
            synchronized (this){
                if(integer %2 == 0){//说明仓库已经有一个元素
                    try {
                        //当前线程进入等待状态  并且释放producer之前占有的list集合的锁
                        integer.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(Thread.currentThread().getName()+"---->"+integer++);
                integer.notifyAll();
            }
        }
    }
}

class Consumer implements Runnable {
    private Integer integer;
    public Consumer(Integer integer){
        this.integer = integer;
    }
    @Override
    public void run() {
        while (integer<=100){
            synchronized (this){
                if(integer %2 == 1){
                    //仓库空
                    try {
                        integer.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //程序能够执行到此处 仓库有数据  进行消费

                System.out.println(Thread.currentThread().getName()+"---->"+integer++);
                //幻形生产者生产
                integer.notifyAll();
            }
        }
    }
}
