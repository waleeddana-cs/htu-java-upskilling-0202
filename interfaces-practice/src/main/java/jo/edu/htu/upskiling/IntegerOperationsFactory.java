package jo.edu.htu.upskiling;

public class IntegerOperationsFactory implements OperationsFactory<Integer> {
    // TODO you should implement this class
    @Override
    public Operation<Integer> summation() {
        return new Operation<Integer>() {
            @Override
            public Integer execute(Integer first, Integer second) {
                return first + second;
            }
        };
    }

    @Override
    public Operation<Integer> subtraction() {
        return new Subtraction();
    }

    @Override
    public Operation<Integer> multiplication() {
        return (first, second) -> first * second;

    }

    @Override
    public Operation<Integer> division() {
        return new Division();
    }

    private class Division implements Operation<Integer> {

        @Override
        public Integer execute(Integer first, Integer second) {
            return first / second;
        }
    }
}

class Subtraction implements Operation<Integer> {

    @Override
    public Integer execute(Integer first, Integer second) {
        return first - second;
    }
}
