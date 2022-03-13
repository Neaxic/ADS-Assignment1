public abstract class Token {
    private CalculatorVisitor visitor;

    //Tror det her er vores værdi, ie. det kunne være '7' '5' '+' eller whatever, det er de inviduelle tegn fra vores list

    public void accept(CalculatorVisitor visitor){
        this.visitor = visitor;
    }
}
