/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

/**
 *
 * @author Lara Arshad
 */
import java.util.*;
public class admin {
    
    private List<bills> bill = new ArrayList<bills>();
    //private List<appointments> appointList = new ArrayList<appointments>();
    
    private int billcount;
    private int appointcount;

    int adminID;
    String adminEmail;
    String password;
    String adminName;
    
    //getters ad setters of bills
    public List<bills> getBills() {
        return bill;
    }

    public void setBills(List<bills> billList) {
        this.bill = billList;
    }
    public int getBillcounter() {
        return billcount;
    }
    public void setBillcounter(int billcounter) {
        this.billcount = billcounter;
    }
    
    
    //getter and setter of appointments
    
    public int getAppointCount() {
        return appointcount;
    }
    public void setAppointcounter(int Acounter) {
        this.appointcount = Acounter;
    }

    
    public admin(int adminID, String adminEmail, String password) {
        this.adminID = adminID;
        this.adminEmail = adminEmail;
        this.password = password;
    }

   
    public void approveRequests()
    {
        
    }
    public int generateBills()
    {
       return 0;
    }
    public void enrollDoctor()
    {
        
    }
}
