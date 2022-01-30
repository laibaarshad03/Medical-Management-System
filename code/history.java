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
public class history {
    int patientId;
    String bioData;
    String allergies;
    String socioEco;
    String familyHis;
    String drugHis;

    public history(int pId, String bioData, String allergies, String socioEco, String familyHis, String drugHis) {
        patientId = pId;
        this.bioData = bioData;
        this.allergies = allergies;
        this.socioEco = socioEco;
        this.familyHis = familyHis;
        this.drugHis = drugHis;
    }

    public history() {
    }

    public int getPatientId() {
        return patientId;
    }

    public String getBioData() {
        return bioData;
    }

    public String getAllergies() {
        return allergies;
    }

    public String getSocioEco() {
        return socioEco;
    }

    public String getFamilyHis() {
        return familyHis;
    }

    public String getDrugHis() {
        return drugHis;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public void setBioData(String bioData) {
        this.bioData = bioData;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public void setSocioEco(String socioEco) {
        this.socioEco = socioEco;
    }

    public void setFamilyHis(String familyHis) {
        this.familyHis = familyHis;
    }

    public void setDrugHis(String drugHis) {
        this.drugHis = drugHis;
    }
    
}
