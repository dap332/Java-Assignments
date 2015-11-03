/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author Patel
 */
public class Tetrahedron extends ThreeDimensionalShape {
    //1 dimensional constructor, inherits parent constructor
    public Tetrahedron(double length){
        super(length);
    }
    //Returns Volume, Overrides parent method
    @Override
    public double getVolume(){
        return((Math.pow(length,3))/(6 * Math.sqrt(2)));
    }
    //Returns Surface Area, Overrides parent method    
    @Override
    public double getArea(){
        return(Math.sqrt(3) * Math.pow(length,2));
    }
    //Fomats the print of Tetrahedron, Overrides String
    @Override
    public String toString(){
        return String.format("Tetrahedron\nLength: %.2f", super.getLength());
    }
}
