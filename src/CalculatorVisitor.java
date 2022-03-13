import List.LinkedStack;

public class CalculatorVisitor implements Visitor, Calculator {

    int result;
    private LinkedStack<Token> tokenStack = new LinkedStack<Token>();

    private void pushOperand(Operand operand){
        tokenStack.push(operand);
    }

    private void performOperation(Operator operator) throws MalformedExpressionException {
        int a = 0;
        int b = 0;

            if(!tokenStack.IsEmpty()){
                b = ((Operand) tokenStack.pop()).getValue();
                a = ((Operand) tokenStack.pop()).getValue();
                System.out.println(b);
            } else {
                b = 0;
            }

        switch (operator.getOperation()){
            case PLUS -> result = a + b;
            case MINUS -> result = a - b;
            case GANGE -> result = a * b;
            case DIVIDER -> result = a / b;
            default -> throw new IllegalStateException("Unexpected value: " + operator.getOperation());
        }


        System.out.println(result);
        tokenStack.push(new Operand(result));
    }



    @Override
    public void visit(Operand operand) {
        pushOperand(operand);
    }

    @Override
    public void visit(Operator operator) throws MalformedExpressionException {
        performOperation(operator);
    }

    @Override
    public int getResult() {
        return result;
    }
}
