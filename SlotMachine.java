package assignment4_000828420;

import java.util.Arrays;
/**
 * Gavin Lisi 
 *  14/06/2021
 *  Slot machine object class
 */
public class SlotMachine {

    private final int numOfWheels;
    private final Wheel[] CasinoWheelArray; // Array of wheel objects


    /**
     * Slot machine constructor
     * @param content The picture of eacg individual face 
     * @param numOfWheels The number of wheels the slot machine has
     */
    public SlotMachine(String[] content, int numOfWheels) {
        this.numOfWheels = numOfWheels;
        CasinoWheelArray = new Wheel[numOfWheels];

        for (int i = 0; i < numOfWheels; i++) {  // For loop to go through every index of objects stored in an array
            CasinoWheelArray[i] = new Wheel(content);
        }
    }

    /**
     * Method to spin all wheels on a slot machine
     */
    public void SlotMachineSpin() {
        for (int i = 0; i < numOfWheels; i++) { // For loop to go through every index of objects stored in an array
            CasinoWheelArray[i].spinWheel();
        }
    }

    /**
     * Method to check if the faces on the spun wheels match eachother
     * @return
     */
    public int check()
    {
        int maxCount = 0;
        for (int i = 0; i < CasinoWheelArray.length; i++) {
            int count = 0;
            for (int j = i + 1; j < CasinoWheelArray.length; j++) {
                if (CasinoWheelArray[i].getCurrentFace().equals(CasinoWheelArray[j].getCurrentFace())) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
            }
        }
        return maxCount;
    }

    /**
     * Histogram method available to user
     */
    public void Histogram(){
        int[] histogram = new int[numOfWheels];
        for (int i = 0; i < 1_000_000; i++) {
            SlotMachineSpin();
            int payout = check();
            histogram[payout]++;
        }
        for (int i = 2; i < numOfWheels; i++) {
            if (i<0)
                System.out.print(" ");
            System.out.println(i + ": " + histogram[i]);
        }
    }

    /**
     * ToString method
     * @return Output for the slot machine type, output and reward
     */
    @Override
    public String toString() {
        return "numOfWheels = " + numOfWheels + " Slot Machine output = " + Arrays.toString(CasinoWheelArray) + "You won " + check() + " point(s)";
    }
}