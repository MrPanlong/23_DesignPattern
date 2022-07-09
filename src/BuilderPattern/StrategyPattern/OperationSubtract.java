package BuilderPattern.StrategyPattern;

/**
 * @ author PanLong
 * @ since  2021-07-11 23:09
 */
public class OperationSubtract implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
