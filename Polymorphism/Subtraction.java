package Polymorphism;

public class Subtraction extends Equation{
    private int num1,num2;
    public Subtraction(int num1, int num2){
        this.num1=num1; this.num2=num2;
    }
    @Override
    public int calculate(){
        return this.num1-this.num2;
    }
}
