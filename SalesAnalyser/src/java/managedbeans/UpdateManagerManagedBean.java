/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import ejb.UpdateEJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;

/**
 *
 * @author Sely
 */
@ManagedBean
@ApplicationScoped
public class UpdateManagerManagedBean {

    /**
     * Creates a new instance of UpdateManagerManagedBean
     */
    
    private UpdateEJB update=new UpdateEJB();
    public UpdateManagerManagedBean() {
    }
    
    public String updateData(){
        return "Hello Testing";
    }
    
}
