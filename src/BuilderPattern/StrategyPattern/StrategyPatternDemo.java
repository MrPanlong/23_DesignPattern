package BuilderPattern.StrategyPattern;

/**
 * @ author PanLong
 * @ since  2021-07-11 23:13
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = "+ context.executeStrategy(10,5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = "+ context.executeStrategy(10,5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10,5));
    }
}
