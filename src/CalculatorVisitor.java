import List.LinkedStack;

public class CalculatorVisitor implements Visitor, Calculator {
    private LinkedStack<Token> tokenStack;

    private void pushOperand(Operand operand){
        tokenStack.push(operand);
    }

    private void performOperation(Operand operand) throws MalformedExpressionException {
        int result;
        //udregn operation fra stack
        tokenStack.pop();

        operand.getValue(); // fx: +, -, *, /
    }

    @Override
    public void visit(Operand operand) {
        pushOperand(operand);
    }

    @Override
    public void visit(Operator operator) {

    }

    @Override
    public int getResult() {
        return 0;
    }
}
