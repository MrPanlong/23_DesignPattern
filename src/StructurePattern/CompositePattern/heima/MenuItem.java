package StructurePattern.CompositePattern.heima;

/**
 * @ClassName: MenuItem
 * @Date: 2022/6/11 14:43
 * @Author: panLong
 * @Description: TODO
 */

public class MenuItem extends MenuComponent{
    public MenuItem(String name,int level){
        this.name = name;
        this.level = level;
    }
    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);
    }
}
