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
public class reviews {
    String patname;
    String docname;
    String rev;

    public reviews() {
        //To change body of generated methods, choose Tools | Templates.
    }

    public void setPatname(String patname) {
        this.patname = patname;
    }

    public void setDocname(String docname) {
        this.docname = docname;
    }

    public void setRev(String rev) {
        this.rev = rev;
    }

    public reviews(String patname, String docname, String rev) {
        this.patname = patname;
        this.docname = docname;
        this.rev = rev;
    }

    public String getPatname() {
        return patname;
    }

    public String getDocname() {
        return docname;
    }

    public String getRev() {
        return rev;
    }
    
}
