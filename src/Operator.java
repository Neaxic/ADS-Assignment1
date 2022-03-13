public class Operator extends Token {
    private Operation operation;

    //Det her er vores operation - hvis token foreksempel er '+' eller '-' så er det den her klasse

    public void accept(CalculatorVisitor visitor){
        super.accept(visitor);
        visitor.getResult();
        //set operation lig med en operation fra visitor stack
    }

    public Operation getOperation(){
        return operation;
    }

}
