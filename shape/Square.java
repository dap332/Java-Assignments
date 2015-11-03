/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *Child of TwoDimensionalShape
 * @author Patel
 */
public class Square extends TwoDimensionalShape{
    //1 dimensional constructor inherited from parent class
    public Square(double length){
        super(length);
    }
    //Returns area of square, overrides the inherited method
    @Override
    public double getArea(){
        return(length * length);
    }
    //formats print of the square uses overrides of String
    @Override
    public String toString(){
        return String.format("Square\nLength: %.2f", super.getLength());
    }
}

