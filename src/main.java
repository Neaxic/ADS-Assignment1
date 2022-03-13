import List.LinkedStack;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws MalformedExpressionException {
        Client c = new Client();
        Token tal1 = new Operand(10);
        Token tal2 = new Operand(2);
        Token plustoken = new Operator("DIVIDER");

        ArrayList<Token> tokenlist = new ArrayList<>();
        tokenlist.add(tal1);
        tokenlist.add(tal2);
        tokenlist.add(plustoken);
        LinkedStack<Token> stack = new LinkedStack<Token>();
        System.out.println("Main input: "+stack);

        c.evaluateExpression(tokenlist);
    }
}
