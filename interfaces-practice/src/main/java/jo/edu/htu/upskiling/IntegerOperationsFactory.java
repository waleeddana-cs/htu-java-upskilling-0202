package jo.edu.htu.upskiling;

public class IntegerOperationsFactory implements OperationsFactory<Integer> {
    // TODO you should implement this class
    @Override
    public Operation<Integer> summation() {
        return new Operation<Integer>() {
            IntegerOperationsFactory factory = new IntegerOperationsFactory();

            public Integer execute(Integer first, Integer second) {
                return first + second;
            }
        };

    }

    @Override
    public Operation<Integer> subtraction() {
        return (first, second) -> first-second;
    }

    @Override
    public Operation<Integer> multiplication() {
        return (first, second) -> first * second;
    }

    @Override
    public Operation<Integer> division() {
        divisionClass divisionClass= new divisionClass();
        return (first, second) -> divisionClass.divisionMethod(first,second);
    }

    class divisionClass {
        public int divisionMethod(int f, int s) {
            int i = f / s;
            return i;
        }

    }
}

