package Abstraction;

public class Truck extends Vehicle{
    private int wheels;
    private int tonnage;
    private int mpg;
    
    private int towingCapac;
    private boolean sleeperYN; 
    public Truck(int wheels, int tonnage, int mpg, int towingCapac, boolean sleeperYN){
        super(wheels, tonnage, mpg);
        this.towingCapac=towingCapac; this.sleeperYN=sleeperYN;
    }
}
