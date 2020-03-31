package jo.edu.htu.upskiling;

public class Calculator<OPERAND> {

    private final OperationsFactory<OPERAND> operationsFactory;

    public Calculator(OperationsFactory<OPERAND> operationsFactory) {

        this.operationsFactory = operationsFactory;
    }

    public OPERAND sum(OPERAND first, OPERAND second) {
        Operation<OPERAND> operation = operationsFactory.summation();
        return operation.execute(first, second);

    }

    public OPERAND subtract(OPERAND operand1, OPERAND operand2) {
        Operation<OPERAND> sub = operationsFactory.subtraction();
        return sub.execute(operand1, operand2);
    }

    public OPERAND multiply(OPERAND operand1, OPERAND operand2) {

        Operation<OPERAND> mul = operationsFactory.multiplication();
        return mul.execute(operand1, operand2);
    }

    public OPERAND divide(OPERAND first, OPERAND second) {

        Operation<OPERAND> div = operationsFactory.division();
        // if ((Integer)second==0){
        //     throw new ArithmeticException("/ by zero");
        // }
        return div.execute(first, second);
    }
}
