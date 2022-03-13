import java.util.ArrayList;

public class Client {

    private CalculatorVisitor calculatorVisitor;

public Client(){
    calculatorVisitor = new CalculatorVisitor();
}

    public int evaluateExpression(ArrayList<Token> tokenList) throws MalformedExpressionException {
        for (Token token:tokenList)
        {
        if (token instanceof Operator){
            calculatorVisitor.visit((Operator) token);
        } else {
            calculatorVisitor.visit((Operand) token);
            }
        }
        return calculatorVisitor.getResult();
    }

}
