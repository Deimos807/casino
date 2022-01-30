package assignment4_000828420;
import java.util.Random;
/**
 * Gavin Lisi
 *  14/06/2021
 *  Wheel object class
 */
public class Wheel {
    private final String[] faces;
    private String currentFace;

    public Wheel(String[] faces){
        this.faces = faces;
    }


    /**
     * Method to spin each individual wheel on a slot machine
     */
    public void spinWheel(){
        Random spin = new Random();
        int numOfFaces = 8;
        int number = spin.nextInt(numOfFaces); // Picks a index number for a face on the wheel
        currentFace = faces[number]; // Stores string object in variable to display to user
    }

    /**
     * Getter for the current face the wheel is showing
     * @return current face the wheel is displaying
     */

    public String getCurrentFace(){
        return currentFace;
    }


    /**
     * ToString method
     * @return
     */
    @Override
    public String toString() {
        return  currentFace;
    }
}