/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pig;

/**
 *
 * @author Patel
 */
public class Dice {
    int x;
   
    /*
     * Costructor for created object Dice no parameters
     */
    public Dice(){
        
    }
    //Method selects a random integer from 1  through 6
    public void roll(){
        x = (int) (Math.random() * 6) + 1;
    }
    /*
     * returns the randome integer
     */
    public int get(){
        return x;
    }
}
