package zacks.ch.pkg9;

/**
 * @author Zachary Zoltek
 * @version 1.0
 * @since Feb 17, 2016
 */

public class Salaried extends Employee {
    //The hourly wage for this employee
    private float pay;
    /**
     * Only constructor for the salaried employee class. Requires
     * everything that our super class' constructor requires, with the addition
     * of an hourly wage (@param pay)
     * 
     * @param firstName
     * @param lastName
     * @param middleName
     * @param SSN
     * @param pay 
     */
    public Salaried(String firstName, String lastName, String middleName,
            String SSN, float pay)
    {
        //Call the super class' constructor to bring our employee into existence
        super(firstName,lastName,middleName,SSN);
        //Set the pay to the parameter given
        this.pay = pay;
    }
    /**
     * Returns the pay that this employee will have earned after
     * a provided number of hours
     * 
     * @param hours How many hours the employee has worked for
     * @return Returns a float of (this.pay * @param hours)
     */
    public float netEarnings(int hours)
    {
        return (pay * hours);
    }
    /**
     * Setter function that sets the pay amount for this class to the
     * parameter given
     * 
     * @param amt The pay amount to be set
     */
    public void setPay(int amt)
    {
        pay = amt;
    }
    /**
     * Getter function that returns the hourly pay of this employee
     * 
     * @return This employee's hourly pay as a float
     */
    public float getPay()
    {
        return pay;
    }
}
