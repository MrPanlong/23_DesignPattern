package StructurePattern.CompositePattern.heima;

import java.util.ArrayList;
import java.util.List;

/**
 * 菜单组件 属于抽象跟节点
 * 共有属性
 */
public abstract class MenuComponent {
    //菜单组件名称 子类可以直接访问
    protected String name;
    //菜单组件的层级
    protected int level;

    //添加字菜单
    public void add(MenuComponent component){
        throw new UnsupportedOperationException();
    }
    //杀出子菜单
    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    //获取指定子菜单
    public MenuComponent getChild(int index){
        throw new UnsupportedOperationException();
    }

    public String getName(){
        return name;
    }

    public abstract void print();
}
