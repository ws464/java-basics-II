package Abstraction;

public class Car extends Vehicle{
    private int wheels;
    private int tonnage;
    private int mpg;
    
    private int safetyRating;
    private int legroom;

    public Car(int wheels, int tonnage, int mpg, int safetyRating, int legroom){
        super(wheels,tonnage,mpg); this.safetyRating=safetyRating; this.legroom=legroom; 
    }
}
