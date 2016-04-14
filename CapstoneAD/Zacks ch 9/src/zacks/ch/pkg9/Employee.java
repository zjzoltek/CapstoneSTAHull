/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zacks.ch.pkg9;

/**
 *
 * @author awdobson1129
 */
    
public abstract class Employee {
    //First name of the employee
    private final String firstName;
    //Last name of the employee
    private final String lastName;
    //Middle name of the employee
    private final String middleName;
    //SSN of the employee
    private final String socialSecurityNumber;
    /** 
     * Only constructor for the employee. The employee must have
     * a first name, middle name, last name, and SSN
     * 
     * @param firstName
     * @param lastName
     * @param middleName
     * @param SSN 
     */
    public Employee(String firstName, String lastName, String middleName,
            String SSN) 
    {
        //Set the right fields to the right parameters
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        
        socialSecurityNumber = SSN;
    }
    /**
     * Getter function that retrieves the employee's first name
     * @return The first name of the employee as a string
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * Getter function that retrieves the employee's middle name
     * @return The middle name of the employee as a string
     */
    public String getMiddleName() {
        return middleName;
    }
    /**
     * Getter function that retrieves the employee's last name
     * @return The last name of the employee as a string
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * Getter function that retrieves the employee's SSN
     * @return The SSN of the employee as a string
     */
    public String getSocial() {
        return socialSecurityNumber;
    }
    /**
     * Returns the employee's full name (first, middle, last in that order)
     * @return A string composed of the employees first name, middle name 
     * and last name
     */
    public String getFullName() {
        return String.format("%s %s %s", firstName, middleName, lastName);
    }
    /**
     * Returns a string in format "%s | %s" where the first argument is the
     * employee's full name (retrieved with getFullName()) and the second
     * argument is their SSN (retrieved with getSocial())
     * @return A string holding the employee's full name and their SSN
     */
    @Override
    public String toString()
    {
        return String.format("%s | %s", getFullName(), getSocial());
    }
    
    
}

}
