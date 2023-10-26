package Abstraction;

import java.util.ArrayList;

public class Table implements Billable{

    private Integer width = 20;
    private Integer length = 10;
    private ArrayList<Leg> legs = new ArrayList<>();

    public Table(Integer numLegs) {
         for(int i = 0; i < numLegs; i++) {
             legs.add(new Leg(25));
        }
    }
    public Float getPrice(){
        return (float)1.00*width*length;
    }
    public String toString(){
        String ret="";
        ret+="Table with "+legs.size()+" legs of lengths:\n";
        for(Leg l : legs){
            ret+=l.legLength()+"\n";
        }
        return ret;
    }
}