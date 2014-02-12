/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sales.statefullsessionbeans;


import com.sales.entities.Airfar;
import com.sales.entities.Customer;
import com.sales.entities.Roomtypelist;
import com.sales.entities.RoomtypelistPK;
import com.sales.sessionbeans.CustomerFacade;
import com.sales.sessionbeans.PayementsFacade;
import com.sales.sessionbeans.ServicesFacade;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author steve
 */
@Stateful
public class PanierBean implements PanierBeanLocal {

 @EJB
    private ServicesFacade servicesFacade;
    @EJB private CustomerFacade customerfacade;
    @EJB private PayementsFacade payements;
    private static BigDecimal IDCustomerloged ;
    private static BigDecimal serv_hotel;
    private static BigDecimal serv_fligh;
    private RoomtypelistPK roomtypekey;
    private ArrayList <Roomtypelist> liste_hotels;
    private ArrayList<Airfar> liste_vols;
    private  double totalmontant=0.0;
@PersistenceContext(unitName = "com.sales_Travels-ejb_ejb_1.0PU")
    private EntityManager em;
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public PanierBean() {
        IDCustomerloged=null;
    }
    

public PanierBean(String user_connected){
    IDCustomerloged=customerfacade.findIDByEmail(user_connected);
}

    @PostConstruct 
    public void initialiserTable(){
        liste_hotels=new ArrayList<Roomtypelist>();
        
        liste_vols=new ArrayList<Airfar>();
        serv_hotel=new BigDecimal(2);
        serv_fligh=new BigDecimal(1);
    }
    
    
    public void takevalue(){
        Roomtypelist ls = null;
        BigInteger eanhotelid = ls.getRoomtypelistPK().getEanhotelid();
    }
    

    @Override
    public void addtoCart(BigDecimal serviceId,Object ajout) {
        if(serviceId.equals(serv_hotel)){
            Roomtypelist val=(Roomtypelist)ajout;
            getListe_hotels().add(val);
        }
        if(serviceId.equals(serv_fligh)){
            Airfar val=(Airfar)ajout;
            liste_vols.add(val);
        }
    }
    

    @Override
    public void removefromCart(BigDecimal serviceId,int index) {
        if(serviceId.equals(serv_hotel)){
            liste_hotels.remove(index);
        }
        if(serviceId.equals(serv_fligh)){
            liste_vols.remove(index);
        }
    }

    @Override
    public void showelemofCart() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void makeorders() {
        
    }

    /**
     * @return the liste_hotels
     */
    public ArrayList <Roomtypelist> getListe_hotels() {
        return liste_hotels;
    }

    /**
     * @return the liste_vols
     */
    public ArrayList<Airfar> getListe_vols() {
        return liste_vols;
    }

    @Override
    public double getMontantTotal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void viderPanier() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 @Override
        public List ShowHistoBooking(Customer u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
