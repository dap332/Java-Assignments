/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *Child of Shape
 * Parent of Cube, Sphere, Tetrahedron
 * @author Patel
 */
public abstract class ThreeDimensionalShape extends Shape{
    //Double depth is the third dimension
    double depth;
    //Basic Constructor where all dimensions are 0
    public ThreeDimensionalShape(){
        super();
        depth = 0;
    }
    //1 dimensional constructor, inherits parent constructor
    public ThreeDimensionalShape(double length){
        super(length);
    }
    //2 dimensional constructor, inherits parent constructor
    public ThreeDimensionalShape(double length,double width){
        super(length,width);
        depth = 0;
    }
    //3 dimesnional onstructor, inherits parents constructor
    public ThreeDimensionalShape(double length, double width, double depth){
        super(length,width);
        setDepth(depth);
    }
    //Sets Depth, makes sure inputs is atleast 0
    public void setDepth(double depth){
        if(depth < 0){
            depth = 0;
        }
        else{
            this.depth = depth;
        }
    }
    //Abstract class to be inherited by child
    public abstract double getVolume();
}
