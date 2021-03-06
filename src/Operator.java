public class Operator extends Token {
    private Operation operation;

    //Det her er vores operation - hvis token foreksempel er '+' eller '-' så er det den her klasse

    public Operator(String i){
        switch(i) {
            case "PLUS":
                operation = operation.PLUS;
                break;
            case "MINUS":
                operation = operation.MINUS;
                break;
            case "GANGE":
                operation = operation.GANGE;
                break;
            case "DIVIDER":
                operation = operation.DIVIDER;
                break;
            default:
                System.out.println("Forkert input");
        }
    }

    public void accept(CalculatorVisitor visitor){
        super.accept(visitor);
        visitor.getResult();
        //set operation lig med en operation fra visitor stack
    }

    public Operation getOperation(){
        return operation;
    }

}
