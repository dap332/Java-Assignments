/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author Patel
 */
public class ShapesMain {
    public static void main(String [] args){
        //Creates one of each shape, with pre set dimensions
        Circle cir = new Circle(3);
        Square sq = new Square(3);
        Triangle tri = new Triangle(3,4);
        Sphere sphere = new Sphere(3);
        Cube cube = new Cube(3);
        Tetrahedron tetrahedron = new Tetrahedron(3);
        
        //Creates and Array of shapes and adds the shapes into the array
        Shape[] shapes = new Shape[6];
        
        shapes[0] = cir;
        shapes[1] = sq;
        shapes[2] = tri;
        shapes[3] = sphere;
        shapes[4] = cube;
        shapes[5] = tetrahedron;
        
        //Creates a 3 dimensional shape to use later to access getVolume by casting
        ThreeDimensionalShape threeD;
        
        //For loop goes through the array, checks to see if it is 3D and also prints 
        //Volume if it is 3D
        //Prints Area and Name
        for(int i = 0; i < shapes.length; i ++){
            System.out.println(shapes[i]);
            if(shapes[i] instanceof ThreeDimensionalShape){
                threeD = (ThreeDimensionalShape)shapes[i];
                System.out.println("Volume: " + threeD.getVolume());
            }
            System.out.println("Area: " + shapes[i].getArea());
            System.out.println();
        }
        
    }
}
