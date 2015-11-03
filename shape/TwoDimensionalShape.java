/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 * Child of Shape
 *Parent Class of Square Circle and Triangle
 * @author Patel
 */
public abstract class TwoDimensionalShape extends Shape{
    //Basic constructor with dimensions of 0 inherited from parent
    public TwoDimensionalShape(){
        super();
    }
    //Basic constructor with 1 dimensional parameter inherited from parent
    public TwoDimensionalShape(double length){
        super(length);
    }
    //Basic constructor with 2 dimensional parameter inherited from parent
    public TwoDimensionalShape(double length, double width){
        super(length,width);
    }
}
