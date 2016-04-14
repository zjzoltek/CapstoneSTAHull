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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.out;

public class ZacksCh9 {

 


/**
 * @author Zachary Zoltek
 * @version 1.0
 * @since Feb 17, 2016
 */


    public static void main(String[] args)
    {
        //Arrays of names to construct our snack bar team with
        final String[] firstNames = { "Jane", "Lane", "Shame", "Mayne" };
        final String[] middleNames = { "Shawn", "Crawn", "Bawn", "Pawn" };
        final String[] lastNames = { "Shelly", "Nelly", "Kelly", "Belly" };
        //SSN generator to be used for every employee
        SSN ssn = new SSN();
        //Constructing our manager
        final ComboPay Manager1 = new ComboPay("Jason", "Dollars", "Bankman",
        ssn.generate(), 10, .05f);
        
        final ComboPay Manager2 = new ComboPay("Will", "William", "Willhelm",
        ssn.generate(), 10, .05f);
        //Array to hold the snack bar team 
        Commission[] SBT = new Commission[4];
        //Construct each snack bar team member. Our firstNames, middleNames,
        //and lastNames arrays are utilized here
        for(int i = 0; i < 4; i++)
        {
            SBT[i] = new Commission(firstNames[i],lastNames[i],middleNames[i],
            ssn.generate(), .08f);
        }
        
        //The 'main guy' is constructed here
        Salaried mainGuy = new Salaried("John", "Smith", "Dick", ssn.generate(),
        9f);
        //try-with-resources in which we create a buffered reader to get input
        //from the console
        try( 
                BufferedReader in = new BufferedReader(new InputStreamReader(
                System.in));
            ) 
        {  
            //Temp variable to hold user's input
            String temp;
            //************************************************************************
            //MANAGER1
            
            //Output who we are getting sales for
            out.println(
            String.format("Please enter the sales amount (USD) for %s (Manager #1):", 
                    Manager1.toString()));
            //Read in user input (takes in a whole line)
            temp = in.readLine();
            //Output the weeks earnings using the class' 'netEarnings' method
            out.println(String.format("%s's pay this week will be: $%f",
                    Manager1.toString(), Manager1.netEarnings(40, Float.parseFloat(temp))));
            
            //All employees are done the same way.
            
            //************************************************************************
            //MANAGER2
            out.println(
            String.format("%nPlease enter the sales amount (USD) for %s (Manager #2):",
                    Manager2.toString()));
            
            temp = in.readLine();
            
            out.println(String.format("%s's pay this week will be: $%f",
                    Manager2.toString(), Manager2.netEarnings(40, Float.parseFloat(temp))));
            //************************************************************************
            //SNACK BAR EMPLOYEES
            for(int i = 0; i < SBT.length; i++)
            {
                out.println(
                String.format("%nPlease enter the sales amount (USD) for %s (SBT Employee #%d):",
                        SBT[i].toString(), i+1));

                temp = in.readLine();

                out.println(String.format("%s's pay this week will be: $%f",
                        SBT[i].toString(), SBT[i].netEarnings(Float.parseFloat(temp))));
            }
            //************************************************************************
            //SMITTYWEBERMANJENSEN (HE WAS NUMBER ONE!)   
            out.println(
                String.format("%nPlease enter the hours worked for %s (Main Guy):",
                        mainGuy.toString()));

                temp = in.readLine();

                out.println(String.format("%s's pay this week will be: $%f",
                        mainGuy.toString(), mainGuy.netEarnings(Integer.parseInt(temp))));
            
            
            in.close(); //Close the reader 
        }
            

        catch (IOException e) { //If we get an ioexception, we can't recover
                                //so we throw a runtime exception
            throw new RuntimeException(e);
        }
       
        
        
    }
}
