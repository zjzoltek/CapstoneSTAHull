package capstonezz;

import capstoneal.InspectionReport.InspectionReport;
import capstoneal.LossReduction.LossReductionForm;
import capstonelh.ComponentKeys;
import capstonelh.IRSection;
import java.awt.Component;
import java.awt.Container;

/**
 * @author Zachary Zoltek
 * @version 1.0
 * @since Apr 27, 2016
 */

public class ComponentGrabber {
    private final FormEntity fe;
    
    public ComponentGrabber(FormEntity fe){
        this.fe = fe;
    }
    
    public static Component getComponent(ComponentKeys key, Container container){
        Component components[] = container.getComponents();
        int value = key.getValue();
        
        Component component = null;
        
        for (Component c : components) {
            if (Integer.parseInt(c.getName()) == value) {
                component = c;
                break;
            }
        }
        
        return component;
    }
    
    public Component getComponent(ComponentKeys key){
        int value = key.getValue();
        
        InspectionReport ir = fe.getIR();
        LossReductionForm lr = fe.getLR();
        
        Container[] irContainers = new Container[]{
            ir.getAllContact(),
            ir.getCommentsInspection(),
            ir.getEmergencyContact(),
            ir.getNumberedFieldArea(),
        };
        
        IRSection[] irSections = ir.getNumberedFieldArea().getIRSections();
        
        Container[] lrContainers = new Container[]{
            lr.getEmergencyContact(),
            lr.getLRBusiness(),
            lr.getLRMisc(),
            lr.getSFLRTType(),
            lr.getLRNotes(),
        };
        
        for (Container irContainer : irContainers) {
            for(Component c : irContainer.getComponents()){
                if(Integer.parseInt(c.getName()) == value){
                    return c;
                }
            }
        }
        
        for (Container lrContainer : lrContainers) {
            for(Component c : lrContainer.getComponents()){
                if(Integer.parseInt(c.getName()) == value){
                    return c;
                }
            }
        }
        
        for (IRSection irSection : irSections) {
            for(Component c : irSection.getComponents()){
                if(Integer.parseInt(c.getName()) == value){
                    return c;
                }
            }
        }
        
        return null;
    }
}
