package jo.edu.htu.upskiling;

public class IntegerOperationsFactory implements OperationsFactory<Integer> {
    // TODO you should implement this class
    @Override
    public Operation<Integer> summation() {

        Operation<Integer> operation = new Operation<Integer>() {
            @Override
            public Integer execute(Integer first, Integer second) {
                return first+second;
            }
        };
        return operation;
    }


    @Override
    public Operation<Integer> subtraction() {
        Operation<Integer> operation = (first, second) -> first-second;
        return operation;
    }

    @Override
    public Operation<Integer> multiplication() {
        Operation<Integer> operation= (first, second) -> first*second;
        return operation;
    }

    @Override
    public Operation<Integer> division() {
        Operation<Integer>operation= (first, second) -> first/second;
        return operation;
    }
}
