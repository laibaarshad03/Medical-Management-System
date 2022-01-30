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
public class MedicalSystem {
     private List<patient> patientList = new ArrayList<patient>();
     private List<doctor> doctorList = new ArrayList<doctor>();
     private List<history> historyList = new ArrayList<history>();
     private List<appointment> appointList = new ArrayList<appointment>();
     private List<prescription> prescList = new ArrayList<prescription>();
     private List<schedule> schedList = new ArrayList<schedule>();
     private List<bills> billList = new ArrayList<bills>();
     private List<reviews> revList = new ArrayList<reviews>();
     private String[] Departments = {"Orthopaedics", "E N T", "Gynaecology & Obstetrics", "Psychiatry", "Dental Surgery", "Chest & Vascular", "Anesthetics"};
     private admin adminObj;
     private int patientCount;
     private int revCount;
     private int billCount;
     private int deptCount;
     private int doctorCount;
     private int histCount;
     private int psCount;
     private int appointCount;
     private int schCount;
    public List<reviews> getRevList() {
        return revList;
    }
    public void setRevList(List<reviews> revList) {
        this.revList = revList;
    }
    public void setRevCount(int revCount) {
        this.revCount = revCount;
    }

    public int getRevCount() {
        return revCount;
    }
    public List<bills> getBillList() {
        return billList;
    }

    public void setBillList(List<bills> billList) {
        this.billList = billList;
    }

    public int getBillCount() {
        return billCount;
    }

   

    public void setBillCount(int billCount) {
        this.billCount = billCount;
    }
     
     
    public void setDepartments(String[] Departments) {
        this.Departments = Departments;
    }

    public List<schedule> getSchedList() {
        return schedList;
    }

    public void setSchedList(List<schedule> schedList) {
        this.schedList = schedList;
    }

    public int getSchCount() {
        return schCount;
    }

    public void setSchCount(int schCount) {
        this.schCount = schCount;
    }
     
     
    public int getAppointCount() {
        return appointCount;
    }

    public void setAppointCount(int appointCount) {
        this.appointCount = appointCount;
    }

    public List<appointment> getAppointList() {
        return appointList;
    }

    public void setAppointList(List<appointment> appointList) {
        this.appointList = appointList;
    }

    public void setAdminObj(admin adminObj) {
        this.adminObj = adminObj;
    }

    public admin getAdminObj() {
        return adminObj;
    }
     
    public String getPatientname(int pid)
    {
         int i=0;
        for(;i<patientList.size();i++)
        {
            if(patientList.get(i).getPid()==pid)
            {
                break;
            }
        }
        
       return patientList.get(i).getPatientName(); 
    }
    
    public int getPsCount() {
        return psCount;
    }

    public void setPsCount(int psCount) {
        this.psCount = psCount;
    }
     
    public List<prescription> getPrescList() {
        return prescList;
    }

    public void setPrescList(List<prescription> prescList) {
        this.prescList = prescList;
    }
     
    public void setHistoryList(List<history> historyList) {
        this.historyList = historyList;
    }

    public void setHistCount(int histCount) {
        this.histCount = histCount;
    }
     
    public List<history> getHistoryList() {
        return historyList;
    }

    public int getPatientCount() {
        return patientCount;
    }

    public int getDeptCount() {
        return deptCount;
    }

    public int getDoctorCount() {
        return doctorCount;
    }

    public int getHistCount() {
        return histCount;
    }
     
     public String[] getDepartments(){
        return Departments;
    }
    public int departmentCount() {
        return deptCount;
    }
     //patient
    public List<patient> getPatientList() {
        return patientList;
    }
    public void setPatient(List<patient> pList) {
        this.patientList= pList;
    }
    public int patientCount() {
        return patientCount;
    }
    public void setPatientcounter(int billcounter) {
        this.patientCount = billcounter;
    }
    
    //doctor
    public void setDoctor(List<doctor> dList) {
        this.doctorList= dList;
    }
    public int doctorCount() {
        return doctorCount;
    }
    public List<doctor> getDoctorList() {
        return doctorList;
    }
     public void setDoctorcounter(int dcounter) {
        this.doctorCount = dcounter;
    }

    
   
}
