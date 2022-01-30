/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lara Arshad
 */
public class doctor {
    int docID;
    String docEmail;
    String docpass;
    String docName;
    String specialisation;
    String department;
    String phoneNumber;
    private List<schedule> schedList = new ArrayList<schedule>();

    public doctor() {
    }

    public List<schedule> getSchedList() {
        return schedList;
    }
    
    public void setSchedList(List<schedule> schedList) {
        this.schedList = schedList;
    }

    public int getDocID() {
        return docID;
    }

    public void setDocID(int docID) {
        this.docID = docID;
    }

    public String getDocEmail() {
        return docEmail;
    }

    public void setDocEmail(String docEmail) {
        this.docEmail = docEmail;
    }

    public String getDocpass() {
        return docpass;
    }

    public void setDocpass(String docpass) {
        this.docpass = docpass;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public String getDept()
    {
        return department;
    }
    public String getName()
    {
        return docName;
    }
    public String getSpec()
    {
        return specialisation;
    }
     public String getEmail()
    {
        return docEmail;
    }
      public String getPhone()
    {
        return phoneNumber;
    }
    public doctor(int docID, String docEmail, String docpass, String docName, String specialisation, String department, String phoneNumber) {
        this.docID = docID;
        this.docEmail = docEmail;
        this.docpass = docpass;
        this.docName = docName;
        this.specialisation = specialisation;
        this.department = department;
        this.phoneNumber = phoneNumber;
    }
    void checkHistory()
    {
        
    }
    void prescribeMedicine()
    {
    
    }
}
