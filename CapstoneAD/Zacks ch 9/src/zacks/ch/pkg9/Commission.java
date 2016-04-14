package zacks.ch.pkg9;

/**
 * @author Zachary Zoltek
 * @version 1.0
 * @since Feb 17, 2016
 */

public class Commission extends Employee {
    //The percentage of sales that this employee will take home
    float rate;
    /**
     * Only constructor for the commissioned employee class. Takes all the
     * parameters needed to call our super class' constructor, with the 
     * addition of their rate
     * 
     * @param firstName
     * @param lastName
     * @param middleName
     * @param social
     * @param rate Rate should be a percent in decimal form and should be a 
     * float
     */
    public Commission(String firstName, String lastName, String middleName,
            String social, float rate)
    {
        //Call the super class' constructor to bring this employee into
        //existence
        super(firstName,lastName,middleName,social);
        //Set the rate to the provided parameter
        this.rate = rate;
    }
    /**
     * Setter function that sets the rate of this employee to the parameter
     * provided
     * @param rate MUST BE A PERCENT IN DECIMAL FORM 
     */
    public void setRate(float rate)
    {
        //Rate is checked to be >=0 to prevent logical errors in computing
        //net earnings
        this.rate = (rate >= 0) ? rate : 0;
    }
    /**
     * Getter function that returns the current rate of return for this 
     * employee
     * @return The rate of return for this employee as a float
     */
    public float getRate()
    {
        return rate;
    }
    /**
     * Computes the net earnings for this employee with the calculation of
     * (@param gross * rate)
     * 
     * @param gross The gross pay made by this employee (in currency)
     * @return Returns the employee's earnings as a float with (gross * rate)
     */
    public float netEarnings(float gross)
    {
       return (gross * rate);
    }
}
