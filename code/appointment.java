/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;
import java.time.LocalTime;
import java.time.LocalDate;
/**
 *
 * @author Lara Arshad
 */
public class appointment {
    int appointId;
    int token;
    int patientId;
    String Docname;
    LocalTime time;
    LocalDate date;
    String Time;
    
    public appointment()
    {
        
    }

    public appointment(int appointId,int token, int patientId, String Docname, String time) {
        this.appointId=appointId;
        this.token = token;
        this.patientId = patientId;
        this.Docname = Docname;
        this.Time = time;
        
    }
    
    public int getAppointId() {
        return appointId;
    }
    public int setAppointId(int appointId) {
        return this.appointId=appointId;
    }
    public String getTime() {
        return Time;
    }
    public int getToken() {
        return token;
    }
    public int getPatientId() {
        return patientId;
    }
    public String getDocname() {
        return Docname;
    }
    
    public void setToken(int token) {
        this.token = token;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public void setDocname(String Docname) {
        this.Docname = Docname;
    }

    public void setTime(String time) {
        this.Time = time;
    }

    
    
    
    
    public void bookAppoint()
    {
        
    }
}
