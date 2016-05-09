package capstonezz.Threading;

import capstonezz.Database.Contact;
import capstonezz.GUI.ResultElement;
import capstonezz.GUI.SearchBox;
import capstonezz.GUI.SearchResultsGUI;
import capstonezz.GUI.SearchResults;
import capstonezz.Util;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 * @author Zachary Zoltek
 * @version 1.0
 * @since Apr 10, 2016
 */

public class SearchTask implements Runnable {
    private final SearchResults searchresults;
    private final SearchResultsGUI gui;
    private final ExecutorService pool;
    
    private final EntityManagerFactory emFactoryContact = Persistence.createEntityManagerFactory("LSFDPU");

    private final EntityManager em = emFactoryContact.createEntityManager();

    private List<Contact> results;
   
    public SearchTask(SearchResults searchresults, SearchResultsGUI gui){
        this.searchresults = searchresults;
        this.gui = gui;
        pool = Executors.newFixedThreadPool(1);
        execute();
    }
    
    private void execute(){
        searchresults.clearResults();
        searchresults.removeAll();
        searchresults.revalidate();
        gui.displayLoadingBar(true);
        pool.execute(this);
    }
    
    @Override
    public void run() {
        SearchBox addressB = gui.getAddressBox();
        SearchBox numberB = gui.getNumberBox();
        
        boolean both = numberB.isPopulatedNoNull() && addressB.isPopulatedNoNull();
        boolean address = addressB.isPopulatedNoNull();
        boolean number = numberB.isPopulatedNoNull();
        boolean neither = addressB.isPopulatedNoNull() || numberB.isPopulatedNoNull();
        
        TypedQuery<Contact> query;
        
        if(both){
            query = em.createNamedQuery("Contact.findByNameID", Contact.class);
            
            query.setParameter("address", Util.SQLStartsWith(addressB.getText()));
            query.setParameter("propertyID", Integer.parseInt(numberB.getText()));
            
            results = query.getResultList();
            if(results.isEmpty()){
                searchresults.addResult(new ResultElement("No results found", "Sorry : (", gui.getBackground(), false));
            } else {
                results.stream().forEach((_item) -> {
                    searchresults.addResult(new ResultElement(_item.getBusiness().getBusinessPK().getSName(), 
                            String.valueOf(_item.getBusiness().getProperty().getPropertyID()),
                    gui.getBackground(), true));
                });
            }
        } else {
            if(address){
                query = em.createNamedQuery("Contact.findByAddress", Contact.class);
                
                query.setParameter("address", Util.SQLStartsWith(addressB.getText()));
                
                results = query.getResultList();
                
                if(results.isEmpty()){
                    searchresults.addResult(new ResultElement("No results found", "Sorry : (", gui.getBackground(), false));
                } else {
                    results.stream().forEach((_item) -> {
                        searchresults.addResult(new ResultElement(_item.getAddress(), 
                            String.valueOf(_item.getContactPK().getPropertyID()),
                        gui.getBackground(), true));
                    });
                }
            } else if(number){
                query = em.createNamedQuery("Contact.findByPropertyID", Contact.class);
                
                query.setParameter("propertyID", Integer.parseInt(numberB.getText()));
                
                results = query.getResultList();
                
                if(results.isEmpty()){
                    searchresults.addResult(new ResultElement("No results found", "Sorry : (", gui.getBackground(), false));
                } else {
                    results.stream().forEach((_item) -> {
                        searchresults.addResult(new ResultElement(_item.getAddress(), 
                            String.valueOf(_item.getContactPK().getPropertyID()),
                        gui.getBackground(), true));
                    });
                }
            } else if(neither){
                //Do nothing...?
            } else {
                //uhhhh......
                System.err.println("LINE 112 | CLASS SearchTask | PACKAGE capstonezz.database \n\n"
                        + "MESSAGE: Shouldn't have reached this point in the code. \n\n This means that "
                        + "the user failed all four checks (entered both number and address, "
                        + "entered only address, entered only number, or neither) \n\n"
                        + "Please detail how . . . \n\n - Zachary Zoltek");
            }
        }
        
        gui.displayLoadingBar(false);
        searchresults.revalidate();
    }
    
}



