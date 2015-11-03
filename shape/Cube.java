/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author Patel
 */
public class Cube extends ThreeDimensionalShape{
    //1 dimensional constructor, inherits parent constructor
    public Cube(double length){
        super(length);
    }
    //Returns Surface Area, Overrides parent method
    @Override
    public double getArea(){
        return(length * length * 6);
    }
    //Returns Volume, Overrides parent method
    @Override
    public double getVolume(){
        return(length * length * length);
    }
    //Fomats the print of Cube, Overrides String
    @Override
    public String toString(){
        return String.format("Cube\nLength: %.2f", super.getLength());
    }    
}
