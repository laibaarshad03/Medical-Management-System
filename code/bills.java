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
public class bills {
    int billId;
    String address;
    String CRC;
    String amount;
    int pid; 
    int pin;
    //int billId, , int pid, String address, String CRC,int pin, String amount

    public bills(int billId, int pid, String address, String CRC,int pin, String amount) {
        this.billId = billId;
        this.address = address;
        this.CRC = CRC;
        this.amount = amount;
        this.pid = pid;
        this.pin = pin;
    }

    public bills() {
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCRC() {
        return CRC;
    }

    public void setCRC(String CRC) {
        this.CRC = CRC;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
    
    
}
