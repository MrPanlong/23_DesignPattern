package BuilderPattern.StrategyPattern;

/**
 * @ author PanLong
 * @ since  2021-07-11 23:08
 */
public class OperationAdd implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1+num2;
    }
}
