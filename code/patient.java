/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;
import code.appointment;
import code.history;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Lara Arshad
 */
public class patient {
    int pid;
    String patientName;
    String patientPass;
    String gender;
    int age;
    String email;

//    public List<history> getHistoryList() {
//        return historyList;
//    }
    String phoneNum;
  
    //appointments obj;
 
    //
    history histobj;
    prescription psobj;

    public patient() {
    }

    public prescription getPsobj() {
        return psobj;
    }

    public void setPsobj(prescription psobj) {
        this.psobj = psobj;
    }
    
    public history getHistobj() {
        return histobj;
    }

    public void setHistobj(history histobj) {
        this.histobj = histobj;
    }
    
    public patient(int pid, String patientName, String patientPass, String gender,int age, String email, String phoneNum) {
        this.pid = pid;
        this.patientName = patientName;
        this.patientPass = patientPass;
        this.gender = gender;
        this.email = email;
        this.phoneNum = phoneNum;
        this.age = age;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setPatientPass(String patientPass) {
        this.patientPass = patientPass;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    
    public int getPid() {
        return pid;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getPatientPass() {
        return patientPass;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
    
   
    public String getPhoneNum() {
        return phoneNum;
    }

   
    public void viewPrescription()
    {
        
    }
    public void viewHistory()
    {
        
    }
    public void payBills()
    {
        
    }

    
}
