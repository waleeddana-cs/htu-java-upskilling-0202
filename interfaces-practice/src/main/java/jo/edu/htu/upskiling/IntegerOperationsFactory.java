package jo.edu.htu.upskiling;

public class IntegerOperationsFactory implements OperationsFactory<Integer> {

    // TODO you should implement this class
    @Override
    public Operation<Integer> summation() {
        return (first, second) -> first + second;
    }

    @Override
    public Operation<Integer> subtraction() {
        return (first, second) -> first - second;
    }

    @Override
    public Operation<Integer> multiplication() {
        return (first, second) -> first * second;
    }

    @Override
    public Operation<Integer> division() {
        return (first, second) -> first / second;
    }

}