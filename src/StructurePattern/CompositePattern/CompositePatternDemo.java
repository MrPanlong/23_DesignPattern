package StructurePattern.CompositePattern;
//组合模式
/**
 * @ author PanLong
 * @ since  2021-07-04 16:59
 */
//我们有一个类 Employee，该类被当作组合模型类。
// CompositePatternDemo 类使用 Employee 类来添加部门层次结构，并打印所有员工。
public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee CEO = new Employee("John", "CEO", 30000);

        Employee headSale = new Employee("Robert", "Head Sale", 20000);
        Employee headMarketing = new Employee("Michal", "Head Marketing", 20000);

        Employee clerk1 = new Employee("Laura", "Marketing", 10000);
        Employee clerk2 = new Employee("Bob", "Marketing", 10000);

        Employee salesExecutives1 = new Employee("Richard", "Sales", 10000);
        Employee salesExecutives2 = new Employee("Rob", "Sales", 10000);

        CEO.add(headSale);
        CEO.add(headMarketing);

        headSale.add(salesExecutives1);
        headSale.add(salesExecutives2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        System.out.println("first rank: "+CEO);
        for(Employee headEmployee:CEO.getSubordinates()){
            System.out.println("second rank: "+headEmployee);
            for(Employee employee:headEmployee.getSubordinates()){
                System.out.println("third rank:"+employee);
            }
        }
    }
}
