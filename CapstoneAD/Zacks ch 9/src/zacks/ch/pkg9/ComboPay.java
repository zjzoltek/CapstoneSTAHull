package zacks.ch.pkg9;
import javax.swing.JComponent;
/**
 * @author Zachary Zoltek
 * @version 1.0
 * @since Feb 17, 2016
 */

public class ComboPay extends Employee {
    //Rate is what governs how much of gross sales a combopay employee gets
    private float rate;
    //Pay is the hourly wage that the combopay employee gets
    private float pay;
    /**
     * 
     * @param firstName The first name of the comboPay employee
     * Sent to the superclass' constructor
     * 
     * @param middleName The middle name of the comboPay employee.
     * Sent to the superclass' constructor
     * 
     * @param lastName The last name of the comboPay employee
     * Sent to the superclass' constructor
     * 
     * @param SSN The SSN of the combopay employee. Usually generated
     * with a SSN generator. Can be provided manually
     * 
     * @param pay The hourly wage for the combopay employee
     * 
     * @param rate The rate that determines how much an employee makes off a 
     * sale
     */
    public ComboPay(String firstName, String middleName, String lastName,
            String SSN, int pay, float rate)
    {
        //Bring the employee into existence by calling the superclass' constructor
        super(firstName,middleName,lastName,SSN);
        //Set the rate and pay to the provided params
        this.rate = rate;
        this.pay = pay;
    }
    /** 
     * Sets the rate of this employee to the param provided
     * @param rate The rate to be set
     */
    public void setRate(float rate)
    {
        //Set the rate of the employee to the param. Does a check to make
        //sure that the rate is not less than zero.
        this.rate = (rate < 0) ? 0 : rate;
    }
    /** 
     * Sets the hourly wage of the employee to the param provided
     * @param pay 
     */
    public void setPay(float pay)
    {
        //Set the pay of the employee  to the param. Does a check to make
        //sure that the pay is not less than zero
        this.pay = (pay < 0) ? 0 : pay;
    }
    /**
     * Getter to get the employee's rate
     * @return Returns the rate of this employee as a float
     */
    public float getRate()
    {
        return rate;
    }
    /**
     * Getter to get the employee's hourly wage
     * @return Returns the hourly pay of this employee as a float
     */
    public float getPay()
    {
        return pay;
    }
    /**
     * Gets the net earnings for this employee. Hours and sales provided
     * @param hours Hours is provided so we can calculate how much has been
     * earned by hourly pay
     * 
     * @param sales Sales is provided so we can determine what portion the
     * employee earned
     * 
     * @return Returns the hourly pay combined with the portion earned from
     * their sales as a float
     */
    public float netEarnings(int hours, float sales)
    {
        return (sales * rate) + (hours * pay);
    }
}
