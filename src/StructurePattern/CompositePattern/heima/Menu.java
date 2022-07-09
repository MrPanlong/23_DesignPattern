package StructurePattern.CompositePattern.heima;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Menu
 * @Author: panLong
 * @Description: 菜单类 树枝节点
 * @Date: 2022/6/11 13:34
 */

public class Menu extends MenuComponent{

    //菜单可以有多个子菜单或者子菜单项
    private List<MenuComponent> menuComponentList = new ArrayList<>();
    public Menu(String name,int level){
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(MenuComponent component){
        menuComponentList.add(component);
    }

    @Override
    public void remove(MenuComponent menuComponent){
        menuComponentList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuComponentList.get(index);
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);
        for (MenuComponent menuComponent : menuComponentList) {
            menuComponent.print();
        }
    }
}
