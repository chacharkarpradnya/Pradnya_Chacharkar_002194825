/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

package business;

/**
 *
 * @author pradnya
 */
public class Person {
    private String personsName;
    private int personsAge;
    private Patient patient;
    
    public String getPersonsName() {
        return personsName;
    }
    
    public void setPersonsName(String personsName) {
        this.personsName = personsName;
    }
    
    public int getPersonsAge() {
        return personsAge;
    }
    
    public void setPersonsAge(int personsAge) {
        this.personsAge = personsAge;
    }
    
    public Patient getPatient() {
        return patient;
    }
    
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    @Override
    public String toString()
    {
        return this.personsName;
    }
}
