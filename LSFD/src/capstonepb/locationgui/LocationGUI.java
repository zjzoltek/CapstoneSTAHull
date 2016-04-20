/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capstonepb.locationgui;

//package components;
 
//import javax.rmi.CORBA.Util;
import capstonezz.Util;
import javax.swing.*;
 

public class LocationGUI{
     
    public static void main(String[] args){
        JFrame frame = new JFrame();
        
        LocationDropDown doop = new LocationDropDown();
        
        frame.setSize(Util.getScreenDimension());
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(doop);
        frame.setVisible(true);
                
    }
    
}
