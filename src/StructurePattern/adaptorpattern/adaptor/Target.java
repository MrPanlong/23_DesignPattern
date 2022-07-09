package StructurePattern.adaptorpattern.adaptor;
/*Sun公司推出JDBC JDBC给出了客户端通用的抽象接口  每个具体的数据库引擎JDBC驱动都是介于JDBC驱动和数据库引擎之间的适配器
* spring AOP Advice BeforeAdvice AfterAdvice ThrowsAdvice 这三种通知都是借助适配器模式实现*/
public interface Target {
    void request();
}
