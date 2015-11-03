/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *Child of TwoDimensionalShape
 * @author Patel
 */
public class Triangle extends TwoDimensionalShape {
    //2 dimensional constructor, inherits parent
    public Triangle(double length, double width){
        super(length,width);
    }
    //returns Area of triangle overrides the inherited method
    @Override
    public double getArea(){
        return(0.5 * length * width);
    }
    //Formats the print of Triangle, uses override
    @Override
    public String toString(){
        return String.format("Triangle\nHeight: %.2f\nBase: %.2f",
            super.getLength(), super.getWidth());
    }
}
