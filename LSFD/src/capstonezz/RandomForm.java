package capstonezz;

import capstoneal.InspectionReport.InspectionReport;
import capstoneal.LossReduction.LossReductionForm;

/**
 * @author Zachary Zoltek
 * @version 1.0
 * @since Apr 27, 2016
 */

public abstract class RandomForm {
    public InspectionReport createIR(){
        InspectionReport ir = new InspectionReport();
        
        return ir;
    }
    
    public LossReductionForm createLR(){
        LossReductionForm lr = new LossReductionForm();
        
        return lr;
    }
}
