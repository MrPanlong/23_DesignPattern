package StructurePattern.proxypattern;

/**
 * @ author PanLong
 * @ since  2021-07-04 19:07
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("Test.jpg");

        //图像从磁盘中加载
        image.display();
        System.out.println(" ");
        //图形不需要从磁盘中加载
        image.display();
    }
}
