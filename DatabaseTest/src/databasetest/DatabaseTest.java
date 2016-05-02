/**
 * DatabaseTest:
 * @author Lucas Hall
 * @version May 2, 2016
 */

package databasetest;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DatabaseTest 
{
    public static void main(String[] args)
    {
        final String DATABASE_URL = "jdbc:mysql://localhost:3306/lsfd?zeroDateTimeBehavior=convertToNull";
        final String SELECT_QUERY = 
               "SELECT zp.zipcode,zp.city,zp.state "+
               "FROM zipcode_table AS zp ";
                
        
        try(
            Connection connection = DriverManager.getConnection 
               (DATABASE_URL, "root", "yoast");

          Statement statement = connection.createStatement();
          ResultSet resultSet = statement.executeQuery(SELECT_QUERY))
          {
              ResultSetMetaData metaData = resultSet.getMetaData();
              int numberOfColumns = metaData.getColumnCount();
              
              System.out.printf("Values in Zip Code Table from lsfd042716: %n%n");
              
              for (int i = 1; i<=numberOfColumns; i++)
                  System.out.printf ("%-8s\t", metaData.getColumnName(i));
              System.out.println();
              
              while (resultSet.next())
              {
              for (int i = 1; i<=numberOfColumns; i++)
                  System.out.printf ("%-8s\t", resultSet.getObject(i));
              System.out.println();
              }
          }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }


    }

}
