import List.EmptyListException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    private Client client;
    @BeforeEach
    void setUp()
    {
        client = new Client();
    }

    @Test
    void evaluateOneOperationExpression() throws EmptyListException, MalformedExpressionException {
        ArrayList<Token> expression = new ArrayList<>();
        Operator operator = new Operator("MINUS");
        Operand operand1 = new Operand(1);
        Operand operand2 = new Operand(4);
        expression.add(operand1);
        expression.add(operand2);
        expression.add(operator);

        assertEquals(-3,client.evaluateExpression(expression));
    }

    @Test
    void evaluateMultipleOperationExpression() throws EmptyListException, MalformedExpressionException {
        ArrayList<Token> expression = new ArrayList<>();
        Operator operator = new Operator("PLUS");
        Operand operand1 = new Operand(13);
        Operand operand2 = new Operand(45);
        expression.add(operand1);
        expression.add(operand2);
        Operand operand3 = new Operand(28);
        expression.add(operand3);
        expression.add(operator);
        Operator operator2 = new Operator("MINUS");
        expression.add(operator2);
        assertEquals(-60,client.evaluateExpression(expression));
    }
}