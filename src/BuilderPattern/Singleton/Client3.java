package BuilderPattern.Singleton;

import java.util.concurrent.CountDownLatch;

/**
 * 效率：在多线程环境下
 */
public class Client3 {
    public static void main(String[] args) throws Exception{
        long start = System.currentTimeMillis();
        int threadNum = 10;
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);
        for(int i=0;i<10;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int i=0;i<100000;i++){
                        Object o =SingletonDemo02.getInstance();
                    }
                    countDownLatch.countDown();
                }
            }).start();
        }
        countDownLatch.await();//main线程阻塞，直到计数器变为0


        long end  =System.currentTimeMillis();
        System.out.println("共消耗"+(end  - start)+"ms");


    }

}