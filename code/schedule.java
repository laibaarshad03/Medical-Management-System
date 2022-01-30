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
public class schedule {
    int schId;
    int docId;
    String time;
    String status;

    public schedule(int schId,int docId, String time, String status) {
        this.schId=schId;
        this.docId = docId;
        this.time = time;
        this.status = status;
    }

    public schedule() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void setobj(schedule obj)
    {
        this.schId=obj.schId;
        this.docId = obj.docId;
        this.time = obj.time;
        this.status = obj.status;
    }

    public void setSchId(int schId) {
        this.schId = schId;
    }
    
    public int getDocId() {
        return docId;
    }

    public void setDocId(int docId) {
        this.docId = docId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    public void changeStatus(){
        
    }

    public int getSchId() {
        return schId;
    }

   
}
