/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *Child of TwoDimensionalParent
 * @author Patel
 */
public class Circle extends TwoDimensionalShape {
        //1 dimensional Constructor, inherits parent class
        public Circle(double length){
            super(length);
        }
        //returns are of Circle, overrides inherited method
        @Override
        public double getArea(){
            return(Math.PI * length);
        }
        //Formats print, overrides String
            @Override
    public String toString(){
        return String.format("Circle\nRadius: %.2f", super.getLength());
            }
}
