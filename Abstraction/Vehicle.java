package Abstraction;

abstract class Vehicle {
    private int wheels;
    private int tonnage;
    private int mpg;
    public Vehicle(int wheels, int tonnage, int mpg){
        this.wheels=wheels; this.tonnage=tonnage; this.mpg=mpg;
    }
}
