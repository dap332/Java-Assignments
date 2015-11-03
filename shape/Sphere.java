/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author Patel
 */
public class Sphere extends ThreeDimensionalShape{
    //1 dimensional constructor, inherits parent constructor
    public Sphere(double length){
        super(length);
    }
    //Returns Volume, Overrides parent method
    @Override
    public double getVolume(){
        return((4/3) * Math.PI * Math.pow(length,3));
    }
    //Returns Surface Area, Overrides parent method
    @Override
    public double getArea(){
        return(4 * Math.PI * Math.pow(length, 2));
    }
    //Fomats the print of Sphere, Overrides String
    @Override
    public String toString(){
        return String.format("Sphere\nRadius: %.2f", super.getLength());
    }
}
