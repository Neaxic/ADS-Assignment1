public class Operand extends Token{

    private int value;

    public Operand(int number){
        value = number;
    }

    public void accept(CalculatorVisitor visitor){
        super.accept(visitor);
        //set value lig med en værdi fra visitor stack
    }

    public int getValue(){
        return value;
    }


}
