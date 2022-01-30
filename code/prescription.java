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
public class prescription {
    int presId;
    int pId;
    String docname;
    String amount;
    String med;
    String test;

    public prescription(int presId, int pId, String docname, String amount, String med, String test) {
        this.presId = presId;
        this.pId = pId;
        this.docname = docname;
        this.amount = amount;
        this.med = med;
        this.test = test;
    }
    public prescription(){
        
    }

    public void setPresId(int presId) {
        this.presId = presId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public void setDocname(String docname) {
        this.docname = docname;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setMed(String med) {
        this.med = med;
    }

    public void setTest(String test) {
        this.test = test;
    }
    
    public int getPresId() {
        return presId;
    }

    public int getpId() {
        return pId;
    }

    public String getDocname() {
        return docname;
    }

    public String getAmount() {
        return amount;
    }

    public String getMed() {
        return med;
    }

    public String getTest() {
        return test;
    }
    
    
    

    
    
}
