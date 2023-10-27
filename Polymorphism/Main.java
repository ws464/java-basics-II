package Polymorphism;

public class Main {
    public static void main(String[] args){
        Equation add,sub;
        sub = new Subtraction(7, 2);
        add = new Addition(4, 9);
        System.out.println(sub.calculate()+" "+add.calculate());
    }
}
