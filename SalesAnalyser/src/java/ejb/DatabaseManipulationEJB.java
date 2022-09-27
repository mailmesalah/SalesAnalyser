/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entities.AgencyEntity;
import entities.ChannelEntity;
import entities.CustomerEntity;
import entities.NewEntity;
import entities.ProductEntity;
import entities.PromotionEntity;
import entities.SaleEntity;
import java.util.Iterator;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author Sely
 */
@Stateless
public class DatabaseManipulationEJB {
    @PersistenceContext(unitName = "SalesAnalyserPU")
    private EntityManager em;

    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    

    public DatabaseManipulationEJB() {
    }

    public DatabaseManipulationEJB(EntityManager em) {
        this.em = em;
    }
    
    /***
     *  Saves Objects to database 
     */
    
    public void addAgency(AgencyEntity ob){
        em.persist(ob);
    }
    
    public void addChannel(ChannelEntity ob){
        em.persist(ob);
    }
    
    public void addCustomer(CustomerEntity ob){
        em.persist(ob);
    }
    
    public void addProduct(ProductEntity ob){
        em.persist(ob);
    }
    
    public void addPromotion(PromotionEntity ob){
        em.persist(ob);
    }
    
    public void addSale(SaleEntity ob){
        em.persist(ob);
    }
    
    /**
     * 
     *   Adds List of Objects to database
     */
    public void addAgencyList(List <AgencyEntity> ob){
        Iterator it=ob.iterator();
       
        while(it.hasNext()){
            em.persist(it.next());
        }        
    }
    
    public void addChannelList(List <ChannelEntity> ob){
        Iterator it=ob.iterator();
       
        while(it.hasNext()){
            em.persist(it.next());
        }
    }
    
    public void addCustomerList(List <CustomerEntity> ob){
        Iterator it=ob.iterator();
       
        while(it.hasNext()){
            em.persist(it.next());
        }
    }
    
    public void addProductList(List <ProductEntity> ob){
        Iterator it=ob.iterator();
       
        while(it.hasNext()){
            em.persist(it.next());
        }
    }
    
    public void addPromotionList(List <PromotionEntity> ob){
        Iterator it=ob.iterator();
       
        while(it.hasNext()){
            em.persist(it.next());
        }
    }
    
    public void addSaleList(List <SaleEntity> ob){
        Iterator it=ob.iterator();
       
        while(it.hasNext()){
            em.persist(it.next());
        }
    }
    
    public void addNewEntity(NewEntity ne){
        try{
            System.out.println(em==null);
            em.persist(ne);
        }catch(Exception e){
            StackTraceElement[] stackTrace = e.getStackTrace();            
                                    
                System.out.println("hellooooo");
                
        }
                                   
    }

    public void persist(Object object) {
        em.persist(object);
    }


}
