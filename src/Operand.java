public class Operand extends Token{
    private int value;

    //Det her er vores værdi - hvis token foreksempel er '5' eller '6' så er det den her klasse

    public void accept(CalculatorVisitor visitor){
        super.accept(visitor);
        //set value lig med en værdi fra visitor stack

    }

    public int getValue(){
        return value;
    }


}
