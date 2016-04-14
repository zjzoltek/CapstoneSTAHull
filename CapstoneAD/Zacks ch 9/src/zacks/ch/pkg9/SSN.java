package zacks.ch.pkg9;

import java.util.Random;

/**
 * @author Zachary Zoltek
 * @version 1.0
 * @since Feb 18, 2016
 */

public class SSN {
    //Random number generator that is seeded in the constructor and never changed
    private final Random rand;
    /** 
     * Constructor with no parameters.
     * Initializes our random number generator with its own default constructor
     */
    public SSN()
    {
        rand = new Random();
    }
    /** 
     * Generates a new SSN and returns it as a string
     * @return A string of a SSN in the format ###-##-####
     */
    public String generate()
    {
        return String.format("%d%d%d-%d%d-%d%d%d%d",
                rand.nextInt(10),rand.nextInt(10),rand.nextInt(10),
                rand.nextInt(10),rand.nextInt(10),
                rand.nextInt(10),rand.nextInt(10),rand.nextInt(10),rand.nextInt(10));
    }
}
