package business;

/**
 *
 * @author pradnya
 */
public class Patient {
    
    private String identifierPatient;
    private String nameDoctor;
    private String namePharmacy;
    private VitalSignHistory historyVitals;
    
    public Patient() {
        this.historyVitals = new VitalSignHistory();
    }
    
    public String getIdentifierPatient() {
        return identifierPatient;
    }
    
    public void setIdentifierPatient(String identifierPatient) {
        this.identifierPatient = identifierPatient;
    }
    
    public String getNameDoctor() {
        return nameDoctor;
    }
    
    public void setNameDoctor(String nameDoctor) {
        this.nameDoctor = nameDoctor;
    }
    
    public String getNamePharmacy() {
        return namePharmacy;
    }
    
    public void setNamePharmacy(String namePharmacy) {
        this.namePharmacy = namePharmacy;
    }
    
    public VitalSignHistory getHistoryVitals() {
        return historyVitals;
    }
    
    public void setHistoryVitals(VitalSignHistory historyVitals) {
        this.historyVitals = historyVitals;
    }
    
    @Override
    public String toString()
    {
        return String.valueOf(this.identifierPatient);
    }
}
