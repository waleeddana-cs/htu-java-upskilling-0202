package jo.edu.htu.upskiling;

public class IntegerOperationsFactory implements OperationsFactory<Integer> {
    // TODO you should implement this class
    Integer firstNum;
    Integer secondNum;

    @Override
    public Operation<Integer> summation() {
        return new Operation() {
            @Override
            public Integer execute(Object first, Object second) {
                return firstNum + secondNum;
            }
        };
    }

    @Override
    public Operation<Integer> subtraction() {
        return (firstNum1, secondNum1) -> firstNum1 - secondNum1;
    }

    @Override
    public Operation<Integer> multiplication() {
        return (f, s) -> firstNum * secondNum;
    }

    @Override
    public Operation<Integer> division() {
        return (f, s) -> firstNum / secondNum;
    }
}
