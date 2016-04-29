package capstonezz;

import capstoneal.InspectionReport.InspectionReport;
import capstoneal.LossReduction.LossReductionForm;
import capstoneca.ViewPage;
import capstonepb.EditPage;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.ScrollPaneConstants;

/**
 * @author Zachary Zoltek
 * @version 1.0
 * @since Apr 26, 2016
 */

public class FormEntity extends JPanel {
    private final ViewPage viewer;
    private final EditPage editor;
    
    private final JTabbedPane tabber;
    private final DisabledPanel irP;
    private final DisabledPanel lrP;
    
    private final JScrollPane irScroll;
    private final JScrollPane lrScroll;
    
    private InspectionReport ir;
    private LossReductionForm lr;
    
    public FormEntity(int width, int height, String name){
        super(new CardLayout());
        viewer = new ViewPage(width, height, name);
        editor = new EditPage(width, height, name+"edit");
        tabber = new JTabbedPane();
        createIR();
        createLR();
        
        irP = new DisabledPanel(ir, CapstoneConstants.INVISIBLE);
        lrP = new DisabledPanel(lr, CapstoneConstants.INVISIBLE);
        
        irP.setEnabled(false);
        lrP.setEnabled(false);
        
        irScroll = new JScrollPane(irP, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
        ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        lrScroll = new JScrollPane(lrP, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
        ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        irScroll.getVerticalScrollBar().setUnitIncrement(12);
        lrScroll.getVerticalScrollBar().setUnitIncrement(12);
        
        tabber.add(irScroll, "Inspection Report");
        tabber.add(lrScroll, "Loss Reduction");
        viewer.add(tabber);
        add(viewer, "view");
        add(editor, "edit");
        
        ((CardLayout)getLayout()).show(this, "view");
    }
    
    public void createIR(){
        if(ir == null) ir = new InspectionReport();
    }
    
    public void createLR(){
        if(lr == null) lr = new LossReductionForm();
    }
    
    public ViewPage getViewer(){
        return viewer;
    }
    
    public EditPage getEditor(){
        return editor;
    }
    
    public JTabbedPane getTabber(){
        return tabber;
    }
    
    public DisabledPanel getIRP(){
        return irP;
    }
    
    public DisabledPanel getLRP(){
        return lrP;
    }
    
    public InspectionReport getIR(){
        return ir;
    }
    
    public LossReductionForm getLR(){
        return lr;
    }
}
