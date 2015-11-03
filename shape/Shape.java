/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 * GrandParent Class
 *
 * @author Patel
 */
public abstract class Shape {
    //doubles widht and length inherited by all other classes
     double length;
     double width;
    
    //Basic Constructor has dimensions of 0
    public Shape(){
         length = 0;
         width = 0;
    }
    //Constructor with 1 dimensional parameter
    public Shape(double length){
        setLength(length);
    }
    //Constructor with 2 dimensional parameter
    public Shape(double length, double width){
        setLength(length);
        setWidth(width);
    }
    //Sets length of the length
    public void setLength(double length){
        if(length < 0){
            length = 0;
        }
        else{
            this.length = length;
        }
    }
    //sets width of the width
    public void setWidth(double width){
        if(width < 0){
            width = 0;
        }
        else{
            this.width = width;
        }   
    }
    //returns length
    public double getLength(){
        return length;
    }
    //returns width
    public double getWidth(){
        return width;
    }
    //returns area
    public abstract double getArea();
    
}

