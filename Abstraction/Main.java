package Abstraction;

public class Main {
    public static void main(String[] args) {
        var myTable = new Table(4);
        System.out.println(myTable);
        System.out.println("Price: "+myTable.getPrice());
    }
}
